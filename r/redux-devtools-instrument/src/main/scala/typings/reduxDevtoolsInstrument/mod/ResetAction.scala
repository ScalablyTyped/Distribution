package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.RESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var timestamp: Double
  
  var `type`: RESET
}
object ResetAction {
  
  inline def apply(timestamp: Double): ResetAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET")
    __obj.asInstanceOf[ResetAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetAction] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: RESET): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
