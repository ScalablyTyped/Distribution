package typings.reactTypesShared.srcDndMod

import typings.react.mod.Key
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableCollectionStartEvent
  extends StObject
     with DragStartEvent {
  
  /** The keys of the items that were dragged. */
  var keys: Set[Key]
}
object DraggableCollectionStartEvent {
  
  inline def apply(keys: Set[Key], x: Double, y: Double): DraggableCollectionStartEvent = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dragstart")
    __obj.asInstanceOf[DraggableCollectionStartEvent]
  }
  
  extension [Self <: DraggableCollectionStartEvent](x: Self) {
    
    inline def setKeys(value: Set[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
