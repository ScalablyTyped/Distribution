package typings.reduxLittleRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ReplaceActionOps[Self <: ReplaceAction] (val x: Self) extends AnyVal {
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
    def setType(value: /* "ROUTER_REPLACE" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

