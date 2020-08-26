package typings.reactVirtualized.esGridMod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typings.reactVirtualized.mod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridCellRangeProps extends js.Object {
  var cellCache: Map[_] = js.native
  var cellRenderer: GridCellRenderer = js.native
  var columnSizeAndPositionManager: CellSizeAndPositionManager = js.native
  var columnStartIndex: Double = js.native
  var columnStopIndex: Double = js.native
  var deferredMeasurementCache: CellMeasurerCache = js.native
  var horizontalOffsetAdjustment: Double = js.native
  var isScrolling: Boolean = js.native
  var isScrollingOptOut: Boolean = js.native
  var parent: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent = js.native
  var rowSizeAndPositionManager: CellSizeAndPositionManager = js.native
  var rowStartIndex: Double = js.native
  var rowStopIndex: Double = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var styleCache: Map[CSSProperties] = js.native
  var verticalOffsetAdjustment: Double = js.native
  var visibleColumnIndices: VisibleCellRange = js.native
  var visibleRowIndices: VisibleCellRange = js.native
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
  @scala.inline
  implicit class GridCellRangePropsOps[Self <: GridCellRangeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellCache(value: Map[_]): Self = this.set("cellCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellRenderer(value: /* props */ GridCellProps => ReactNode): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setColumnSizeAndPositionManager(value: CellSizeAndPositionManager): Self = this.set("columnSizeAndPositionManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnStartIndex(value: Double): Self = this.set("columnStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnStopIndex(value: Double): Self = this.set("columnStopIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeferredMeasurementCache(value: CellMeasurerCache): Self = this.set("deferredMeasurementCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalOffsetAdjustment(value: Double): Self = this.set("horizontalOffsetAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrollingOptOut(value: Boolean): Self = this.set("isScrollingOptOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: (Component[GridCoreProps, js.Object, _]) with MeasuredCellParent): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSizeAndPositionManager(value: CellSizeAndPositionManager): Self = this.set("rowSizeAndPositionManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowStartIndex(value: Double): Self = this.set("rowStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowStopIndex(value: Double): Self = this.set("rowStopIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyleCache(value: Map[CSSProperties]): Self = this.set("styleCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalOffsetAdjustment(value: Double): Self = this.set("verticalOffsetAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleColumnIndices(value: VisibleCellRange): Self = this.set("visibleColumnIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleRowIndices(value: VisibleCellRange): Self = this.set("visibleRowIndices", value.asInstanceOf[js.Any])
  }
  
}

