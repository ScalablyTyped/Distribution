package typings.randomDashNormal.randomDashNormalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-normal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Return a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution)
    * random number. By default this, starts with a mean of 0 and a standard
    * deviation of 1 which is the standard normal distribution.
    * @param options Controls the shape of the normal distribution
    */
  def apply(): Double = js.native
  def apply(options: Options): Double = js.native
}

