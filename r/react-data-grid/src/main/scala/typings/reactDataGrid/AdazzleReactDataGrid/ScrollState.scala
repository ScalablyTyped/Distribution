package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollState extends js.Object {
  
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
  implicit class ScrollStateOps[Self <: ScrollState] (val x: Self) extends AnyVal {
    
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
    def setColOverscanEndIdx(value: Double): Self = this.set("colOverscanEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColOverscanStartIdx(value: Double): Self = this.set("colOverscanStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColVisibleEndIdx(value: Double): Self = this.set("colVisibleEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColVisibleStartIdx(value: Double): Self = this.set("colVisibleStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFrozenColumnIndex(value: Double): Self = this.set("lastFrozenColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanEndIdx(value: Double): Self = this.set("rowOverscanEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowOverscanStartIdx(value: Double): Self = this.set("rowOverscanStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVisibleEndIdx(value: Double): Self = this.set("rowVisibleEndIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowVisibleStartIdx(value: Double): Self = this.set("rowVisibleStartIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDirection(value: SCROLL_DIRECTION): Self = this.set("scrollDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
}
