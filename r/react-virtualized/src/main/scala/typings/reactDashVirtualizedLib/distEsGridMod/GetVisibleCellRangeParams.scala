package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVisibleCellRangeParams extends js.Object {
  var containerSize: scala.Double
  var offset: scala.Double
}

object GetVisibleCellRangeParams {
  @scala.inline
  def apply(containerSize: scala.Double, offset: scala.Double): GetVisibleCellRangeParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerSize")(containerSize)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[GetVisibleCellRangeParams]
  }
}

