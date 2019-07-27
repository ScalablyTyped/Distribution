package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCPeerConnectionConfiguration extends js.Object {
  var iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls]
  var iceTransportPolicy: js.UndefOr[
    reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.all | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.public | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.relay
  ] = js.undefined
}

object RTCPeerConnectionConfiguration {
  @scala.inline
  def apply(
    iceServers: js.Array[ConfigurationParamWithUrl | ConfigurationParamWithUrls],
    iceTransportPolicy: reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.all | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.public | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.relay = null
  ): RTCPeerConnectionConfiguration = {
    val __obj = js.Dynamic.literal(iceServers = iceServers)
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionConfiguration]
  }
}

