package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpReceiveParameters extends RTCRtpParameters {
  var encodings: js.Array[RTCRtpDecodingParameters]
}

object RTCRtpReceiveParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    encodings: js.Array[RTCRtpDecodingParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpReceiveParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codecs")(codecs)
    __obj.updateDynamic("encodings")(encodings)
    __obj.updateDynamic("headerExtensions")(headerExtensions)
    __obj.updateDynamic("rtcp")(rtcp)
    __obj.asInstanceOf[RTCRtpReceiveParameters]
  }
}

