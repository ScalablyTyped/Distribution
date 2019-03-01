package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codecs")(codecs)
    __obj.updateDynamic("encodings")(encodings)
    __obj.updateDynamic("headerExtensions")(headerExtensions)
    __obj.updateDynamic("rtcp")(rtcp)
    __obj.updateDynamic("transactionId")(transactionId)
    if (degradationPreference != null) __obj.updateDynamic("degradationPreference")(degradationPreference)
    __obj.asInstanceOf[RTCRtpSendParameters]
  }
}

