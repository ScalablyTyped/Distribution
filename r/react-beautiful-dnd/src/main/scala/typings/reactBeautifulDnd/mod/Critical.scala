package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Critical extends StObject {
  
  var draggable: DraggableDescriptor = js.native
  
  var droppable: DroppableDescriptor = js.native
}
object Critical {
  
  @scala.inline
  def apply(draggable: DraggableDescriptor, droppable: DroppableDescriptor): Critical = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], droppable = droppable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
  
  @scala.inline
  implicit class CriticalMutableBuilder[Self <: Critical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggable(value: DraggableDescriptor): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppable(value: DroppableDescriptor): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
  }
}
