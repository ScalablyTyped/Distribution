package typings.probabilityDistributions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("probability-distributions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dexp(x: Double, rate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dexp")(x.asInstanceOf[js.Any], rate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dnorm(x: Double, mean: Double, sd: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("dnorm")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def dpois(x: Double, lambda: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("dpois")(x.asInstanceOf[js.Any], lambda.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def dunif(x: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dunif")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def prng(len: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("prng")(len.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rbeta(n: Double, alpha: Double, beta: Double, loc: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rbeta")(n.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rbinom(n: Double, size: Double, p: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rbinom")(n.asInstanceOf[js.Any], size.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rcauchy(n: Double, loc: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rcauchy")(n.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rchisq(n: Double, df: Double, ncp: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rchisq")(n.asInstanceOf[js.Any], df.asInstanceOf[js.Any], ncp.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rexp(n: Double, rate: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rexp")(n.asInstanceOf[js.Any], rate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rf(n: Double, df1: Double, df2: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rf")(n.asInstanceOf[js.Any], df1.asInstanceOf[js.Any], df2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rfml(n: Double, loc: Double, p: Double, cap: Double, trace: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rfml")(n.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], p.asInstanceOf[js.Any], cap.asInstanceOf[js.Any], trace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rgamma(n: Double, alpha: Double, rate: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rgamma")(n.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], rate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rint(n: Double, min: Double, max: Double, inclusive: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rint")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rlaplace(n: Double, loc: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rlaplace")(n.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rlnorm(n: Double, meanlog: Double, sdlog: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rlnorm")(n.asInstanceOf[js.Any], meanlog.asInstanceOf[js.Any], sdlog.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rnbinom(n: Double, size: Double, p: Double, mu: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnbinom")(n.asInstanceOf[js.Any], size.asInstanceOf[js.Any], p.asInstanceOf[js.Any], mu.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rnorm(n: Double, mean: Double, sd: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rnorm")(n.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rpois(n: Double, lambda: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("rpois")(n.asInstanceOf[js.Any], lambda.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def ruf(n: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("ruf")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def runif(n: Double, min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("runif")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def rword(len: Double, alphabet: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rword")(len.asInstanceOf[js.Any], alphabet.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sample(collection: js.Array[Any], n: Double, replace: Boolean, ratios: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(collection.asInstanceOf[js.Any], n.asInstanceOf[js.Any], replace.asInstanceOf[js.Any], ratios.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def visualize(data: js.Array[Any], domID: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visualize")(data.asInstanceOf[js.Any], domID.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
}
