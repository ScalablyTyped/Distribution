package typings
package probabilityDashDistributionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("probability-distributions", JSImport.Namespace)
@js.native
object probabilityDashDistributionsMod extends js.Object {
  def dexp(x: scala.Double, rate: scala.Double): scala.Double = js.native
  def dnorm(x: scala.Double, mean: scala.Double, sd: scala.Double): js.Array[scala.Double] = js.native
  def dpois(x: scala.Double, lambda: scala.Double): js.Array[scala.Double] = js.native
  def dunif(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  def prng(len: scala.Double): scala.Double = js.native
  def rbeta(n: scala.Double, alpha: scala.Double, beta: scala.Double, loc: scala.Double): js.Array[scala.Double] = js.native
  def rbinom(n: scala.Double, size: scala.Double, p: scala.Double): js.Array[scala.Double] = js.native
  def rcauchy(n: scala.Double, loc: scala.Double, scale: scala.Double): js.Array[scala.Double] = js.native
  def rchisq(n: scala.Double, df: scala.Double, ncp: scala.Double): js.Array[scala.Double] = js.native
  def rexp(n: scala.Double, rate: scala.Double): js.Array[scala.Double] = js.native
  def rf(n: scala.Double, df1: scala.Double, df2: scala.Double): js.Array[scala.Double] = js.native
  def rfml(n: scala.Double, loc: scala.Double, p: scala.Double, cap: scala.Double, trace: js.Any): js.Array[scala.Double] = js.native
  def rgamma(n: scala.Double, alpha: scala.Double, rate: scala.Double): js.Array[scala.Double] = js.native
  def rint(n: scala.Double, min: scala.Double, max: scala.Double, inclusive: scala.Double): js.Array[scala.Double] = js.native
  def rlaplace(n: scala.Double, loc: scala.Double, scale: scala.Double): js.Array[scala.Double] = js.native
  def rlnorm(n: scala.Double, meanlog: scala.Double, sdlog: scala.Double): js.Array[scala.Double] = js.native
  def rnbinom(n: scala.Double, size: scala.Double, p: scala.Double, mu: scala.Double): js.Array[scala.Double] = js.native
  def rnorm(n: scala.Double, mean: scala.Double, sd: scala.Double): js.Array[scala.Double] = js.native
  def rpois(n: scala.Double, lambda: scala.Double): js.Array[scala.Double] = js.native
  def ruf(n: scala.Double): js.Array[scala.Double] = js.native
  def runif(n: scala.Double, min: scala.Double, max: scala.Double): js.Array[scala.Double] = js.native
  def rword(len: scala.Double, alphabet: java.lang.String): java.lang.String = js.native
  def sample(collection: js.Array[_], n: scala.Double, replace: scala.Boolean, ratios: scala.Double): js.Array[_] = js.native
  def visualize(data: js.Array[_], domID: java.lang.String, options: js.Any): js.Any = js.native
}

