package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthStateChangeData extends js.Object {
  var authToken: js.UndefOr[AuthToken] = js.native
  var newAuthState: AuthStates = js.native
  var oldAuthState: AuthStates = js.native
  var signedAuthToken: js.UndefOr[SignedAuthToken] = js.native
}

object AuthStateChangeData {
  @scala.inline
  def apply(newAuthState: AuthStates, oldAuthState: AuthStates): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newAuthState = newAuthState.asInstanceOf[js.Any], oldAuthState = oldAuthState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
  @scala.inline
  implicit class AuthStateChangeDataOps[Self <: AuthStateChangeData] (val x: Self) extends AnyVal {
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
    def setNewAuthState(value: AuthStates): Self = this.set("newAuthState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldAuthState(value: AuthStates): Self = this.set("oldAuthState", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthToken(value: AuthToken): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthToken: Self = this.set("authToken", js.undefined)
    @scala.inline
    def setSignedAuthToken(value: SignedAuthToken): Self = this.set("signedAuthToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignedAuthToken: Self = this.set("signedAuthToken", js.undefined)
  }
  
}

