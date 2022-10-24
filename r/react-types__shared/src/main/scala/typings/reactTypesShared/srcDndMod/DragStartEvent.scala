package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.dragstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragStartEvent
  extends StObject
     with DragDropEvent {
  
  /** The event type. */
  var `type`: dragstart
}
object DragStartEvent {
  
  inline def apply(x: Double, y: Double): DragStartEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dragstart")
    __obj.asInstanceOf[DragStartEvent]
  }
  
  extension [Self <: DragStartEvent](x: Self) {
    
    inline def setType(value: dragstart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
