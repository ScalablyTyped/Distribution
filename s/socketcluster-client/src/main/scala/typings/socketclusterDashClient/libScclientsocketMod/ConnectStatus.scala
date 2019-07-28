package typings.socketclusterDashClient.libScclientsocketMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectStatus extends js.Object {
  var authError: js.UndefOr[Error] = js.undefined
  var authToken: js.UndefOr[js.Object] = js.undefined
  var id: String
  var isAuthenticated: Boolean
  var pingTimeout: Double
}

object ConnectStatus {
  @scala.inline
  def apply(
    id: String,
    isAuthenticated: Boolean,
    pingTimeout: Double,
    authError: Error = null,
    authToken: js.Object = null
  ): ConnectStatus = {
    val __obj = js.Dynamic.literal(id = id, isAuthenticated = isAuthenticated, pingTimeout = pingTimeout)
    if (authError != null) __obj.updateDynamic("authError")(authError)
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    __obj.asInstanceOf[ConnectStatus]
  }
}

