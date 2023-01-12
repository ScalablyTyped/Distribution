package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollState extends StObject {
  
  var colOverscanEndIdx: Double
  
  var colOverscanStartIdx: Double
  
  var colVisibleEndIdx: Double
  
  var colVisibleStartIdx: Double
  
  var height: Double
  
  var isScrolling: Boolean
  
  var lastFrozenColumnIndex: Double
  
  var rowOverscanEndIdx: Double
  
  var rowOverscanStartIdx: Double
  
  var rowVisibleEndIdx: Double
  
  var rowVisibleStartIdx: Double
  
  var scrollDirection: SCROLL_DIRECTION
  
  var scrollLeft: Double
  
  var scrollTop: Double
}
object ScrollState {
  
  inline def apply(
    colOverscanEndIdx: Double,
    colOverscanStartIdx: Double,
    colVisibleEndIdx: Double,
    colVisibleStartIdx: Double,
    height: Double,
    isScrolling: Boolean,
    lastFrozenColumnIndex: Double,
    rowOverscanEndIdx: Double,
    rowOverscanStartIdx: Double,
    rowVisibleEndIdx: Double,
    rowVisibleStartIdx: Double,
    scrollDirection: SCROLL_DIRECTION,
    scrollLeft: Double,
    scrollTop: Double
  ): ScrollState = {
    val __obj = js.Dynamic.literal(colOverscanEndIdx = colOverscanEndIdx.asInstanceOf[js.Any], colOverscanStartIdx = colOverscanStartIdx.asInstanceOf[js.Any], colVisibleEndIdx = colVisibleEndIdx.asInstanceOf[js.Any], colVisibleStartIdx = colVisibleStartIdx.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], lastFrozenColumnIndex = lastFrozenColumnIndex.asInstanceOf[js.Any], rowOverscanEndIdx = rowOverscanEndIdx.asInstanceOf[js.Any], rowOverscanStartIdx = rowOverscanStartIdx.asInstanceOf[js.Any], rowVisibleEndIdx = rowVisibleEndIdx.asInstanceOf[js.Any], rowVisibleStartIdx = rowVisibleStartIdx.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollState] (val x: Self) extends AnyVal {
    
    inline def setColOverscanEndIdx(value: Double): Self = StObject.set(x, "colOverscanEndIdx", value.asInstanceOf[js.Any])
    
    inline def setColOverscanStartIdx(value: Double): Self = StObject.set(x, "colOverscanStartIdx", value.asInstanceOf[js.Any])
    
    inline def setColVisibleEndIdx(value: Double): Self = StObject.set(x, "colVisibleEndIdx", value.asInstanceOf[js.Any])
    
    inline def setColVisibleStartIdx(value: Double): Self = StObject.set(x, "colVisibleStartIdx", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    inline def setLastFrozenColumnIndex(value: Double): Self = StObject.set(x, "lastFrozenColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setRowOverscanEndIdx(value: Double): Self = StObject.set(x, "rowOverscanEndIdx", value.asInstanceOf[js.Any])
    
    inline def setRowOverscanStartIdx(value: Double): Self = StObject.set(x, "rowOverscanStartIdx", value.asInstanceOf[js.Any])
    
    inline def setRowVisibleEndIdx(value: Double): Self = StObject.set(x, "rowVisibleEndIdx", value.asInstanceOf[js.Any])
    
    inline def setRowVisibleStartIdx(value: Double): Self = StObject.set(x, "rowVisibleStartIdx", value.asInstanceOf[js.Any])
    
    inline def setScrollDirection(value: SCROLL_DIRECTION): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
