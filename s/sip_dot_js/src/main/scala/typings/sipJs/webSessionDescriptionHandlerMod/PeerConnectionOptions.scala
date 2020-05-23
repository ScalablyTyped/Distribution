package typings.sipJs.webSessionDescriptionHandlerMod

import typings.std.RTCConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerConnectionOptions extends js.Object {
  var iceCheckingTimeout: js.UndefOr[Double] = js.undefined
  var rtcConfiguration: js.UndefOr[RTCConfiguration] = js.undefined
}

object PeerConnectionOptions {
  @scala.inline
  def apply(iceCheckingTimeout: js.UndefOr[Double] = js.undefined, rtcConfiguration: RTCConfiguration = null): PeerConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iceCheckingTimeout)) __obj.updateDynamic("iceCheckingTimeout")(iceCheckingTimeout.get.asInstanceOf[js.Any])
    if (rtcConfiguration != null) __obj.updateDynamic("rtcConfiguration")(rtcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerConnectionOptions]
  }
}

