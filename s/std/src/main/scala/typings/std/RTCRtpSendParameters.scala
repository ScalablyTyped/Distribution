package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpSendParameters extends RTCRtpParameters {
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.undefined
  var encodings: js.Array[RTCRtpEncodingParameters]
  var priority: js.UndefOr[RTCPriorityType] = js.undefined
  var transactionId: java.lang.String
}

object RTCRtpSendParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    encodings: js.Array[RTCRtpEncodingParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters,
    transactionId: java.lang.String,
    degradationPreference: RTCDegradationPreference = null,
    priority: RTCPriorityType = null
  ): RTCRtpSendParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    if (degradationPreference != null) __obj.updateDynamic("degradationPreference")(degradationPreference.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSendParameters]
  }
}

