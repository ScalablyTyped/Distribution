package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateRequest extends js.Object {
  var authToken: AuthToken
  var socket: socketclusterDashServerLib.scserversocketMod.^
}

object AuthenticateRequest {
  @scala.inline
  def apply(authToken: AuthToken, socket: socketclusterDashServerLib.scserversocketMod.^): AuthenticateRequest = {
    val __obj = js.Dynamic.literal(authToken = authToken, socket = socket)
  
    __obj.asInstanceOf[AuthenticateRequest]
  }
}

