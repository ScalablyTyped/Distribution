package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionActivateEvent
  extends StObject
     with DropActivateEvent {
  
  /** The drop target. */
  var target: DropTarget
}
object DroppableCollectionActivateEvent {
  
  inline def apply(target: DropTarget, x: Double, y: Double): DroppableCollectionActivateEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropactivate")
    __obj.asInstanceOf[DroppableCollectionActivateEvent]
  }
  
  extension [Self <: DroppableCollectionActivateEvent](x: Self) {
    
    inline def setTarget(value: DropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
