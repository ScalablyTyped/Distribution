package typings.stompit.libConnectFailoverMod

import typings.std.Error
import typings.stompit.libConnectDashFailoverGetAddressInfoMod.AddressInfo
import typings.stompit.libConnectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var connectOptions: ConnectOptions = js.native
  var remoteAddress: AddressInfo = js.native
  def blacklist(): Unit = js.native
  def blacklist(error: Error): Unit = js.native
  def getBlacklistError(): Error = js.native
  def isBlacklisted(): Boolean = js.native
}

