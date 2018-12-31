package typings
package stompitLib.libConnectMod.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConnectOptions
  extends stompitLib.libSocketMod.SocketNs.SocketOptions {
  var connect: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]], 
      nodeLib.netMod.Socket
    ]
  ] = js.undefined
  var connectHeaders: js.UndefOr[ConnectHeaders] = js.undefined
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
}

