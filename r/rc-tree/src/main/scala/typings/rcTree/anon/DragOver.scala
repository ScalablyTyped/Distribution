package typings.rcTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragOver extends js.Object {
  
  var checked: Boolean = js.native
  
  var dragOver: Boolean = js.native
  
  var dragOverGapBottom: Boolean = js.native
  
  var dragOverGapTop: Boolean = js.native
  
  var eventKey: String | Double = js.native
  
  var expanded: Boolean = js.native
  
  var halfChecked: Boolean = js.native
  
  var loaded: Boolean = js.native
  
  var loading: Boolean = js.native
  
  var pos: String = js.native
  
  var selected: Boolean = js.native
}
object DragOver {
  
  @scala.inline
  def apply(
    checked: Boolean,
    dragOver: Boolean,
    dragOverGapBottom: Boolean,
    dragOverGapTop: Boolean,
    eventKey: String | Double,
    expanded: Boolean,
    halfChecked: Boolean,
    loaded: Boolean,
    loading: Boolean,
    pos: String,
    selected: Boolean
  ): DragOver = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragOver]
  }
  
  @scala.inline
  implicit class DragOverOps[Self <: DragOver] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOver(value: Boolean): Self = this.set("dragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapBottom(value: Boolean): Self = this.set("dragOverGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapTop(value: Boolean): Self = this.set("dragOverGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKey(value: String | Double): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfChecked(value: Boolean): Self = this.set("halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
