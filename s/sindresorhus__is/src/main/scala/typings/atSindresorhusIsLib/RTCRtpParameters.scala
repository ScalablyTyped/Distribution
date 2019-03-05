package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpParameters extends js.Object {
  var codecs: Array[RTCRtpCodecParameters]
  var headerExtensions: Array[RTCRtpHeaderExtensionParameters]
  var rtcp: RTCRtcpParameters
}

object RTCRtpParameters {
  @scala.inline
  def apply(
    codecs: Array[RTCRtpCodecParameters],
    headerExtensions: Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs, headerExtensions = headerExtensions, rtcp = rtcp)
  
    __obj.asInstanceOf[RTCRtpParameters]
  }
}

