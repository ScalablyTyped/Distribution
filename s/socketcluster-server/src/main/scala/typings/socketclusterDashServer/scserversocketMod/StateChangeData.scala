package typings.socketclusterDashServer.scserversocketMod

import typings.socketclusterDashServer.scserverMod.AuthToken
import typings.socketclusterDashServer.socketclusterDashServerStrings.authenticated
import typings.socketclusterDashServer.socketclusterDashServerStrings.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChangeData extends js.Object {
  var authToken: js.UndefOr[AuthToken] = js.undefined
  var newState: authenticated | unauthenticated
  var oldState: authenticated | unauthenticated
}

object StateChangeData {
  @scala.inline
  def apply(
    newState: authenticated | unauthenticated,
    oldState: authenticated | unauthenticated,
    authToken: AuthToken = null
  ): StateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateChangeData]
  }
}

