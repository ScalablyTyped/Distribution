package typings.socketclusterDashClient.libScclientsocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStatus extends js.Object {
  var authError: Error
  var isAuthenticated: AuthStates
}

object AuthStatus {
  @scala.inline
  def apply(authError: Error, isAuthenticated: AuthStates): AuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError, isAuthenticated = isAuthenticated)
  
    __obj.asInstanceOf[AuthStatus]
  }
}

