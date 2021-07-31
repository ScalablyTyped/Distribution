package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDragStateChangedData extends StObject {
  
  var draggedNode: TreeItem
  
  var isDragging: Boolean
}
object OnDragStateChangedData {
  
  @scala.inline
  def apply(draggedNode: TreeItem, isDragging: Boolean): OnDragStateChangedData = {
    val __obj = js.Dynamic.literal(draggedNode = draggedNode.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragStateChangedData]
  }
  
  @scala.inline
  implicit class OnDragStateChangedDataMutableBuilder[Self <: OnDragStateChangedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggedNode(value: TreeItem): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
  }
}
