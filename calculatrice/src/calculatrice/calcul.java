package calculatrice;

public class calcul {
	private double resultat;
	public void additionnner(double... nombre) {
	for(double nombre1:nombre)
	resultat+=nombre1;
		
	}
	public double getResultat() {
		return resultat;
	}
	public void setResultat(double resultat) {
		this.resultat = resultat;
	}
	

}
