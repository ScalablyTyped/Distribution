package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverscanIndicesGetterParams extends js.Object {
  var cellCount: scala.Double
  var direction: js.UndefOr[SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL] = js.undefined
  var overscanCellsCount: scala.Double
  var scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL
  var startIndex: scala.Double
  var stopIndex: scala.Double
}

object OverscanIndicesGetterParams {
  @scala.inline
  def apply(
    cellCount: scala.Double,
    overscanCellsCount: scala.Double,
    scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL,
    startIndex: scala.Double,
    stopIndex: scala.Double,
    direction: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL = null
  ): OverscanIndicesGetterParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount, overscanCellsCount = overscanCellsCount, scrollDirection = scrollDirection.asInstanceOf[js.Any], startIndex = startIndex, stopIndex = stopIndex)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndicesGetterParams]
  }
}

