package typings
package socketclusterDashClientLib.libScclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectStatus extends js.Object {
  var authError: js.UndefOr[stdLib.Error] = js.undefined
  var authToken: js.UndefOr[js.Object] = js.undefined
  var id: java.lang.String
  var isAuthenticated: scala.Boolean
  var pingTimeout: scala.Double
}

object ConnectStatus {
  @scala.inline
  def apply(
    id: java.lang.String,
    isAuthenticated: scala.Boolean,
    pingTimeout: scala.Double,
    authError: stdLib.Error = null,
    authToken: js.Object = null
  ): ConnectStatus = {
    val __obj = js.Dynamic.literal(id = id, isAuthenticated = isAuthenticated, pingTimeout = pingTimeout)
    if (authError != null) __obj.updateDynamic("authError")(authError)
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    __obj.asInstanceOf[ConnectStatus]
  }
}

