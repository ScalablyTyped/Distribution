package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationChangedAction extends RouterActions {
  
  var payload: Location = js.native
  
  var `type`: /* "ROUTER_LOCATION_CHANGED" */ String = js.native
}
object LocationChangedAction {
  
  @scala.inline
  def apply(payload: Location, `type`: /* "ROUTER_LOCATION_CHANGED" */ String): LocationChangedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangedAction]
  }
  
  @scala.inline
  implicit class LocationChangedActionOps[Self <: LocationChangedAction] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: Location): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "ROUTER_LOCATION_CHANGED" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
