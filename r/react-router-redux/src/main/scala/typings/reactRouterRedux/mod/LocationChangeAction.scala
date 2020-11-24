package typings.reactRouterRedux.mod

import typings.reactRouterRedux.anon.LocationLocationStateprop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationChangeAction extends js.Object {
  
  var payload: LocationLocationStateprop = js.native
  
  var `type`: /* "@@router/LOCATION_CHANGE" */ String = js.native
}
object LocationChangeAction {
  
  @scala.inline
  def apply(payload: LocationLocationStateprop, `type`: /* "@@router/LOCATION_CHANGE" */ String): LocationChangeAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationChangeAction]
  }
  
  @scala.inline
  implicit class LocationChangeActionOps[Self <: LocationChangeAction] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: LocationLocationStateprop): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "@@router/LOCATION_CHANGE" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
