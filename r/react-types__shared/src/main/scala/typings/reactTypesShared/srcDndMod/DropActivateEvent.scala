package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.dropactivate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropActivateEvent
  extends StObject
     with DragDropEvent {
  
  /** The event type. */
  var `type`: dropactivate
}
object DropActivateEvent {
  
  inline def apply(x: Double, y: Double): DropActivateEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropactivate")
    __obj.asInstanceOf[DropActivateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropActivateEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: dropactivate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
