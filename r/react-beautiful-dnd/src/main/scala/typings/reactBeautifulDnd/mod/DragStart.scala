package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragStart
  extends StObject
     with DraggableRubric {
  
  var mode: MovementMode
}
object DragStart {
  
  inline def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation, `type`: TypeId): DragStart = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragStart] (val x: Self) extends AnyVal {
    
    inline def setMode(value: MovementMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
