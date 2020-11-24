package typings.reduxLittleRouter.mod

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
  implicit class GoForwardActionOps[Self <: GoForwardAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: /* "ROUTER_GO_FORWARD" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
