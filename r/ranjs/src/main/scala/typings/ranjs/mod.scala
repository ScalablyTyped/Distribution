package typings.ranjs

import typings.ranjs.anon.Accepted
import typings.ranjs.anon.Closed
import typings.ranjs.anon.Cv
import typings.ranjs.anon.D
import typings.ranjs.anon.Passed
import typings.ranjs.mod._ts.Commons
import typings.ranjs.mod.la.Matrix
import typings.ranjs.ranjsStrings.InverseChi
import typings.ranjs.ranjsStrings.continuous
import typings.ranjs.ranjsStrings.discrete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object _dist {
    
    @js.native
    trait Distribution[T] extends StObject {
      
      def aic(data: js.Array[Double]): Double = js.native
      
      def bic(data: js.Array[Double]): Double = js.native
      
      def cHazard(x: Double): Double = js.native
      
      def cdf(x: Double): Double = js.native
      
      def hazard(x: Double): Double = js.native
      
      def lnL(data: js.Array[Double]): Double = js.native
      
      def load(state: State[T]): this.type = js.native
      
      def logPdf(x: Double): Double = js.native
      
      def pdf(x: Double): Double = js.native
      
      def q(p: Double): js.UndefOr[Double] = js.native
      
      def sample(): Double = js.native
      def sample(n: Double): js.Array[Double] = js.native
      
      def save(): State[T] = js.native
      
      def seed(value: String): this.type = js.native
      def seed(value: Double): this.type = js.native
      
      def support(): js.Array[Closed] = js.native
      
      def survival(x: Double): Double = js.native
      
      def test(values: js.Array[Double]): Passed = js.native
      
      def `type`(): discrete | continuous = js.native
    }
    
    @js.native
    trait State[T] extends StObject
  }
  
  object _mc {
    
    @js.native
    trait MCMC extends StObject {
      
      def ac(): js.Array[Double] = js.native
      
      def ar(): Double = js.native
      
      def iterate(): Accepted = js.native
      def iterate(callback: js.Function2[/* x */ js.Array[Double], /* accepted */ Boolean, Unit]): Accepted = js.native
      def iterate(callback: js.Function2[/* x */ js.Array[Double], /* accepted */ Boolean, Unit], warmUp: Boolean): Accepted = js.native
      def iterate(callback: Unit, warmUp: Boolean): Accepted = js.native
      
      def sample(): js.Array[js.Array[Double]] = js.native
      def sample(progress: js.Function1[/* percentage */ Double, Unit]): js.Array[js.Array[Double]] = js.native
      def sample(progress: js.Function1[/* percentage */ Double, Unit], size: Double): js.Array[js.Array[Double]] = js.native
      def sample(progress: Unit, size: Double): js.Array[js.Array[Double]] = js.native
      
      def state(): State = js.native
      
      def statistics(): js.Array[Cv] = js.native
      
      def warmUp(): Unit = js.native
      def warmUp(progress: js.Function1[/* percentage */ Double, Unit]): Unit = js.native
      def warmUp(progress: js.Function1[/* percentage */ Double, Unit], maxBatches: Double): Unit = js.native
      def warmUp(progress: Unit, maxBatches: Double): Unit = js.native
    }
    
    @js.native
    sealed trait State extends StObject
  }
  
  object _ts {
    
    trait Commons extends StObject {
      
      def reset(): Unit
      
      def update(x: js.Array[Double]): Unit
    }
    object Commons {
      
      inline def apply(reset: () => Unit, update: js.Array[Double] => Unit): Commons = {
        val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
        __obj.asInstanceOf[Commons]
      }
      
      extension [Self <: Commons](x: Self) {
        
        inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
        
        inline def setUpdate(value: js.Array[Double] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      }
    }
  }
  
  object dist {
    
    type Alpha = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Alpha]
    
    type Anglit = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Anglit]
    
    type Arcsine = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Arcsine]
    
    type BaldingNichols = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BaldingNichols]
    
    type Bates = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Bates]
    
    type Benini = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Benini]
    
    type BenktanderII = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BenktanderII]
    
    type Bernoulli = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Bernoulli]
    
    type Beta = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Beta]
    
    type BetaBinomial = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BetaBinomial]
    
    type BetaPrime = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BetaPrime]
    
    type BetaRectangular = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BetaRectangular]
    
    type Binomial = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Binomial]
    
    type BirnbaumSaunders = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BirnbaumSaunders]
    
    type Borel = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Borel]
    
    type BorelTanner = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BorelTanner]
    
    type BoundedPareto = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.BoundedPareto]
    
    type Bradford = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Bradford]
    
    type Burr = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Burr]
    
    type Categorical = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Categorical]
    
    type Cauchy = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Cauchy]
    
    type Chi = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Chi]
    
    type Chi2 = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Chi2]
    
    type Dagum = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Dagum]
    
    type Degenerate = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Degenerate]
    
    type Delaporte = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Delaporte]
    
    type DiscreteUniform = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.DiscreteUniform]
    
    type DiscreteWeibull = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.DiscreteWeibull]
    
    type Distribution[T] = typings.ranjs.mod._dist.Distribution[T]
    
    type DoubleGamma = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.DoubleGamma]
    
    type DoubleWeibull = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.DoubleWeibull]
    
    type DoublyNoncentralBeta = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.DoublyNoncentralBeta]
    
    type DoublyNoncentralF = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.DoublyNoncentralF]
    
    type DoublyNoncentralT = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.DoublyNoncentralT]
    
    type Erlang = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Erlang]
    
    type Exponential = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Exponential]
    
    type ExponentialLogarithmic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.ExponentialLogarithmic]
    
    type F = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.F]
    
    type FisherZ = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.FisherZ]
    
    type FlorySchulz = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.FlorySchulz]
    
    type Frechet = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Frechet]
    
    type Gamma = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Gamma]
    
    type GammaGompertz = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GammaGompertz]
    
    type GeneralizedExponential = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GeneralizedExponential]
    
    type GeneralizedExtremeValue = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GeneralizedExtremeValue]
    
    type GeneralizedGamma = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GeneralizedGamma]
    
    type GeneralizedHermite = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GeneralizedHermite]
    
    type GeneralizedLogistic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GeneralizedLogistic]
    
    type GeneralizedNormal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GeneralizedNormal]
    
    type GeneralizedPareto = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.GeneralizedPareto]
    
    type Geometric = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Geometric]
    
    type Gilbrat = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Gilbrat]
    
    type Gompertz = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Gompertz]
    
    type Gumbel = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Gumbel]
    
    type HalfGeneralizedNormal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.HalfGeneralizedNormal]
    
    type HalfLogistic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.HalfLogistic]
    
    type HalfNormal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.HalfNormal]
    
    type HeadsMinusTails = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.HeadsMinusTails]
    
    type Hoyt = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Hoyt]
    
    type HyperbolicSecant = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.HyperbolicSecant]
    
    type Hyperexponential = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Hyperexponential]
    
    type Hypergeometric = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Hypergeometric]
    
    type InverseChi2 = typings.ranjs.mod._dist.Distribution[InverseChi]
    
    type InverseGamma = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.InverseGamma]
    
    type InverseGaussian = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.InverseGaussian]
    
    type InvertedWeibull = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.InvertedWeibull]
    
    type IrwinHall = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.IrwinHall]
    
    type JohnsonSB = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.JohnsonSB]
    
    type JohnsonSU = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.JohnsonSU]
    
    type Kumaraswamy = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Kumaraswamy]
    
    type Laplace = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Laplace]
    
    type Levy = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Levy]
    
    type Lindley = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Lindley]
    
    type LogCauchy = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogCauchy]
    
    type LogGamma = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogGamma]
    
    type LogLaplace = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogLaplace]
    
    type LogLogistic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogLogistic]
    
    type LogNormal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogNormal]
    
    type LogSeries = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogSeries]
    
    type Logarithmic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Logarithmic]
    
    type Logistic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Logistic]
    
    type LogisticExponential = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogisticExponential]
    
    type LogitNormal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.LogitNormal]
    
    type Lomax = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Lomax]
    
    type Makeham = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Makeham]
    
    type MaxwellBoltzmann = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.MaxwellBoltzmann]
    
    type Mielke = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Mielke]
    
    type Moyal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Moyal]
    
    type Nakagami = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Nakagami]
    
    type NegativeBinomial = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NegativeBinomial]
    
    type NegativeHypergeometric = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NegativeHypergeometric]
    
    type NeymanA = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NeymanA]
    
    type NoncentralBeta = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NoncentralBeta]
    
    type NoncentralChi = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NoncentralChi]
    
    type NoncentralChi2 = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NoncentralChi]
    
    type NoncentralF = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NoncentralF]
    
    type NoncentralT = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.NoncentralT]
    
    type Normal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Normal]
    
    type PERT = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.PERT]
    
    type Pareto = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Pareto]
    
    type Poisson = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Poisson]
    
    type PolyaAeppli = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.PolyaAeppli]
    
    type Power = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Power]
    
    type QExponential = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.QExponential]
    
    type R = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.R]
    
    type Rademacher = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Rademacher]
    
    type RaisedCosine = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.RaisedCosine]
    
    type Rayleigh = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Rayleigh]
    
    type Reciprocal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Reciprocal]
    
    type ReciprocalInverseGaussian = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.ReciprocalInverseGaussian]
    
    type Rice = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Rice]
    
    type ShiftedLogLogistic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.ShiftedLogLogistic]
    
    type Skellam = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Skellam]
    
    type SkewNormal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.SkewNormal]
    
    type Slash = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Slash]
    
    type Soliton = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Soliton]
    
    type State[T] = typings.ranjs.mod._dist.State[T]
    
    type StudentT = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.StudentT]
    
    type StudentZ = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.StudentZ]
    
    type Trapezoidal = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Trapezoidal]
    
    type Triangular = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Triangular]
    
    type TukeyLambda = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.TukeyLambda]
    
    type UQuadratic = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.UQuadratic]
    
    type Uniform = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Uniform]
    
    type VonMises = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.VonMises]
    
    type Weibull = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Weibull]
    
    type Wigner = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Wigner]
    
    type YuleSimon = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.YuleSimon]
    
    type Zeta = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Zeta]
    
    type Zipf = typings.ranjs.mod._dist.Distribution[typings.ranjs.ranjsStrings.Zipf]
  }
  
  object la {
    
    @js.native
    trait Matrix extends StObject {
      
      def act(vec: Vector): Vector = js.native
      
      def add(mat: Matrix): Matrix = js.native
      
      def f(func: js.Function1[/* d */ Double, Double]): Matrix = js.native
      
      def ij(i: Double, j: Double): Double = js.native
      def ij(i: Double, j: Double, value: Double): Unit = js.native
      
      def ldl(): D = js.native
      
      def m(): js.Array[js.Array[Double]] = js.native
      
      def mult(max: Matrix): Matrix = js.native
      
      def scale(s: Double): Matrix = js.native
      
      def t(): Matrix = js.native
    }
    
    @js.native
    trait Vector extends StObject {
      
      def add(vec: Vector): Vector = js.native
      
      def dot(vec: Vector): Double = js.native
      
      def f(func: js.Function1[/* d */ Double, Double]): Vector = js.native
      
      def i(i: Double): Double = js.native
      def i(i: Double, value: Double): Unit = js.native
      
      def scale(s: Double): Vector = js.native
      
      def v(): js.Array[Double] = js.native
    }
  }
  
  object mc {
    
    type MCMC = typings.ranjs.mod._mc.MCMC
    
    type RWM = typings.ranjs.mod._mc.MCMC
    
    type State = typings.ranjs.mod._mc.State
  }
  
  object ts {
    
    trait AC
      extends StObject
         with Commons {
      
      def compute(): js.Array[js.Array[Double]]
    }
    object AC {
      
      inline def apply(compute: () => js.Array[js.Array[Double]], reset: () => Unit, update: js.Array[Double] => Unit): AC = {
        val __obj = js.Dynamic.literal(compute = js.Any.fromFunction0(compute), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
        __obj.asInstanceOf[AC]
      }
      
      extension [Self <: AC](x: Self) {
        
        inline def setCompute(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "compute", js.Any.fromFunction0(value))
      }
    }
    
    trait Cov
      extends StObject
         with Commons {
      
      def compute(): Matrix
    }
    object Cov {
      
      inline def apply(compute: () => Matrix, reset: () => Unit, update: js.Array[Double] => Unit): Cov = {
        val __obj = js.Dynamic.literal(compute = js.Any.fromFunction0(compute), reset = js.Any.fromFunction0(reset), update = js.Any.fromFunction1(update))
        __obj.asInstanceOf[Cov]
      }
      
      extension [Self <: Cov](x: Self) {
        
        inline def setCompute(value: () => Matrix): Self = StObject.set(x, "compute", js.Any.fromFunction0(value))
      }
    }
  }
}
