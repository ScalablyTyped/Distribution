package typings.reactRouterRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterAction extends js.Object {
  var payload: LocationActionPayload = js.native
  var `type`: /* "@@router/CALL_HISTORY_METHOD" */ String = js.native
}

object RouterAction {
  @scala.inline
  def apply(payload: LocationActionPayload, `type`: /* "@@router/CALL_HISTORY_METHOD" */ String): RouterAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterAction]
  }
  @scala.inline
  implicit class RouterActionOps[Self <: RouterAction] (val x: Self) extends AnyVal {
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
    def setPayload(value: LocationActionPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: /* "@@router/CALL_HISTORY_METHOD" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

