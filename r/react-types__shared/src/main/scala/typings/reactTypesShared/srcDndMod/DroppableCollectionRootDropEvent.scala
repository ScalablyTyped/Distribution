package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionRootDropEvent extends StObject {
  
  /** The drop operation that should occur. */
  var dropOperation: DropOperation
  
  /** The dropped items. */
  var items: js.Array[DropItem]
}
object DroppableCollectionRootDropEvent {
  
  inline def apply(dropOperation: DropOperation, items: js.Array[DropItem]): DroppableCollectionRootDropEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableCollectionRootDropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableCollectionRootDropEvent] (val x: Self) extends AnyVal {
    
    inline def setDropOperation(value: DropOperation): Self = StObject.set(x, "dropOperation", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[DropItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DropItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
