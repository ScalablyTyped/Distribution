package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableLocation extends StObject {
  
  var droppableId: DroppableId
  
  var index: Double
}
object DraggableLocation {
  
  @scala.inline
  def apply(droppableId: DroppableId, index: Double): DraggableLocation = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableLocation]
  }
  
  @scala.inline
  implicit class DraggableLocationMutableBuilder[Self <: DraggableLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDroppableId(value: DroppableId): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
