package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDragStateChangedData[T] extends StObject {
  
  var draggedNode: TreeItem[T]
  
  var isDragging: Boolean
}
object OnDragStateChangedData {
  
  inline def apply[T](draggedNode: TreeItem[T], isDragging: Boolean): OnDragStateChangedData[T] = {
    val __obj = js.Dynamic.literal(draggedNode = draggedNode.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragStateChangedData[T]]
  }
  
  extension [Self <: OnDragStateChangedData[?], T](x: Self & OnDragStateChangedData[T]) {
    
    inline def setDraggedNode(value: TreeItem[T]): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
  }
}
