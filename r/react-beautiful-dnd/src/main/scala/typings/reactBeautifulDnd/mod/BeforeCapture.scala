package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeCapture extends StObject {
  
  var draggableId: DraggableId
  
  var mode: MovementMode
}
object BeforeCapture {
  
  @scala.inline
  def apply(draggableId: DraggableId, mode: MovementMode): BeforeCapture = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCapture]
  }
  
  @scala.inline
  implicit class BeforeCaptureMutableBuilder[Self <: BeforeCapture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: MovementMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
