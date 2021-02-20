package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoAction extends RouterActions {
  
  var payload: Double = js.native
  
  var `type`: /* "ROUTER_GO" */ String = js.native
}
object GoAction {
  
  @scala.inline
  def apply(payload: Double, `type`: /* "ROUTER_GO" */ String): GoAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoAction]
  }
  
  @scala.inline
  implicit class GoActionMutableBuilder[Self <: GoAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "ROUTER_GO" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
