package typings.reactVirtualized.anon

import typings.reactVirtualized.esGridMod.OverscanIndices
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import typings.reactVirtualized.esGridMod.OverscanIndicesGetterParams
import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import typings.reactVirtualized.reactVirtualizedInts.`-1`
import typings.reactVirtualized.reactVirtualizedInts.`10`
import typings.reactVirtualized.reactVirtualizedInts.`30`
import typings.reactVirtualized.reactVirtualizedStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHeight extends StObject {
  
  var autoHeight: `false`
  
  var estimatedRowSize: `30`
  
  def noRowsRenderer(): Null
  
  def onRowsRendered(): Unit
  
  def onScroll(): Unit
  
  var overscanIndicesGetter: OverscanIndicesGetter
  
  var overscanRowCount: `10`
  
  var scrollToAlignment: auto
  
  var scrollToIndex: `-1`
}
object AutoHeight {
  
  inline def apply(
    noRowsRenderer: () => Null,
    onRowsRendered: () => Unit,
    onScroll: () => Unit,
    overscanIndicesGetter: /* params */ OverscanIndicesGetterParams => OverscanIndices
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = false, estimatedRowSize = 30, noRowsRenderer = js.Any.fromFunction0(noRowsRenderer), onRowsRendered = js.Any.fromFunction0(onRowsRendered), onScroll = js.Any.fromFunction0(onScroll), overscanIndicesGetter = js.Any.fromFunction1(overscanIndicesGetter), overscanRowCount = 10, scrollToAlignment = "auto", scrollToIndex = -1)
    __obj.asInstanceOf[AutoHeight]
  }
  
  extension [Self <: AutoHeight](x: Self) {
    
    inline def setAutoHeight(value: `false`): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
    
    inline def setEstimatedRowSize(value: `30`): Self = StObject.set(x, "estimatedRowSize", value.asInstanceOf[js.Any])
    
    inline def setNoRowsRenderer(value: () => Null): Self = StObject.set(x, "noRowsRenderer", js.Any.fromFunction0(value))
    
    inline def setOnRowsRendered(value: () => Unit): Self = StObject.set(x, "onRowsRendered", js.Any.fromFunction0(value))
    
    inline def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
    
    inline def setOverscanIndicesGetter(value: /* params */ OverscanIndicesGetterParams => OverscanIndices): Self = StObject.set(x, "overscanIndicesGetter", js.Any.fromFunction1(value))
    
    inline def setOverscanRowCount(value: `10`): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
    
    inline def setScrollToAlignment(value: auto): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
    
    inline def setScrollToIndex(value: `-1`): Self = StObject.set(x, "scrollToIndex", value.asInstanceOf[js.Any])
  }
}
