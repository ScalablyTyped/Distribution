package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionDropEvent
  extends StObject
     with DropEvent {
  
  /** The drop target. */
  var target: DropTarget
}
object DroppableCollectionDropEvent {
  
  inline def apply(dropOperation: DropOperation, items: js.Array[DropItem], target: DropTarget, x: Double, y: Double): DroppableCollectionDropEvent = {
    val __obj = js.Dynamic.literal(dropOperation = dropOperation.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drop")
    __obj.asInstanceOf[DroppableCollectionDropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableCollectionDropEvent] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: DropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
