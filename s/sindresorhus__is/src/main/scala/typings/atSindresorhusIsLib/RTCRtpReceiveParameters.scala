package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpReceiveParameters extends RTCRtpParameters {
  var encodings: Array[RTCRtpDecodingParameters]
}

object RTCRtpReceiveParameters {
  @scala.inline
  def apply(
    codecs: Array[RTCRtpCodecParameters],
    encodings: Array[RTCRtpDecodingParameters],
    headerExtensions: Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpReceiveParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs, encodings = encodings, headerExtensions = headerExtensions, rtcp = rtcp)
  
    __obj.asInstanceOf[RTCRtpReceiveParameters]
  }
}

