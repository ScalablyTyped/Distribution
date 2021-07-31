package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOver extends StObject {
  
  var checked: Boolean
  
  var dragOver: Boolean
  
  var dragOverGapBottom: Boolean
  
  var dragOverGapTop: Boolean
  
  var eventKey: String | Double
  
  var expanded: Boolean
  
  var halfChecked: Boolean
  
  var loaded: Boolean
  
  var loading: Boolean
  
  var pos: String
  
  var selected: Boolean
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
  implicit class DragOverMutableBuilder[Self <: DragOver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKey(value: String | Double): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
