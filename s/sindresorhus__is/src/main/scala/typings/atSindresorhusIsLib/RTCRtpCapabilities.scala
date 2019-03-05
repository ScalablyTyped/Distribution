package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCapabilities extends js.Object {
  var codecs: Array[RTCRtpCodecCapability]
  var headerExtensions: Array[RTCRtpHeaderExtensionCapability]
}

object RTCRtpCapabilities {
  @scala.inline
  def apply(codecs: Array[RTCRtpCodecCapability], headerExtensions: Array[RTCRtpHeaderExtensionCapability]): RTCRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs, headerExtensions = headerExtensions)
  
    __obj.asInstanceOf[RTCRtpCapabilities]
  }
}

