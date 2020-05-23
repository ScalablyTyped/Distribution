package typings.stompit.socketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  var commandHandlers: js.UndefOr[CommandHandlers] = js.undefined
  var heartbeat: js.UndefOr[Heartbeat] = js.undefined
  var heartbeatDelayMargin: js.UndefOr[Double] = js.undefined
  var heartbeatOutputMargin: js.UndefOr[Double] = js.undefined
  var outgoingFrameStream: js.UndefOr[typings.stompit.outgoingFrameStreamMod.^] = js.undefined
  var resetDisconnect: js.UndefOr[Boolean] = js.undefined
  var unknownCommand: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    commandHandlers: CommandHandlers = null,
    heartbeat: Heartbeat = null,
    heartbeatDelayMargin: js.UndefOr[Double] = js.undefined,
    heartbeatOutputMargin: js.UndefOr[Double] = js.undefined,
    outgoingFrameStream: typings.stompit.outgoingFrameStreamMod.^ = null,
    resetDisconnect: js.UndefOr[Boolean] = js.undefined,
    unknownCommand: () => Unit = null
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatDelayMargin)) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatOutputMargin)) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.get.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream.asInstanceOf[js.Any])
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect.get.asInstanceOf[js.Any])
    if (unknownCommand != null) __obj.updateDynamic("unknownCommand")(js.Any.fromFunction0(unknownCommand))
    __obj.asInstanceOf[SocketOptions]
  }
}

