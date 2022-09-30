package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.SET_ACTIONS_ACTIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetActionsActiveAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var active: Boolean
  
  var end: Double
  
  var start: Double
  
  var `type`: SET_ACTIONS_ACTIVE
}
object SetActionsActiveAction {
  
  inline def apply(active: Boolean, end: Double, start: Double): SetActionsActiveAction = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_ACTIONS_ACTIVE")
    __obj.asInstanceOf[SetActionsActiveAction]
  }
  
  extension [Self <: SetActionsActiveAction](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: SET_ACTIONS_ACTIVE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
