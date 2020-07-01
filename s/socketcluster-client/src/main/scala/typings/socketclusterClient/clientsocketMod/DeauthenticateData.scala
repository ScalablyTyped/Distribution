package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeauthenticateData extends js.Object {
  var oldAuthToken: AuthToken | Null
  var oldSignedAuthToken: SignedAuthToken | Null
}

object DeauthenticateData {
  @scala.inline
  def apply(oldAuthToken: AuthToken = null, oldSignedAuthToken: SignedAuthToken = null): DeauthenticateData = {
    val __obj = js.Dynamic.literal(oldAuthToken = oldAuthToken.asInstanceOf[js.Any], oldSignedAuthToken = oldSignedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticateData]
  }
}

