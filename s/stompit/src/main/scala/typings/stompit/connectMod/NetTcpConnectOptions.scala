package typings.stompit.connectMod

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.OnReadOpts
import typings.node.netMod.Socket
import typings.node.netMod.TcpNetConnectOpts
import typings.stompit.socketMod.CommandHandlers
import typings.stompit.socketMod.Heartbeat
import typings.stompit.stompitBooleans.`false`
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
    family: js.UndefOr[Double] = js.undefined,
    fd: js.UndefOr[Double] = js.undefined,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: js.UndefOr[Double] = js.undefined,
    heartbeatOutputMargin: js.UndefOr[Double] = js.undefined,
    hints: js.UndefOr[Double] = js.undefined,
    host: String = null,
    localAddress: String = null,
    localPort: js.UndefOr[Double] = js.undefined,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    onread: OnReadOpts = null,
    outgoingFrameStream: typings.stompit.outgoingFrameStreamMod.^ = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    resetDisconnect: js.UndefOr[Boolean] = js.undefined,
    ssl: `false` = null,
    timeout: js.UndefOr[Double] = js.undefined,
    unknownCommand: () => Unit = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): NetTcpConnectOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2(connect))
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fd)) __obj.updateDynamic("fd")(fd.get.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatDelayMargin)) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatOutputMargin)) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort.get.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect.get.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (unknownCommand != null) __obj.updateDynamic("unknownCommand")(js.Any.fromFunction0(unknownCommand))
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetTcpConnectOptions]
  }
}

