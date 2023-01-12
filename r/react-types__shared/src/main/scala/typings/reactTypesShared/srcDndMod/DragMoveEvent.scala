package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.dragmove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragMoveEvent
  extends StObject
     with DragDropEvent {
  
  /** The event type. */
  var `type`: dragmove
}
object DragMoveEvent {
  
  inline def apply(x: Double, y: Double): DragMoveEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dragmove")
    __obj.asInstanceOf[DragMoveEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragMoveEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: dragmove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
