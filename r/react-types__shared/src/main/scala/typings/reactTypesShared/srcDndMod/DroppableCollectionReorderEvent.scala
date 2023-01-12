package typings.reactTypesShared.srcDndMod

import typings.react.mod.Key
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionReorderEvent extends StObject {
  
  /** The drop operation that should occur. */
  var dropOperation: DropOperation
  
  /** The keys of the items that were reordered. */
  var keys: Set[Key]
  
  /** The drop target. */
  var target: ItemDropTarget
}
object DroppableCollectionReorderEvent {
  
  inline def apply(dropOperation: DropOperation, keys: Set[Key], target: ItemDropTarget): DroppableCollectionReorderEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableCollectionReorderEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableCollectionReorderEvent] (val x: Self) extends AnyVal {
    
    inline def setDropOperation(value: DropOperation): Self = StObject.set(x, "dropOperation", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: Set[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: ItemDropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
