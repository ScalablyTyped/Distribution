package typings.stompit.libConnectMod

import typings.node.netMod.LookupFunction
import typings.node.netMod.Socket
import typings.node.netMod.TcpNetConnectOpts
import typings.stompit.libSocketMod.CommandHandlers
import typings.stompit.libSocketMod.Heartbeat
import typings.stompit.stompitNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetTcpConnectOptions
  extends TcpNetConnectOpts
     with BaseConnectOptions
     with ConnectOptions {
  @JSName("ssl")
  var ssl_NetTcpConnectOptions: js.UndefOr[`false`] = js.undefined
}

object NetTcpConnectOptions {
  @scala.inline
  def apply(
    port: Double,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    commandHandlers: CommandHandlers = null,
    connect: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => Socket = null,
    connectHeaders: ConnectHeaders = null,
    family: Int | Double = null,
    fd: Int | Double = null,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: Int | Double = null,
    heartbeatOutputMargin: Int | Double = null,
    hints: Int | Double = null,
    host: String = null,
    localAddress: String = null,
    localPort: Int | Double = null,
    lookup: LookupFunction = null,
    outgoingFrameStream: typings.stompit.libOutgoingFrameStreamMod.^ = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    resetDisconnect: js.UndefOr[Boolean] = js.undefined,
    ssl: `false` = null,
    timeout: Int | Double = null,
    unknownCommand: () => Unit = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): NetTcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port)
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers)
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2(connect))
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat)
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (unknownCommand != null) __obj.updateDynamic("unknownCommand")(js.Any.fromFunction0(unknownCommand))
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[NetTcpConnectOptions]
  }
}

