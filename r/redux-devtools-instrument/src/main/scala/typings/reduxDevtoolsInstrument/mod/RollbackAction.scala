package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.ROLLBACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var timestamp: Double
  
  var `type`: ROLLBACK
}
object RollbackAction {
  
  inline def apply(timestamp: Double): RollbackAction = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ROLLBACK")
    __obj.asInstanceOf[RollbackAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollbackAction] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ROLLBACK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
