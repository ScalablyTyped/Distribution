package typings.std

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
    val __obj = js.Dynamic.literal(codecs = codecs, encodings = encodings, headerExtensions = headerExtensions, rtcp = rtcp)
  
    __obj.asInstanceOf[RTCRtpReceiveParameters]
  }
}

