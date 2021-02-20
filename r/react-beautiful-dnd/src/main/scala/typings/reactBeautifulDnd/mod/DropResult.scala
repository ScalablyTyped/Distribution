package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropResult extends DragUpdate {
  
  var reason: DropReason = js.native
}
object DropResult {
  
  @scala.inline
  def apply(
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
  implicit class DropResultMutableBuilder[Self <: DropResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: DropReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
