package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragUpdate
  extends StObject
     with DragStart {
  
  // populated when a draggable is dragging over another in combine mode
  var combine: js.UndefOr[Combine | Null] = js.undefined
  
  // may not have any destination (drag to nowhere)
  var destination: js.UndefOr[DraggableLocation | Null] = js.undefined
}
object DragUpdate {
  
  inline def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation, `type`: TypeId): DragUpdate = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragUpdate] (val x: Self) extends AnyVal {
    
    inline def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
    
    inline def setCombineNull: Self = StObject.set(x, "combine", null)
    
    inline def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
    
    inline def setDestination(value: DraggableLocation): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
