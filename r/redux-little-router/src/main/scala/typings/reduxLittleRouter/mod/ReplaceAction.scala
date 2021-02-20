package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAction extends RouterActions {
  
  var payload: Location = js.native
  
  var `type`: /* "ROUTER_REPLACE" */ String = js.native
}
object ReplaceAction {
  
  @scala.inline
  def apply(payload: Location, `type`: /* "ROUTER_REPLACE" */ String): ReplaceAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAction]
  }
  
  @scala.inline
  implicit class ReplaceActionMutableBuilder[Self <: ReplaceAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Location): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "ROUTER_REPLACE" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
