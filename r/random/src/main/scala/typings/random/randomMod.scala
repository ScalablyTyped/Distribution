package typings.random

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random", JSImport.Namespace)
@js.native
object randomMod extends js.Object {
  def bates(n: Double): js.Function0[Double] = js.native
  def bernoulli(p: Double): js.Function0[Double] = js.native
  def binomial(n: Double, p: Double): js.Function0[Double] = js.native
  def boolean(): Boolean = js.native
  def exponential(lambda: Double): js.Function0[Double] = js.native
  def float(): Double = js.native
  def float(min: Double): Double = js.native
  def float(min: Double, max: Double): Double = js.native
  def geometric(p: Double): js.Function0[Double] = js.native
  def int(): Double = js.native
  def int(min: Double): Double = js.native
  def int(min: Double, max: Double): Double = js.native
  def irwinHall(n: Double): js.Function0[Double] = js.native
  def logNormal(mu: Double, sigma: Double): js.Function0[Double] = js.native
  def normal(mu: Double, sigma: Double): js.Function0[Double] = js.native
  def pareto(alpha: Double): js.Function0[Double] = js.native
  def patch(): Unit = js.native
  def poisson(lambda: Double): js.Function0[Double] = js.native
  def uniform(min: Double, max: Double): js.Function0[Double] = js.native
  def uniformBoolean(): js.Function0[Boolean] = js.native
  def uniformInt(min: Double, max: Double): js.Function0[Double] = js.native
  def unpatch(): Unit = js.native
  def use(n: Double): Unit = js.native
}

