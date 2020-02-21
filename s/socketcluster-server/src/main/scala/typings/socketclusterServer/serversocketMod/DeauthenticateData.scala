package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeauthenticateData extends js.Object {
  var oldAuthToken: js.UndefOr[AuthToken] = js.undefined
}

object DeauthenticateData {
  @scala.inline
  def apply(oldAuthToken: AuthToken = null): DeauthenticateData = {
    val __obj = js.Dynamic.literal()
    if (oldAuthToken != null) __obj.updateDynamic("oldAuthToken")(oldAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticateData]
  }
}

