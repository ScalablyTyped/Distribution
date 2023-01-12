package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.JUMP_TO_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpToActionAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var actionId: Double
  
  var `type`: JUMP_TO_ACTION
}
object JumpToActionAction {
  
  inline def apply(actionId: Double): JumpToActionAction = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JUMP_TO_ACTION")
    __obj.asInstanceOf[JumpToActionAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JumpToActionAction] (val x: Self) extends AnyVal {
    
    inline def setActionId(value: Double): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setType(value: JUMP_TO_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
