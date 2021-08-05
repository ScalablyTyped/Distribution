package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableRubric extends StObject {
  
  var draggableId: DraggableId
  
  var mode: MovementMode
  
  var source: DraggableLocation
}
object DraggableRubric {
  
  inline def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation): DraggableRubric = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableRubric]
  }
  
  extension [Self <: DraggableRubric](x: Self) {
    
    inline def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    inline def setMode(value: MovementMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSource(value: DraggableLocation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
