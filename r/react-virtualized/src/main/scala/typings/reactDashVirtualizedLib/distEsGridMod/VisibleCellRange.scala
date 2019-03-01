package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibleCellRange extends js.Object {
  var start: scala.Double
  var stop: scala.Double
}

object VisibleCellRange {
  @scala.inline
  def apply(start: scala.Double, stop: scala.Double): VisibleCellRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[VisibleCellRange]
  }
}

