package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.dropexit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropExitEvent
  extends StObject
     with DragDropEvent {
  
  /** The event type. */
  var `type`: dropexit
}
object DropExitEvent {
  
  inline def apply(x: Double, y: Double): DropExitEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropexit")
    __obj.asInstanceOf[DropExitEvent]
  }
  
  extension [Self <: DropExitEvent](x: Self) {
    
    inline def setType(value: dropexit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
