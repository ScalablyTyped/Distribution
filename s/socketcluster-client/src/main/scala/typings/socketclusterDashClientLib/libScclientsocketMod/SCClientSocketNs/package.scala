package typings
package socketclusterDashClientLib.libScclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SCClientSocketNs {
  type AuthStates = socketclusterDashClientLib.socketclusterDashClientLibStrings.authenticated | socketclusterDashClientLib.socketclusterDashClientLibStrings.unauthenticated
  type States = socketclusterDashClientLib.socketclusterDashClientLibStrings.connecting | socketclusterDashClientLib.socketclusterDashClientLibStrings.open | socketclusterDashClientLib.socketclusterDashClientLibStrings.closed
  type WatcherFunction = js.Function1[/* data */ js.Any, scala.Unit]
}
