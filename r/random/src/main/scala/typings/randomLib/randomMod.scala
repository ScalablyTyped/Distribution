package typings
package randomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random", JSImport.Namespace)
@js.native
object randomMod extends js.Object {
  def bates(n: scala.Double): js.Function0[scala.Double] = js.native
  def bernoulli(p: scala.Double): js.Function0[scala.Double] = js.native
  def binomial(n: scala.Double, p: scala.Double): js.Function0[scala.Double] = js.native
  def boolean(): scala.Boolean = js.native
  def exponential(lambda: scala.Double): js.Function0[scala.Double] = js.native
  def float(): scala.Double = js.native
  def float(min: scala.Double): scala.Double = js.native
  def float(min: scala.Double, max: scala.Double): scala.Double = js.native
  def geometric(p: scala.Double): js.Function0[scala.Double] = js.native
  def int(): scala.Double = js.native
  def int(min: scala.Double): scala.Double = js.native
  def int(min: scala.Double, max: scala.Double): scala.Double = js.native
  def irwinHall(n: scala.Double): js.Function0[scala.Double] = js.native
  def logNormal(mu: scala.Double, sigma: scala.Double): js.Function0[scala.Double] = js.native
  def normal(mu: scala.Double, sigma: scala.Double): js.Function0[scala.Double] = js.native
  def pareto(alpha: scala.Double): js.Function0[scala.Double] = js.native
  def patch(): scala.Unit = js.native
  def poisson(lambda: scala.Double): js.Function0[scala.Double] = js.native
  def uniform(min: scala.Double, max: scala.Double): js.Function0[scala.Double] = js.native
  def uniformBoolean(): js.Function0[scala.Boolean] = js.native
  def uniformInt(min: scala.Double, max: scala.Double): js.Function0[scala.Double] = js.native
  def unpatch(): scala.Unit = js.native
  def use(n: scala.Double): scala.Unit = js.native
}

