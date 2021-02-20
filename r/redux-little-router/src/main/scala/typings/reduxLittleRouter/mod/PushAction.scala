package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushAction extends RouterActions {
  
  var payload: Location = js.native
  
  var `type`: /* "ROUTER_PUSH" */ String = js.native
}
object PushAction {
  
  @scala.inline
  def apply(payload: Location, `type`: /* "ROUTER_PUSH" */ String): PushAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushAction]
  }
  
  @scala.inline
  implicit class PushActionMutableBuilder[Self <: PushAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Location): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "ROUTER_PUSH" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
