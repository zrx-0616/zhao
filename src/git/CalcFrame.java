package git;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
 
public class CalcFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextField showView = null;
	private NumberBtnActionListener numberBtnActionListener;
	private LogicBtnActionListener logicBtnActionListener;
	private String logic;//��¼��������ַ���
	private String content1 = "";//��¼��һ�����ֵ��ַ���
	private String content2 = "";//��¼�ڶ������ֵ��ַ���
	
	
	/**
	 * һЩ���ڵĳ�ʼ������,���빹������(��װ˼��)
	 */
	public CalcFrame() {
		//���ڱ���
		//˼��: ���÷���ʱû�ж���������  ��ô����??
		setTitle("java������");
		//����λ�úʹ�С
		//��Ҫע�����  ������������������  ��������ĸ�λ�ó���
		setBounds(300,150,220, 320);
		//���ô������Ͻ� �رհ�ť���¼�
		//���ʱ�ر�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ܸı��С
		setResizable(false);
		
		//���ô��ڲ���Ϊnull  �����ô��ڲ���
		setLayout(null);
		/**
		 * �ص�: ���÷���,�������������ʾ��
		 */
		addView();
		
		/**
		 * �ص�:���÷���,����������Ӱ�ť
		 */
		addButton();
		
		//���󴴽����ʱ,��ʾ����
		setVisible(true);
	}
	/**
	 * ��������Ӱ�ť�ķ���
	 */
	private void addButton() {
		numberBtnActionListener = new NumberBtnActionListener();
		logicBtnActionListener = new LogicBtnActionListener();
		JButton button_7 = new JButton("7");
		button_7.setBounds(5,65,40,40);
		//���ð�ť�߿�Ϊ ǳ��ɫ ���Ϊ1
		button_7.setBorder(new LineBorder(Color.lightGray,1));
		button_7.addActionListener(numberBtnActionListener);
		add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(60,65,40,40);
		button_8.setBorder(new LineBorder(Color.lightGray,1));
		button_8.addActionListener(numberBtnActionListener);
		add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(115,65,40,40);
		button_9.setBorder(new LineBorder(Color.lightGray,1));
		button_9.addActionListener(numberBtnActionListener);
		add(button_9);
		
		JButton button_add = new JButton("+");
		button_add.setBounds(170,65,40,40);
		button_add.setBorder(new LineBorder(Color.lightGray,1));
		button_add.addActionListener(logicBtnActionListener);
		add(button_add);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(5,120,40,40);
		//���ð�ť�߿�Ϊ ǳ��ɫ ���Ϊ1
		button_4.setBorder(new LineBorder(Color.lightGray,1));
		button_4.addActionListener(numberBtnActionListener);
		add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(60,120,40,40);
		button_5.setBorder(new LineBorder(Color.lightGray,1));
		button_5.addActionListener(numberBtnActionListener);
		add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(115,120,40,40);
		button_6.setBorder(new LineBorder(Color.lightGray,1));
		button_6.addActionListener(numberBtnActionListener);
		add(button_6);
		
		JButton button_sub = new JButton("-");
		button_sub.setBounds(170,120,40,40);
		button_sub.setBorder(new LineBorder(Color.lightGray,1));
		button_sub.addActionListener(logicBtnActionListener);
		add(button_sub);
		
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(5,175,40,40);
		//���ð�ť�߿�Ϊ ǳ��ɫ ���Ϊ1
		button_1.setBorder(new LineBorder(Color.lightGray,1));
		button_1.addActionListener(numberBtnActionListener);
		add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(60,175,40,40);
		button_2.setBorder(new LineBorder(Color.lightGray,1));
		button_2.addActionListener(numberBtnActionListener);
		add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(115,175,40,40);
		button_3.setBorder(new LineBorder(Color.lightGray,1));
		button_3.addActionListener(numberBtnActionListener);
		add(button_3);
		
		JButton button_mul = new JButton("*");
		button_mul.setBounds(170,175,40,40);
		button_mul.setBorder(new LineBorder(Color.lightGray,1));
		button_mul.addActionListener(logicBtnActionListener);
		add(button_mul);
		
		
		JButton button_0 = new JButton("0");
		button_0.setBounds(5,230,40,40);
		//���ð�ť�߿�Ϊ ǳ��ɫ ���Ϊ1
		button_0.setBorder(new LineBorder(Color.lightGray,1));
		button_0.addActionListener(numberBtnActionListener);
		add(button_0);
		
		JButton button_eq = new JButton("=");
		button_eq.setBounds(60,230,40,40);
		button_eq.setBorder(new LineBorder(Color.lightGray,1));
		button_eq.addActionListener(new EqBtnActionListener());
		add(button_eq);
		
		JButton button_c = new JButton("c");
		button_c.setBounds(115,230,40,40);
		button_c.setBorder(new LineBorder(Color.lightGray,1));
		button_c.addActionListener(new CleanBtnActionListener());
		add(button_c);
		
		JButton button_div = new JButton("/");
		button_div.setBounds(170,230,40,40);
		button_div.setBorder(new LineBorder(Color.lightGray,1));
		button_div.addActionListener(logicBtnActionListener);
		add(button_div);
		
		
	}
	/**
	 * �����������ʾ��ķ���  
	 */
	private void addView() {
		//�������ʾ��  ֻ���༭��  Ĭ����ʾ0  ����ֱ���ڹ������� ����0  ע�� ��������ַ���������ʾ
		//����ʹ�ó�Ա������ԭ����:�ڰ�ť���¼�����������Ҫʹ����ʾ�����,����ʹ�ó�Ա���������������ʾ��,�����������ܷ���
		showView = new JTextField("0");
		//��Ҫע��,���������������ڴ����ڲ�,�����������档
		showView.setBounds(5, 5, 205, 55);
		showView.setHorizontalAlignment(JTextField.RIGHT);
		//�����Ƿ�ɱ༭  ����ֻ��
		showView.setEditable(false);
		//���ñ���ɫ
		showView.setBackground(new Color(192, 192, 192));
		//�������� ��ϸ ��С
		showView.setFont(new Font("Cambria", Font.BOLD, 16));
		add(showView);
	}
	public static void main(String[] args) {
		new CalcFrame();
	}
	class NumberBtnActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			//2.��ȡ��ť����
			JButton btn = (JButton)e.getSource();
			String btn_text = btn.getText();
			if (logic!=null&&!"".equals(logic)) {
				//3.ƴ���ַ���
				content2=content2+btn_text;
				//4.ת��Ϊ����
				int number = Integer.valueOf(content2);
				//5.���õ���ʾ��
				showView.setText(number+"");
			}else {
				//3.ƴ���ַ���
				content1=content1+btn_text;
				//4.ת��Ϊ����
				int number = Integer.valueOf(content1);
				//5.���õ���ʾ��
				showView.setText(number+"");
			}
		}
		
	}
	/**
	 * ��հ�ť�¼�������
	 * 1.������ʾ������Ϊ��
	 * 2.��������ַ���
	 * 3.���������ַ���
	 */
	class CleanBtnActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//1.������ʾ������Ϊ��
			showView.setText("0");
			//2.��ղ���
			content1 = "";
			content2 = "";
			logic = "";
		}
		
	}
	
	/**
	 * �������ť�¼�������
	 * 
	 * ����������ť���жϼ�����ǰ���������ֵ��ٽ�㣨�ٽ������
	 * Ҳ����˵,����������ť��,��Ҫ�����������,�����ְ�ť���������ж�
	 * 1.��ȡ���������
	 * 2.���浽��Ա������(ΪʲôҪ���浽��Ա������)
	 */
	class LogicBtnActionListener implements ActionListener{
 
		public void actionPerformed(ActionEvent e) {
			//1.��ȡ���������
			JButton btn = (JButton)e.getSource();
			String logic = btn.getText();
			//2.���浽��Ա������  ��Ϊ��Ա����������ֲ�����������ͬ,��this������ǵ�ǰ����������,����ʹ��CalcFrame��this
			CalcFrame.this.logic = logic;
		}
		
	}
	class EqBtnActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (content1!=null&&!"".equals(content1)&&content2!=null&&!"".equals(content2)&&logic!=null&&!"".equals(logic)) {
				//1.�������ַ���1ת��Ϊ����
				Integer number1 = Integer.valueOf(content1);
				//2.�������ַ���2ת��Ϊ����
				Integer number2 = Integer.valueOf(content2);
				//3.�ж������
				String content = "";
				switch (logic) {
				case "+":
					content = (number1+number2)+"";
					break;
				case "-":
					content = (number1-number2)+"";
					break;
				case "*":
					content = (number1*number2)+"";
					break;
				case "/":
					content = (new Double(number1)/new Double(number2))+"";
					break;
				default:
					break;
				}
				//4.��ʾ����ʾ���ս��
				showView.setText(content);
				//5.��ղ���
				content1 = "";
				content2 = "";
				logic = "";
			}
		}
		
	}
}
 