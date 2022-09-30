package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.TOGGLE_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToggleAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var id: Double
  
  var `type`: TOGGLE_ACTION
}
object ToggleAction {
  
  inline def apply(id: Double): ToggleAction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TOGGLE_ACTION")
    __obj.asInstanceOf[ToggleAction]
  }
  
  extension [Self <: ToggleAction](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: TOGGLE_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
