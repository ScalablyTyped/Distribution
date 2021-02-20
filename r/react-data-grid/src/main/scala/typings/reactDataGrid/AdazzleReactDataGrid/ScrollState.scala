package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollState extends StObject {
  
  var colOverscanEndIdx: Double = js.native
  
  var colOverscanStartIdx: Double = js.native
  
  var colVisibleEndIdx: Double = js.native
  
  var colVisibleStartIdx: Double = js.native
  
  var height: Double = js.native
  
  var isScrolling: Boolean = js.native
  
  var lastFrozenColumnIndex: Double = js.native
  
  var rowOverscanEndIdx: Double = js.native
  
  var rowOverscanStartIdx: Double = js.native
  
  var rowVisibleEndIdx: Double = js.native
  
  var rowVisibleStartIdx: Double = js.native
  
  var scrollDirection: SCROLL_DIRECTION = js.native
  
  var scrollLeft: Double = js.native
  
  var scrollTop: Double = js.native
}
object ScrollState {
  
  @scala.inline
  def apply(
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
  implicit class ScrollStateMutableBuilder[Self <: ScrollState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColOverscanEndIdx(value: Double): Self = StObject.set(x, "colOverscanEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColOverscanStartIdx(value: Double): Self = StObject.set(x, "colOverscanStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColVisibleEndIdx(value: Double): Self = StObject.set(x, "colVisibleEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColVisibleStartIdx(value: Double): Self = StObject.set(x, "colVisibleStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFrozenColumnIndex(value: Double): Self = StObject.set(x, "lastFrozenColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanEndIdx(value: Double): Self = StObject.set(x, "rowOverscanEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanStartIdx(value: Double): Self = StObject.set(x, "rowOverscanStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVisibleEndIdx(value: Double): Self = StObject.set(x, "rowVisibleEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVisibleStartIdx(value: Double): Self = StObject.set(x, "rowVisibleStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: SCROLL_DIRECTION): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
