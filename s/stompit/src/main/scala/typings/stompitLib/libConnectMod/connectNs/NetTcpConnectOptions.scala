package typings
package stompitLib.libConnectMod.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NetTcpConnectOptions
  extends nodeLib.netMod.TcpNetConnectOpts
     with BaseConnectOptions {
  @JSName("ssl")
  var ssl_NetTcpConnectOptions: js.UndefOr[stompitLib.stompitLibNumbers.`false`] = js.undefined
}

