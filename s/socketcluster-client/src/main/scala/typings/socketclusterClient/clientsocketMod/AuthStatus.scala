package typings.socketclusterClient.clientsocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthStatus extends js.Object {
  var authError: Error = js.native
  var isAuthenticated: AuthStates = js.native
}

object AuthStatus {
  @scala.inline
  def apply(authError: Error, isAuthenticated: AuthStates): AuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStatus]
  }
  @scala.inline
  implicit class AuthStatusOps[Self <: AuthStatus] (val x: Self) extends AnyVal {
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
    def setAuthError(value: Error): Self = this.set("authError", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAuthenticated(value: AuthStates): Self = this.set("isAuthenticated", value.asInstanceOf[js.Any])
  }
  
}

