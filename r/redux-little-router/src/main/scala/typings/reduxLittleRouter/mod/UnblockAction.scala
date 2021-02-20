package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnblockAction extends RouterActions {
  
  var `type`: /* "ROUTER_UNBLOCK" */ String = js.native
}
object UnblockAction {
  
  @scala.inline
  def apply(`type`: /* "ROUTER_UNBLOCK" */ String): UnblockAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnblockAction]
  }
  
  @scala.inline
  implicit class UnblockActionMutableBuilder[Self <: UnblockAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: /* "ROUTER_UNBLOCK" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
