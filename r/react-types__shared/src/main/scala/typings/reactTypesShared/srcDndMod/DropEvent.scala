package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.drop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropEvent
  extends StObject
     with DragDropEvent {
  
  /** The drop operation that should occur. */
  var dropOperation: DropOperation
  
  /** The dropped items. */
  var items: js.Array[DropItem]
  
  /** The event type. */
  var `type`: drop
}
object DropEvent {
  
  inline def apply(dropOperation: DropOperation, items: js.Array[DropItem], x: Double, y: Double): DropEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drop")
    __obj.asInstanceOf[DropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropEvent] (val x: Self) extends AnyVal {
    
    inline def setDropOperation(value: DropOperation): Self = StObject.set(x, "dropOperation", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[DropItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DropItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setType(value: drop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
