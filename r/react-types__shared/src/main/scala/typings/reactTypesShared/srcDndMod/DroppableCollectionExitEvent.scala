package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionExitEvent
  extends StObject
     with DropExitEvent {
  
  /** The drop target. */
  var target: DropTarget
}
object DroppableCollectionExitEvent {
  
  inline def apply(target: DropTarget, x: Double, y: Double): DroppableCollectionExitEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropexit")
    __obj.asInstanceOf[DroppableCollectionExitEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableCollectionExitEvent] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: DropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
