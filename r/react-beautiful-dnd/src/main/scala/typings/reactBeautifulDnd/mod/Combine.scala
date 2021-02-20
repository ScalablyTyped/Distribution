package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Combine extends StObject {
  
  var draggableId: DraggableId = js.native
  
  var droppableId: DroppableId = js.native
}
object Combine {
  
  @scala.inline
  def apply(draggableId: DraggableId, droppableId: DroppableId): Combine = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], droppableId = droppableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combine]
  }
  
  @scala.inline
  implicit class CombineMutableBuilder[Self <: Combine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppableId(value: DroppableId): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
  }
}
