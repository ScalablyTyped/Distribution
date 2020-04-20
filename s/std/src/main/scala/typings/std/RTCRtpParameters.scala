package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpParameters extends js.Object {
  var codecs: js.Array[RTCRtpCodecParameters]
  var headerExtensions: js.Array[RTCRtpHeaderExtensionParameters]
  var rtcp: RTCRtcpParameters
}

object RTCRtpParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
}

