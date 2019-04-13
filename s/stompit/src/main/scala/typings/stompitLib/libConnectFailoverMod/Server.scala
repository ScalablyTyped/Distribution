package typings
package stompitLib.libConnectFailoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var connectOptions: stompitLib.libConnectMod.ConnectOptions = js.native
  var remoteAddress: stompitLib.libConnectDashFailoverGetAddressInfoMod.AddressInfo = js.native
  def blacklist(): scala.Unit = js.native
  def blacklist(error: stdLib.Error): scala.Unit = js.native
  def getBlacklistError(): stdLib.Error = js.native
  def isBlacklisted(): scala.Boolean = js.native
}

