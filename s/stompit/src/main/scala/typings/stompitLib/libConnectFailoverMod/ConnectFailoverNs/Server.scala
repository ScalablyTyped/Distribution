package typings
package stompitLib.libConnectFailoverMod.ConnectFailoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var connectOptions: stompitLib.libConnectMod.connectNs.ConnectOptions = js.native
  var remoteAddress: stompitLib.libConnectDashFailoverGetAddressInfoMod.getAddressInfoNs.AddressInfo = js.native
  def blacklist(): scala.Unit = js.native
  def blacklist(error: stdLib.Error): scala.Unit = js.native
  def getBlacklistError(): stdLib.Error = js.native
  def isBlacklisted(): scala.Boolean = js.native
}

