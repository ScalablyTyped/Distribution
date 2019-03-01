package typings
package socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectStatus extends js.Object {
  var authError: js.UndefOr[nodeLib.Error] = js.undefined
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
    authError: nodeLib.Error = null,
    authToken: js.Object = null
  ): ConnectStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isAuthenticated")(isAuthenticated)
    __obj.updateDynamic("pingTimeout")(pingTimeout)
    if (authError != null) __obj.updateDynamic("authError")(authError)
    if (authToken != null) __obj.updateDynamic("authToken")(authToken)
    __obj.asInstanceOf[ConnectStatus]
  }
}

