package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpSendParameters extends RTCRtpParameters {
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.undefined
  var encodings: js.Array[RTCRtpEncodingParameters]
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
    degradationPreference: RTCDegradationPreference = null
  ): RTCRtpSendParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs, encodings = encodings, headerExtensions = headerExtensions, rtcp = rtcp, transactionId = transactionId)
    if (degradationPreference != null) __obj.updateDynamic("degradationPreference")(degradationPreference)
    __obj.asInstanceOf[RTCRtpSendParameters]
  }
}

