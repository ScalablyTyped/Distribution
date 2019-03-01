package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateRequest extends js.Object {
  var authToken: AuthToken
  var socket: socketclusterDashServerLib.scserversocketMod.namespaced
}

object AuthenticateRequest {
  @scala.inline
  def apply(authToken: AuthToken, socket: socketclusterDashServerLib.scserversocketMod.namespaced): AuthenticateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authToken")(authToken)
    __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[AuthenticateRequest]
  }
}

