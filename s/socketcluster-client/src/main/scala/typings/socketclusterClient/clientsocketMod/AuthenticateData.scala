package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateData extends js.Object {
  var authToken: js.Object
  var signedAuthToken: String
}

object AuthenticateData {
  @scala.inline
  def apply(authToken: js.Object, signedAuthToken: String): AuthenticateData = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateData]
  }
}

