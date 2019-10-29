package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/bool", JSImport.Namespace)
@js.native
object distDistributionBoolMod extends js.Object {
  def bool(): Distribution[Boolean] = js.native
  def bool(numerator: Double, denominator: Double): Distribution[Boolean] = js.native
  def bool(percentage: Double): Distribution[Boolean] = js.native
}

