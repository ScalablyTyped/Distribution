package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceholderRendererProps extends StObject {
  
  var canDrop: Boolean = js.native
  
  var draggedNode: TreeItem = js.native
  
  var isOver: Boolean = js.native
}
object PlaceholderRendererProps {
  
  @scala.inline
  def apply(canDrop: Boolean, draggedNode: TreeItem, isOver: Boolean): PlaceholderRendererProps = {
    val __obj = js.Dynamic.literal(canDrop = canDrop.asInstanceOf[js.Any], draggedNode = draggedNode.asInstanceOf[js.Any], isOver = isOver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderRendererProps]
  }
  
  @scala.inline
  implicit class PlaceholderRendererPropsMutableBuilder[Self <: PlaceholderRendererProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggedNode(value: TreeItem): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
  }
}
