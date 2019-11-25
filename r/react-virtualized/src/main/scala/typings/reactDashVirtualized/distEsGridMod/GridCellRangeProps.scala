package typings.reactDashVirtualized.distEsGridMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
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
  var isScrollingOptOut: Boolean
  var parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent
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
    cellRenderer: /* props */ GridCellProps => ReactNode,
    columnSizeAndPositionManager: CellSizeAndPositionManager,
    columnStartIndex: Double,
    columnStopIndex: Double,
    deferredMeasurementCache: CellMeasurerCache,
    horizontalOffsetAdjustment: Double,
    isScrolling: Boolean,
    isScrollingOptOut: Boolean,
    parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent,
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
    val __obj = js.Dynamic.literal(cellCache = cellCache.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), columnSizeAndPositionManager = columnSizeAndPositionManager.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], columnStopIndex = columnStopIndex.asInstanceOf[js.Any], deferredMeasurementCache = deferredMeasurementCache.asInstanceOf[js.Any], horizontalOffsetAdjustment = horizontalOffsetAdjustment.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isScrollingOptOut = isScrollingOptOut.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rowSizeAndPositionManager = rowSizeAndPositionManager.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any], rowStopIndex = rowStopIndex.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], styleCache = styleCache.asInstanceOf[js.Any], verticalOffsetAdjustment = verticalOffsetAdjustment.asInstanceOf[js.Any], visibleColumnIndices = visibleColumnIndices.asInstanceOf[js.Any], visibleRowIndices = visibleRowIndices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridCellRangeProps]
  }
}

