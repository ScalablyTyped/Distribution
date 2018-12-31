package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCellRangeProps extends js.Object {
  var cellCache: reactDashVirtualizedLib.reactDashVirtualizedMod.Map[_]
  var cellRenderer: GridCellRenderer
  var columnSizeAndPositionManager: CellSizeAndPositionManager
  var columnStartIndex: scala.Double
  var columnStopIndex: scala.Double
  var deferredMeasurementCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache
  var horizontalOffsetAdjustment: scala.Double
  var isScrolling: scala.Boolean
  var parent: reactDashVirtualizedLib.distEsCellMeasurerMod.MeasuredCellParent
  var rowSizeAndPositionManager: CellSizeAndPositionManager
  var rowStartIndex: scala.Double
  var rowStopIndex: scala.Double
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var styleCache: reactDashVirtualizedLib.reactDashVirtualizedMod.Map[reactLib.reactMod.ReactNs.CSSProperties]
  var verticalOffsetAdjustment: scala.Double
  var visibleColumnIndices: VisibleCellRange
  var visibleRowIndices: VisibleCellRange
}

