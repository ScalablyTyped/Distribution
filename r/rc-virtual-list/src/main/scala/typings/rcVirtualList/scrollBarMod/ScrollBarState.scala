package typings.rcVirtualList.scrollBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBarState extends js.Object {
  
  var dragging: Boolean = js.native
  
  var pageY: Double = js.native
  
  var startTop: Double = js.native
  
  var visible: Boolean = js.native
}
object ScrollBarState {
  
  @scala.inline
  def apply(dragging: Boolean, pageY: Double, startTop: Double, visible: Boolean): ScrollBarState = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], startTop = startTop.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBarState]
  }
  
  @scala.inline
  implicit class ScrollBarStateOps[Self <: ScrollBarState] (val x: Self) extends AnyVal {
    
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
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTop(value: Double): Self = this.set("startTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
