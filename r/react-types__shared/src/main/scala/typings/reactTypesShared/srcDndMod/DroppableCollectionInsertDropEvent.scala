package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionInsertDropEvent extends StObject {
  
  /** The drop operation that should occur. */
  var dropOperation: DropOperation
  
  /** The dropped items. */
  var items: js.Array[DropItem]
  
  /** The drop target. */
  var target: ItemDropTarget
}
object DroppableCollectionInsertDropEvent {
  
  inline def apply(dropOperation: DropOperation, items: js.Array[DropItem], target: ItemDropTarget): DroppableCollectionInsertDropEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableCollectionInsertDropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableCollectionInsertDropEvent] (val x: Self) extends AnyVal {
    
    inline def setDropOperation(value: DropOperation): Self = StObject.set(x, "dropOperation", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[DropItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DropItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTarget(value: ItemDropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
