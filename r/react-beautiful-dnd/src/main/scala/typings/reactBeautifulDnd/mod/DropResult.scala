package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropResult
  extends StObject
     with DragUpdate {
  
  var reason: DropReason
}
object DropResult {
  
  inline def apply(
    draggableId: DraggableId,
    mode: MovementMode,
    reason: DropReason,
    source: DraggableLocation,
    `type`: TypeId
  ): DropResult = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropResult] (val x: Self) extends AnyVal {
    
    inline def setReason(value: DropReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
