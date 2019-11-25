package typings.reactDashVirtualized.distEsMasonryMod

import typings.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCacheInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait createCellPositionerParams extends js.Object {
  var cellMeasurerCache: CellMeasurerCacheInterface
  var columnCount: Double
  var columnWidth: Double
  var spacer: js.UndefOr[Double] = js.undefined
}

object createCellPositionerParams {
  @scala.inline
  def apply(
    cellMeasurerCache: CellMeasurerCacheInterface,
    columnCount: Double,
    columnWidth: Double,
    spacer: Int | Double = null
  ): createCellPositionerParams = {
    val __obj = js.Dynamic.literal(cellMeasurerCache = cellMeasurerCache.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any])
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[createCellPositionerParams]
  }
}

