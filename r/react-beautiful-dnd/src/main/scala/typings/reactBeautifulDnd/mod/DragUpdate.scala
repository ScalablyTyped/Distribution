package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragUpdate extends DragStart {
  
  // populated when a draggable is dragging over another in combine mode
  var combine: js.UndefOr[Combine] = js.native
  
  // may not have any destination (drag to nowhere)
  var destination: js.UndefOr[DraggableLocation] = js.native
}
object DragUpdate {
  
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode, source: DraggableLocation, `type`: TypeId): DragUpdate = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragUpdate]
  }
  
  @scala.inline
  implicit class DragUpdateMutableBuilder[Self <: DragUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombine(value: Combine): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
    
    @scala.inline
    def setDestination(value: DraggableLocation): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
