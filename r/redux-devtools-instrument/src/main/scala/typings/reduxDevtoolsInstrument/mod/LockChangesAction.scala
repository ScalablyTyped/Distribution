package typings.reduxDevtoolsInstrument.mod

import typings.reduxDevtoolsInstrument.reduxDevtoolsInstrumentStrings.LOCK_CHANGES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockChangesAction
  extends StObject
     with LiftedAction[Any, Any, Any] {
  
  var status: Boolean
  
  var `type`: LOCK_CHANGES
}
object LockChangesAction {
  
  inline def apply(status: Boolean): LockChangesAction = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LOCK_CHANGES")
    __obj.asInstanceOf[LockChangesAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LockChangesAction] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: LOCK_CHANGES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
