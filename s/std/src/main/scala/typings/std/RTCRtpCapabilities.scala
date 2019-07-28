package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCapabilities extends js.Object {
  var codecs: js.Array[RTCRtpCodecCapability]
  var headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
}

object RTCRtpCapabilities {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecCapability],
    headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
  ): RTCRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs, headerExtensions = headerExtensions)
  
    __obj.asInstanceOf[RTCRtpCapabilities]
  }
}

