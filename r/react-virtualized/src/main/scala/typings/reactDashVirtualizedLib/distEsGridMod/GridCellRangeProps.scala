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
  var styleCache: reactDashVirtualizedLib.reactDashVirtualizedMod.Map[reactLib.reactMod.CSSProperties]
  var verticalOffsetAdjustment: scala.Double
  var visibleColumnIndices: VisibleCellRange
  var visibleRowIndices: VisibleCellRange
}

object GridCellRangeProps {
  @scala.inline
  def apply(
    cellCache: reactDashVirtualizedLib.reactDashVirtualizedMod.Map[_],
    cellRenderer: GridCellRenderer,
    columnSizeAndPositionManager: CellSizeAndPositionManager,
    columnStartIndex: scala.Double,
    columnStopIndex: scala.Double,
    deferredMeasurementCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache,
    horizontalOffsetAdjustment: scala.Double,
    isScrolling: scala.Boolean,
    parent: reactDashVirtualizedLib.distEsCellMeasurerMod.MeasuredCellParent,
    rowSizeAndPositionManager: CellSizeAndPositionManager,
    rowStartIndex: scala.Double,
    rowStopIndex: scala.Double,
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    styleCache: reactDashVirtualizedLib.reactDashVirtualizedMod.Map[reactLib.reactMod.CSSProperties],
    verticalOffsetAdjustment: scala.Double,
    visibleColumnIndices: VisibleCellRange,
    visibleRowIndices: VisibleCellRange
  ): GridCellRangeProps = {
    val __obj = js.Dynamic.literal(cellCache = cellCache, cellRenderer = cellRenderer, columnSizeAndPositionManager = columnSizeAndPositionManager, columnStartIndex = columnStartIndex, columnStopIndex = columnStopIndex, deferredMeasurementCache = deferredMeasurementCache, horizontalOffsetAdjustment = horizontalOffsetAdjustment, isScrolling = isScrolling, parent = parent, rowSizeAndPositionManager = rowSizeAndPositionManager, rowStartIndex = rowStartIndex, rowStopIndex = rowStopIndex, scrollLeft = scrollLeft, scrollTop = scrollTop, styleCache = styleCache, verticalOffsetAdjustment = verticalOffsetAdjustment, visibleColumnIndices = visibleColumnIndices, visibleRowIndices = visibleRowIndices)
  
    __obj.asInstanceOf[GridCellRangeProps]
  }
}

