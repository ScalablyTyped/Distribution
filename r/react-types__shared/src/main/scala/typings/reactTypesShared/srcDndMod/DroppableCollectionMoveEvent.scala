package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionMoveEvent
  extends StObject
     with DropMoveEvent {
  
  /** The drop target. */
  var target: DropTarget
}
object DroppableCollectionMoveEvent {
  
  inline def apply(target: DropTarget, x: Double, y: Double): DroppableCollectionMoveEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropmove")
    __obj.asInstanceOf[DroppableCollectionMoveEvent]
  }
  
  extension [Self <: DroppableCollectionMoveEvent](x: Self) {
    
    inline def setTarget(value: DropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
