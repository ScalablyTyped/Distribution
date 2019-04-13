package typings
package socketclusterDashServerLib.scserversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChangeData extends js.Object {
  var authToken: js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken] = js.undefined
  var newState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated
  var oldState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated
}

object StateChangeData {
  @scala.inline
  def apply(
    newState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated,
    oldState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated,
    authToken: socketclusterDashServerLib.scserverMod.AuthToken = null
  ): StateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    __obj.asInstanceOf[StateChangeData]
  }
}

