package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.reactVirtualized.esTableMod.TableHeaderRowProps
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import typings.reactVirtualized.esTableMod.TableRowProps
import typings.reactVirtualized.esTableMod.TableRowRenderer
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedNumbers.`-1`
import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`30`
import typings.reactVirtualized.reactVirtualizedStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableHeader extends StObject {
  
  var disableHeader: `false`
  
  var estimatedRowSize: `30`
  
  var headerHeight: `0`
  
  var headerRowRenderer: TableHeaderRowRenderer
  
  def noRowsRenderer(): Null
  
  def onRowsRendered(): Null
  
  def onScroll(): Null
  
  var overscanRowCount: `10`
  
  var rowRenderer: TableRowRenderer
  
  var scrollToAlignment: auto
  
  var scrollToIndex: `-1`
}
object DisableHeader {
  
  @scala.inline
  def apply(
    headerRowRenderer: /* props */ TableHeaderRowProps => ReactNode,
    noRowsRenderer: () => Null,
    onRowsRendered: () => Null,
    onScroll: () => Null,
    rowRenderer: /* props */ TableRowProps => ReactNode
  ): DisableHeader = {
    val __obj = js.Dynamic.literal(disableHeader = false, estimatedRowSize = 30, headerHeight = 0, headerRowRenderer = js.Any.fromFunction1(headerRowRenderer), noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanRowCount = 10, rowRenderer = js.Any.fromFunction1(rowRenderer), scrollToAlignment = "auto", scrollToIndex = -1)
    __obj.asInstanceOf[DisableHeader]
  }
  
  @scala.inline
  implicit class DisableHeaderMutableBuilder[Self <: DisableHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableHeader(value: `false`): Self = StObject.set(x, "disableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedRowSize(value: `30`): Self = StObject.set(x, "estimatedRowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeight(value: `0`): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRowRenderer(value: /* props */ TableHeaderRowProps => ReactNode): Self = StObject.set(x, "headerRowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoRowsRenderer(value: () => Null): Self = StObject.set(x, "noRowsRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRowsRendered(value: () => Null): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnScroll(value: () => Null): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverscanRowCount(value: `10`): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowRenderer(value: /* props */ TableRowProps => ReactNode): Self = StObject.set(x, "rowRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollToAlignment(value: auto): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToIndex(value: `-1`): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
  }
}
