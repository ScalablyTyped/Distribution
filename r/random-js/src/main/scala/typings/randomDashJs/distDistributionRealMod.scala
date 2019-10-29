package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/real", JSImport.Namespace)
@js.native
object distDistributionRealMod extends js.Object {
  def real(min: Double, max: Double): Distribution[Double] = js.native
  def real(min: Double, max: Double, inclusive: Boolean): Distribution[Double] = js.native
}

