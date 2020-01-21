package typings.randomJs

import typings.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/dice", JSImport.Namespace)
@js.native
object diceMod extends js.Object {
  def dice(sideCount: Double, dieCount: Double): Distribution[js.Array[Double]] = js.native
}

