package typings
package socketclusterDashClientLib.libScclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStatus extends js.Object {
  var authError: stdLib.Error
  var isAuthenticated: AuthStates
}

object AuthStatus {
  @scala.inline
  def apply(authError: stdLib.Error, isAuthenticated: AuthStates): AuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError, isAuthenticated = isAuthenticated)
  
    __obj.asInstanceOf[AuthStatus]
  }
}

