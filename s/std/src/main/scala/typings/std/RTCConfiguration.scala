package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCConfiguration extends js.Object {
  var bundlePolicy: js.UndefOr[RTCBundlePolicy] = js.undefined
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.undefined
  var iceCandidatePoolSize: js.UndefOr[Double] = js.undefined
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
  var rtcpMuxPolicy: js.UndefOr[RTCRtcpMuxPolicy] = js.undefined
}

object RTCConfiguration {
  @scala.inline
  def apply(
    bundlePolicy: RTCBundlePolicy = null,
    certificates: js.Array[RTCCertificate] = null,
    iceCandidatePoolSize: js.UndefOr[Double] = js.undefined,
    iceServers: js.Array[RTCIceServer] = null,
    iceTransportPolicy: RTCIceTransportPolicy = null,
    peerIdentity: java.lang.String = null,
    rtcpMuxPolicy: RTCRtcpMuxPolicy = null
  ): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    if (bundlePolicy != null) __obj.updateDynamic("bundlePolicy")(bundlePolicy.asInstanceOf[js.Any])
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (!js.isUndefined(iceCandidatePoolSize)) __obj.updateDynamic("iceCandidatePoolSize")(iceCandidatePoolSize.get.asInstanceOf[js.Any])
    if (iceServers != null) __obj.updateDynamic("iceServers")(iceServers.asInstanceOf[js.Any])
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy.asInstanceOf[js.Any])
    if (peerIdentity != null) __obj.updateDynamic("peerIdentity")(peerIdentity.asInstanceOf[js.Any])
    if (rtcpMuxPolicy != null) __obj.updateDynamic("rtcpMuxPolicy")(rtcpMuxPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCConfiguration]
  }
}

