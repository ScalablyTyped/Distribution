package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableCollectionEnterEvent
  extends StObject
     with DropEnterEvent {
  
  /** The drop target. */
  var target: DropTarget
}
object DroppableCollectionEnterEvent {
  
  inline def apply(target: DropTarget, x: Double, y: Double): DroppableCollectionEnterEvent = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropenter")
    __obj.asInstanceOf[DroppableCollectionEnterEvent]
  }
  
  extension [Self <: DroppableCollectionEnterEvent](x: Self) {
    
    inline def setTarget(value: DropTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
