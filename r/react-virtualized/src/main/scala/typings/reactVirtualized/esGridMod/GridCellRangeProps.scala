package typings.reactVirtualized.esGridMod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import typings.reactVirtualized.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridCellRangeProps extends StObject {
  
  var cellCache: Map[js.Any]
  
  var cellRenderer: GridCellRenderer
  
  var columnSizeAndPositionManager: CellSizeAndPositionManager
  
  var columnStartIndex: Double
  
  var columnStopIndex: Double
  
  var deferredMeasurementCache: CellMeasurerCache
  
  var horizontalOffsetAdjustment: Double
  
  var isScrolling: Boolean
  
  var isScrollingOptOut: Boolean
  
  var parent: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent
  
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
    cellCache: Map[js.Any],
    cellRenderer: /* props */ GridCellProps => ReactNode,
    columnSizeAndPositionManager: CellSizeAndPositionManager,
    columnStartIndex: Double,
    columnStopIndex: Double,
    deferredMeasurementCache: CellMeasurerCache,
    horizontalOffsetAdjustment: Double,
    isScrolling: Boolean,
    isScrollingOptOut: Boolean,
    parent: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent,
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
  implicit class GridCellRangePropsMutableBuilder[Self <: GridCellRangeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellCache(value: Map[js.Any]): Self = StObject.set(x, "cellCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRenderer(value: /* props */ GridCellProps => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumnSizeAndPositionManager(value: CellSizeAndPositionManager): Self = StObject.set(x, "columnSizeAndPositionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStartIndex(value: Double): Self = StObject.set(x, "columnStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnStopIndex(value: Double): Self = StObject.set(x, "columnStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferredMeasurementCache(value: CellMeasurerCache): Self = StObject.set(x, "deferredMeasurementCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOffsetAdjustment(value: Double): Self = StObject.set(x, "horizontalOffsetAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollingOptOut(value: Boolean): Self = StObject.set(x, "isScrollingOptOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSizeAndPositionManager(value: CellSizeAndPositionManager): Self = StObject.set(x, "rowSizeAndPositionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStartIndex(value: Double): Self = StObject.set(x, "rowStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowStopIndex(value: Double): Self = StObject.set(x, "rowStopIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleCache(value: Map[CSSProperties]): Self = StObject.set(x, "styleCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOffsetAdjustment(value: Double): Self = StObject.set(x, "verticalOffsetAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleColumnIndices(value: VisibleCellRange): Self = StObject.set(x, "visibleColumnIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleRowIndices(value: VisibleCellRange): Self = StObject.set(x, "visibleRowIndices", value.asInstanceOf[js.Any])
  }
}
