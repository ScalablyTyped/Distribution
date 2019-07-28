package typings.probabilityDashDistributions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("probability-distributions", JSImport.Namespace)
@js.native
object probabilityDashDistributionsMod extends js.Object {
  def dexp(x: Double, rate: Double): Double = js.native
  def dnorm(x: Double, mean: Double, sd: Double): js.Array[Double] = js.native
  def dpois(x: Double, lambda: Double): js.Array[Double] = js.native
  def dunif(x: Double, min: Double, max: Double): Double = js.native
  def prng(len: Double): Double = js.native
  def rbeta(n: Double, alpha: Double, beta: Double, loc: Double): js.Array[Double] = js.native
  def rbinom(n: Double, size: Double, p: Double): js.Array[Double] = js.native
  def rcauchy(n: Double, loc: Double, scale: Double): js.Array[Double] = js.native
  def rchisq(n: Double, df: Double, ncp: Double): js.Array[Double] = js.native
  def rexp(n: Double, rate: Double): js.Array[Double] = js.native
  def rf(n: Double, df1: Double, df2: Double): js.Array[Double] = js.native
  def rfml(n: Double, loc: Double, p: Double, cap: Double, trace: js.Any): js.Array[Double] = js.native
  def rgamma(n: Double, alpha: Double, rate: Double): js.Array[Double] = js.native
  def rint(n: Double, min: Double, max: Double, inclusive: Double): js.Array[Double] = js.native
  def rlaplace(n: Double, loc: Double, scale: Double): js.Array[Double] = js.native
  def rlnorm(n: Double, meanlog: Double, sdlog: Double): js.Array[Double] = js.native
  def rnbinom(n: Double, size: Double, p: Double, mu: Double): js.Array[Double] = js.native
  def rnorm(n: Double, mean: Double, sd: Double): js.Array[Double] = js.native
  def rpois(n: Double, lambda: Double): js.Array[Double] = js.native
  def ruf(n: Double): js.Array[Double] = js.native
  def runif(n: Double, min: Double, max: Double): js.Array[Double] = js.native
  def rword(len: Double, alphabet: String): String = js.native
  def sample(collection: js.Array[_], n: Double, replace: Boolean, ratios: Double): js.Array[_] = js.native
  def visualize(data: js.Array[_], domID: String, options: js.Any): js.Any = js.native
}

