package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.dragend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEndEvent
  extends StObject
     with DragDropEvent {
  
  /** The drop operation that occurred. */
  var dropOperation: DropOperation
  
  /** The event type. */
  var `type`: dragend
}
object DragEndEvent {
  
  inline def apply(dropOperation: DropOperation, x: Double, y: Double): DragEndEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dragend")
    __obj.asInstanceOf[DragEndEvent]
  }
  
  extension [Self <: DragEndEvent](x: Self) {
    
    inline def setDropOperation(value: DropOperation): Self = StObject.set(x, "dropOperation", value.asInstanceOf[js.Any])
    
    inline def setType(value: dragend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
