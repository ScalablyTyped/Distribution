package typings
package socketclusterDashServerLib.scserversocketMod.SCServerSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateChangeData extends js.Object {
  var authToken: js.UndefOr[socketclusterDashServerLib.scserverMod.SCServerNs.AuthToken] = js.undefined
  var newState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated
  var oldState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated
}

