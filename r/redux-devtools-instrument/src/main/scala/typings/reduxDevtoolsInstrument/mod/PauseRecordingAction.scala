package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.PAUSE_RECORDING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseRecordingAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var status: Boolean
  
  var `type`: PAUSE_RECORDING
}
object PauseRecordingAction {
  
  inline def apply(status: Boolean): PauseRecordingAction = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PAUSE_RECORDING")
    __obj.asInstanceOf[PauseRecordingAction]
  }
  
  extension [Self <: PauseRecordingAction](x: Self) {
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: PAUSE_RECORDING): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
