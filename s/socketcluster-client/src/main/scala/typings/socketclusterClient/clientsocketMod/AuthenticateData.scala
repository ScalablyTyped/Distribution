package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateData extends js.Object {
  var authToken: AuthToken
  var signedAuthToken: SignedAuthToken
}

object AuthenticateData {
  @scala.inline
  def apply(authToken: AuthToken, signedAuthToken: SignedAuthToken): AuthenticateData = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateData]
  }
}

