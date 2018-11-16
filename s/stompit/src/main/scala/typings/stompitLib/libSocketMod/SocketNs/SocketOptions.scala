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

