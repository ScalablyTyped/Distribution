package typings
package reactDashVirtualizedLib.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait createCellPositionerParams extends js.Object {
  var cellMeasurerCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCacheInterface
  var columnCount: scala.Double
  var columnWidth: scala.Double
  var spacer: js.UndefOr[scala.Double] = js.undefined
}

object createCellPositionerParams {
  @scala.inline
  def apply(
    cellMeasurerCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCacheInterface,
    columnCount: scala.Double,
    columnWidth: scala.Double,
    spacer: scala.Int | scala.Double = null
  ): createCellPositionerParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellMeasurerCache")(cellMeasurerCache)
    __obj.updateDynamic("columnCount")(columnCount)
    __obj.updateDynamic("columnWidth")(columnWidth)
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    __obj.asInstanceOf[createCellPositionerParams]
  }
}

