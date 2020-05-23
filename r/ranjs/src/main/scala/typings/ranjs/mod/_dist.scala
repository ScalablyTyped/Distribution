package typings.ranjs.mod

import typings.ranjs.anon.Closed
import typings.ranjs.anon.Statistics
import typings.ranjs.ranjsStrings.continuous
import typings.ranjs.ranjsStrings.discrete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "_dist")
@js.native
object _dist extends js.Object {
  @js.native
  trait Distribution[T] extends js.Object {
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
    def test(values: js.Array[Double]): Statistics = js.native
    def `type`(): discrete | continuous = js.native
  }
  
  @js.native
  trait State[T] extends js.Object
  
}

