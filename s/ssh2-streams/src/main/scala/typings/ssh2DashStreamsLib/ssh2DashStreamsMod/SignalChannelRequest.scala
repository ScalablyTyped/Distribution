package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalChannelRequest extends ChannelRequest {
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.signal
  var signal: java.lang.String
}

object SignalChannelRequest {
  @scala.inline
  def apply(
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.signal,
    signal: java.lang.String
  ): SignalChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[SignalChannelRequest]
  }
}

