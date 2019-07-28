package typings.reactDashVirtualized.distEsGridMod

import typings.react.reactMod.CSSProperties
import typings.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCache
import typings.reactDashVirtualized.distEsCellMeasurerMod.MeasuredCellParent
import typings.reactDashVirtualized.reactDashVirtualizedMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCellRangeProps extends js.Object {
  var cellCache: Map[_]
  var cellRenderer: GridCellRenderer
  var columnSizeAndPositionManager: CellSizeAndPositionManager
  var columnStartIndex: Double
  var columnStopIndex: Double
  var deferredMeasurementCache: CellMeasurerCache
  var horizontalOffsetAdjustment: Double
  var isScrolling: Boolean
  var parent: MeasuredCellParent
  var rowSizeAndPositionManager: CellSizeAndPositionManager
  var rowStartIndex: Double
  var rowStopIndex: Double
  var scrollLeft: Double
  var scrollTop: Double
  var styleCache: Map[CSSProperties]
  var verticalOffsetAdjustment: Double
  var visibleColumnIndices: VisibleCellRange
  var visibleRowIndices: VisibleCellRange
}

object GridCellRangeProps {
  @scala.inline
  def apply(
    cellCache: Map[_],
    cellRenderer: GridCellRenderer,
    columnSizeAndPositionManager: CellSizeAndPositionManager,
    columnStartIndex: Double,
    columnStopIndex: Double,
    deferredMeasurementCache: CellMeasurerCache,
    horizontalOffsetAdjustment: Double,
    isScrolling: Boolean,
    parent: MeasuredCellParent,
    rowSizeAndPositionManager: CellSizeAndPositionManager,
    rowStartIndex: Double,
    rowStopIndex: Double,
    scrollLeft: Double,
    scrollTop: Double,
    styleCache: Map[CSSProperties],
    verticalOffsetAdjustment: Double,
    visibleColumnIndices: VisibleCellRange,
    visibleRowIndices: VisibleCellRange
  ): GridCellRangeProps = {
    val __obj = js.Dynamic.literal(cellCache = cellCache, cellRenderer = cellRenderer, columnSizeAndPositionManager = columnSizeAndPositionManager, columnStartIndex = columnStartIndex, columnStopIndex = columnStopIndex, deferredMeasurementCache = deferredMeasurementCache, horizontalOffsetAdjustment = horizontalOffsetAdjustment, isScrolling = isScrolling, parent = parent, rowSizeAndPositionManager = rowSizeAndPositionManager, rowStartIndex = rowStartIndex, rowStopIndex = rowStopIndex, scrollLeft = scrollLeft, scrollTop = scrollTop, styleCache = styleCache, verticalOffsetAdjustment = verticalOffsetAdjustment, visibleColumnIndices = visibleColumnIndices, visibleRowIndices = visibleRowIndices)
  
    __obj.asInstanceOf[GridCellRangeProps]
  }
}

