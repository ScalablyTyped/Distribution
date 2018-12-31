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

