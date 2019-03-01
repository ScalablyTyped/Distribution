package typings
package stompitLib.libConnectMod.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetIpcConnectOptions
  extends nodeLib.netMod.IpcNetConnectOpts
     with BaseConnectOptions
     with ConnectOptions {
  @JSName("ssl")
  var ssl_NetIpcConnectOptions: js.UndefOr[stompitLib.stompitLibNumbers.`false`] = js.undefined
}

object NetIpcConnectOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    commandHandlers: stompitLib.libSocketMod.SocketNs.CommandHandlers = null,
    connect: js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]], 
      nodeLib.netMod.Socket
    ] = null,
    connectHeaders: ConnectHeaders = null,
    fd: scala.Int | scala.Double = null,
    heartbeat: stompitLib.libSocketMod.SocketNs.Heartbeat = null,
    heartbeatDelayMargin: scala.Int | scala.Double = null,
    heartbeatOutputMargin: scala.Int | scala.Double = null,
    outgoingFrameStream: stompitLib.libOutgoingFrameStreamMod.namespaced = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    resetDisconnect: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: stompitLib.stompitLibNumbers.`false` = null,
    timeout: scala.Int | scala.Double = null,
    unknownCommand: js.Function0[scala.Unit] = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): NetIpcConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers)
    if (connect != null) __obj.updateDynamic("connect")(connect)
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders)
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat)
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (unknownCommand != null) __obj.updateDynamic("unknownCommand")(unknownCommand)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[NetIpcConnectOptions]
  }
}

