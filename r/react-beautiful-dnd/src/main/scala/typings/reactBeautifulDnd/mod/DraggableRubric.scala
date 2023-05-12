package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableRubric extends StObject {
  
  var draggableId: DraggableId
  
  var source: DraggableLocation
  
  var `type`: TypeId
}
object DraggableRubric {
  
  inline def apply(draggableId: DraggableId, source: DraggableLocation, `type`: TypeId): DraggableRubric = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableRubric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableRubric] (val x: Self) extends AnyVal {
    
    inline def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: DraggableLocation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
