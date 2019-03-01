package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasuredCellParent extends js.Object {
  var invalidateCellSizeAfterRender: js.UndefOr[js.Function1[/* cell */ CellPosition, scala.Unit]] = js.undefined
  var recomputeGridSize: js.UndefOr[js.Function1[/* cell */ CellPosition, scala.Unit]] = js.undefined
}

object MeasuredCellParent {
  @scala.inline
  def apply(
    invalidateCellSizeAfterRender: js.Function1[/* cell */ CellPosition, scala.Unit] = null,
    recomputeGridSize: js.Function1[/* cell */ CellPosition, scala.Unit] = null
  ): MeasuredCellParent = {
    val __obj = js.Dynamic.literal()
    if (invalidateCellSizeAfterRender != null) __obj.updateDynamic("invalidateCellSizeAfterRender")(invalidateCellSizeAfterRender)
    if (recomputeGridSize != null) __obj.updateDynamic("recomputeGridSize")(recomputeGridSize)
    __obj.asInstanceOf[MeasuredCellParent]
  }
}

