package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverscanIndicesGetterParams extends js.Object {
  var cellCount: Double
  var direction: js.UndefOr[SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL] = js.undefined
  var overscanCellsCount: Double
  var scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL
  var startIndex: Double
  var stopIndex: Double
}

object OverscanIndicesGetterParams {
  @scala.inline
  def apply(
    cellCount: Double,
    overscanCellsCount: Double,
    scrollDirection: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL,
    startIndex: Double,
    stopIndex: Double,
    direction: SCROLL_DIRECTION_HORIZONTAL | SCROLL_DIRECTION_VERTICAL = null
  ): OverscanIndicesGetterParams = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], overscanCellsCount = overscanCellsCount.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscanIndicesGetterParams]
  }
}

