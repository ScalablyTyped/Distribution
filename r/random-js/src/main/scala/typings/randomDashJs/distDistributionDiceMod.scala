package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/dice", JSImport.Namespace)
@js.native
object distDistributionDiceMod extends js.Object {
  def dice(sideCount: Double, dieCount: Double): Distribution[js.Array[Double]] = js.native
}

