package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionOnItemDropEvent extends StObject {
  
  /** The drop operation that should occur. */
  var dropOperation: DropOperation
  
  /** Whether the drag originated within the same collection as the drop. */
  var isInternal: Boolean
  
  /** The dropped items. */
  var items: js.Array[DropItem]
  
  /** The drop target. */
  var target: ItemDropTarget
}
object DroppableCollectionOnItemDropEvent {
  
  inline def apply(
    dropOperation: DropOperation,
    isInternal: Boolean,
    items: js.Array[DropItem],
    target: ItemDropTarget
  ): DroppableCollectionOnItemDropEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], isInternal = isInternal.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableCollectionOnItemDropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableCollectionOnItemDropEvent] (val x: Self) extends AnyVal {
    
    inline def setDropOperation(value: DropOperation): Self = StObject.set(x, "dropOperation", value.asInstanceOf[js.Any])
    
    inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[DropItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DropItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTarget(value: ItemDropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
