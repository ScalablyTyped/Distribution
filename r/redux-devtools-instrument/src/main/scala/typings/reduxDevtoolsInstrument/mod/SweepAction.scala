package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.SWEEP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SweepAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var `type`: SWEEP
}
object SweepAction {
  
  inline def apply(): SweepAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SWEEP")
    __obj.asInstanceOf[SweepAction]
  }
  
  extension [Self <: SweepAction](x: Self) {
    
    inline def setType(value: SWEEP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
