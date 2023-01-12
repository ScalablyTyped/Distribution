package typings.reactTypesShared.srcDndMod

import typings.react.mod.Key
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableCollectionEndEvent
  extends StObject
     with DragEndEvent {
  
  /** Whether the drop ended within the same collection as it originated. */
  var isInternal: Boolean
  
  /** The keys of the items that were dragged. */
  var keys: Set[Key]
}
object DraggableCollectionEndEvent {
  
  inline def apply(dropOperation: DropOperation, isInternal: Boolean, keys: Set[Key], x: Double, y: Double): DraggableCollectionEndEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], isInternal = isInternal.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dragend")
    __obj.asInstanceOf[DraggableCollectionEndEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableCollectionEndEvent] (val x: Self) extends AnyVal {
    
    inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: Set[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
