package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderRendererProps[T] extends StObject {
  
  var canDrop: Boolean
  
  var draggedNode: TreeItem[T]
  
  var isOver: Boolean
}
object PlaceholderRendererProps {
  
  inline def apply[T](canDrop: Boolean, draggedNode: TreeItem[T], isOver: Boolean): PlaceholderRendererProps[T] = {
    val __obj = js.Dynamic.literal(canDrop = canDrop.asInstanceOf[js.Any], draggedNode = draggedNode.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderRendererProps[T]]
  }
  
  extension [Self <: PlaceholderRendererProps[?], T](x: Self & PlaceholderRendererProps[T]) {
    
    inline def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
    
    inline def setDraggedNode(value: TreeItem[T]): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    inline def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
  }
}
