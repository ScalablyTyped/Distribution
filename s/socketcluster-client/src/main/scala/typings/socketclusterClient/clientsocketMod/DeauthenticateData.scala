package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeauthenticateData extends js.Object {
  var oldAuthToken: js.Object | Null
  var oldSignedAuthToken: String | Null
}

object DeauthenticateData {
  @scala.inline
  def apply(oldAuthToken: js.Object = null, oldSignedAuthToken: String = null): DeauthenticateData = {
    val __obj = js.Dynamic.literal(oldAuthToken = oldAuthToken.asInstanceOf[js.Any], oldSignedAuthToken = oldSignedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticateData]
  }
}

