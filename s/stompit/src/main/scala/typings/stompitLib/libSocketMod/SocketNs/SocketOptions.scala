package typings
package stompitLib.libSocketMod.SocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var commandHandlers: js.UndefOr[CommandHandlers] = js.undefined
  var heartbeat: js.UndefOr[Heartbeat] = js.undefined
  var heartbeatDelayMargin: js.UndefOr[scala.Double] = js.undefined
  var heartbeatOutputMargin: js.UndefOr[scala.Double] = js.undefined
  var outgoingFrameStream: js.UndefOr[stompitLib.libOutgoingFrameStreamMod.namespaced] = js.undefined
  var resetDisconnect: js.UndefOr[scala.Boolean] = js.undefined
  var unknownCommand: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    commandHandlers: CommandHandlers = null,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: scala.Int | scala.Double = null,
    heartbeatOutputMargin: scala.Int | scala.Double = null,
    outgoingFrameStream: stompitLib.libOutgoingFrameStreamMod.namespaced = null,
    resetDisconnect: js.UndefOr[scala.Boolean] = js.undefined,
    unknownCommand: js.Function0[scala.Unit] = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers)
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat)
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream)
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect)
    if (unknownCommand != null) __obj.updateDynamic("unknownCommand")(unknownCommand)
    __obj.asInstanceOf[SocketOptions]
  }
}

