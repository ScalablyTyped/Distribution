package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateData extends js.Object {
  var authToken: js.UndefOr[AuthToken] = js.undefined
}

object AuthenticateData {
  @scala.inline
  def apply(authToken: AuthToken = null): AuthenticateData = {
    val __obj = js.Dynamic.literal()
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateData]
  }
}

