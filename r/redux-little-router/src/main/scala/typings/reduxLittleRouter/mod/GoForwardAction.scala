package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoForwardAction extends RouterActions {
  
  var `type`: /* "ROUTER_GO_FORWARD" */ String = js.native
}
object GoForwardAction {
  
  @scala.inline
  def apply(`type`: /* "ROUTER_GO_FORWARD" */ String): GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoForwardAction]
  }
  
  @scala.inline
  implicit class GoForwardActionMutableBuilder[Self <: GoForwardAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: /* "ROUTER_GO_FORWARD" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
