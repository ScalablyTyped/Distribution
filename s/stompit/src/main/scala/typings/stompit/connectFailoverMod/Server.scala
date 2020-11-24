package typings.stompit.connectFailoverMod

import typings.std.Error
import typings.stompit.connectMod.ConnectOptions
import typings.stompit.getAddressInfoMod.AddressInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends js.Object {
  
  def blacklist(): Unit = js.native
  def blacklist(error: Error): Unit = js.native
  
  var connectOptions: ConnectOptions = js.native
  
  def getBlacklistError(): Error = js.native
  
  def isBlacklisted(): Boolean = js.native
  
  var remoteAddress: AddressInfo = js.native
}
