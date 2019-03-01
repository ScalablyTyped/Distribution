package typings
package reactDashVirtualizedLib.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionInfo extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object PositionInfo {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): PositionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[PositionInfo]
  }
}

