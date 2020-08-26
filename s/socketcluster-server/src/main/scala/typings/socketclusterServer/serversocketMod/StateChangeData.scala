package typings.socketclusterServer.serversocketMod

import typings.socketclusterServer.socketclusterServerStrings.authenticated
import typings.socketclusterServer.socketclusterServerStrings.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateChangeData extends js.Object {
  var authToken: js.UndefOr[AuthToken] = js.native
  var newState: authenticated | unauthenticated = js.native
  var oldState: authenticated | unauthenticated = js.native
}

object StateChangeData {
  @scala.inline
  def apply(newState: authenticated | unauthenticated, oldState: authenticated | unauthenticated): StateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeData]
  }
  @scala.inline
  implicit class StateChangeDataOps[Self <: StateChangeData] (val x: Self) extends AnyVal {
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
    def setNewState(value: authenticated | unauthenticated): Self = this.set("newState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldState(value: authenticated | unauthenticated): Self = this.set("oldState", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthToken(value: AuthToken): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthToken: Self = this.set("authToken", js.undefined)
  }
  
}

