package typings.stompit.connectMod

import typings.stompit.stompitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stompit.connectMod.NetTcpConnectOptions
  - typings.stompit.connectMod.NetIpcConnectOptions
  - typings.stompit.connectMod.SslConnectOptions
*/
trait ConnectOptions extends js.Object

object ConnectOptions {
  @scala.inline
  def NetTcpConnectOptions(port: Double): ConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  def NetIpcConnectOptions(path: String): ConnectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
  @scala.inline
  def SslConnectOptions(ssl: `true`): ConnectOptions = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

