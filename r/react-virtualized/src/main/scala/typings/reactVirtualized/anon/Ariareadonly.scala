package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.reactVirtualized.esGridMod.GridCellRangeProps
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedBooleans.`true`
import typings.reactVirtualized.reactVirtualizedNumbers.`-1`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`100`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`30`
import typings.reactVirtualized.reactVirtualizedStrings.auto
import typings.reactVirtualized.reactVirtualizedStrings.grid
import typings.reactVirtualized.reactVirtualizedStrings.rowgroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariareadonly extends StObject {
  
  var `aria-label`: grid
  
  var `aria-readonly`: `true`
  
  var autoContainerWidth: `false`
  
  var autoHeight: `false`
  
  var autoWidth: `false`
  
  var cellRangeRenderer: GridCellRangeRenderer
  
  var containerRole: rowgroup
  
  var estimatedColumnSize: `100`
  
  var estimatedRowSize: `30`
  
  def getScrollbarSize(): Double
  
  def noContentRenderer(): ReactNode
  
  def onScroll(): Unit
  
  def onScrollbarPresenceChange(): Unit
  
  def onSectionRendered(): Unit
  
  var overscanColumnCount: `0`
  
  var overscanIndicesGetter: OverscanIndicesGetter
  
  var overscanRowCount: `10`
  
  var role: grid
  
  var scrollToAlignment: auto
  
  var scrollToColumn: `-1`
  
  var scrollToRow: `-1`
  
  var scrollingResetTimeInterval: /* 150 */ Double
  
  var tabIndex: `0`
}
object Ariareadonly {
  
  inline def apply(
    cellRangeRenderer: /* params */ GridCellRangeProps => js.Array[ReactNode],
    getScrollbarSize: () => Double,
    noContentRenderer: () => ReactNode,
    onScroll: () => Unit,
    onScrollbarPresenceChange: () => Unit,
    onSectionRendered: () => Unit,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices,
    scrollingResetTimeInterval: /* 150 */ Double
  ): Ariareadonly = {
    val __obj = js.Dynamic.literal(autoContainerWidth = false, autoHeight = false, autoWidth = false, cellRangeRenderer = js.Any.fromFunction1(cellRangeRenderer), containerRole = "rowgroup", estimatedColumnSize = 100, estimatedRowSize = 30, getScrollbarSize = js.Any.fromFunction0(getScrollbarSize), noContentRenderer = js.Any.fromFunction0(noContentRenderer), onScroll = js.Any.fromFunction0(onScroll), onScrollbarPresenceChange = js.Any.fromFunction0(onScrollbarPresenceChange), onSectionRendered = js.Any.fromFunction0(onSectionRendered), overscanColumnCount = 0, overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = 10, role = "grid", scrollToAlignment = "auto", scrollToColumn = -1, scrollToRow = -1, scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], tabIndex = 0)
    __obj.updateDynamic("aria-label")("grid")
    __obj.updateDynamic("aria-readonly")(true)
    __obj.asInstanceOf[Ariareadonly]
  }
  
  extension [Self <: Ariareadonly](x: Self) {
    
    inline def `setAria-label`(value: grid): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-readonly`(value: `true`): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
    
    inline def setAutoContainerWidth(value: `false`): Self = StObject.set(x, "autoContainerWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoHeight(value: `false`): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoWidth(value: `false`): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setCellRangeRenderer(value: /* params */ GridCellRangeProps => js.Array[ReactNode]): Self = StObject.set(x, "cellRangeRenderer", js.Any.fromFunction1(value))
    
    inline def setContainerRole(value: rowgroup): Self = StObject.set(x, "containerRole", value.asInstanceOf[js.Any])
    
    inline def setEstimatedColumnSize(value: `100`): Self = StObject.set(x, "estimatedColumnSize", value.asInstanceOf[js.Any])
    
    inline def setEstimatedRowSize(value: `30`): Self = StObject.set(x, "estimatedRowSize", value.asInstanceOf[js.Any])
    
    inline def setGetScrollbarSize(value: () => Double): Self = StObject.set(x, "getScrollbarSize", js.Any.fromFunction0(value))
    
    inline def setNoContentRenderer(value: () => ReactNode): Self = StObject.set(x, "noContentRenderer", js.Any.fromFunction0(value))
    
    inline def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
    
    inline def setOnScrollbarPresenceChange(value: () => Unit): Self = StObject.set(x, "onScrollbarPresenceChange", js.Any.fromFunction0(value))
    
    inline def setOnSectionRendered(value: () => Unit): Self = StObject.set(x, "onSectionRendered", js.Any.fromFunction0(value))
    
    inline def setOverscanColumnCount(value: `0`): Self = StObject.set(x, "overscanColumnCount", value.asInstanceOf[js.Any])
    
    inline def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = StObject.set(x, "overscanIndicesGetter", js.Any.fromFunction1(value))
    
    inline def setOverscanRowCount(value: `10`): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
    
    inline def setRole(value: grid): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setScrollToAlignment(value: auto): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
    
    inline def setScrollToColumn(value: `-1`): Self = StObject.set(x, "scrollToColumn", value.asInstanceOf[js.Any])
    
    inline def setScrollToRow(value: `-1`): Self = StObject.set(x, "scrollToRow", value.asInstanceOf[js.Any])
    
    inline def setScrollingResetTimeInterval(value: /* 150 */ Double): Self = StObject.set(x, "scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: `0`): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
