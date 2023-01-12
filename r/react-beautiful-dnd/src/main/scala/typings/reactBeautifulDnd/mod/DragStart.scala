package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactBeautifulDnd.mod.DraggableRubric because var conflicts: draggableId, mode. Inlined source */ trait DragStart
  extends StObject
     with BeforeCapture {
  
  var source: DraggableLocation
  
  var `type`: TypeId
}
object DragStart {
  
  inline def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation, `type`: TypeId): DragStart = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragStart] (val x: Self) extends AnyVal {
    
    inline def setSource(value: DraggableLocation): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
