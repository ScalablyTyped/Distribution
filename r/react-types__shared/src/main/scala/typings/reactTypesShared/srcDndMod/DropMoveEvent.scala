package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.dropmove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropMoveEvent
  extends StObject
     with DragDropEvent {
  
  /** The event type. */
  var `type`: dropmove
}
object DropMoveEvent {
  
  inline def apply(x: Double, y: Double): DropMoveEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropmove")
    __obj.asInstanceOf[DropMoveEvent]
  }
  
  extension [Self <: DropMoveEvent](x: Self) {
    
    inline def setType(value: dropmove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
