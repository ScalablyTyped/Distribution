package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionInput extends js.Object {
  var pos: js.Tuple2[scala.Double, scala.Double]
}

object PositionInput {
  @scala.inline
  def apply(pos: js.Tuple2[scala.Double, scala.Double]): PositionInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[PositionInput]
  }
}

