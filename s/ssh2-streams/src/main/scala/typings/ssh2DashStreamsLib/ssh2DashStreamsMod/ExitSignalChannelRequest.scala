package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitSignalChannelRequest extends ChannelRequest {
  var coredump: scala.Boolean
  var description: java.lang.String
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`exit-signal`
  var signal: java.lang.String
}

object ExitSignalChannelRequest {
  @scala.inline
  def apply(
    coredump: scala.Boolean,
    description: java.lang.String,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`exit-signal`,
    signal: java.lang.String
  ): ExitSignalChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coredump")(coredump)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ExitSignalChannelRequest]
  }
}

