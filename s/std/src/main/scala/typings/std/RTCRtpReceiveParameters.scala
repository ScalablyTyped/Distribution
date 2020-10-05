package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpReceiveParameters extends RTCRtpParameters {
  var encodings: js.Array[RTCRtpDecodingParameters] = js.native
}

object RTCRtpReceiveParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    encodings: js.Array[RTCRtpDecodingParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpReceiveParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpReceiveParameters]
  }
  @scala.inline
  implicit class RTCRtpReceiveParametersOps[Self <: RTCRtpReceiveParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncodingsVarargs(value: RTCRtpDecodingParameters*): Self = this.set("encodings", js.Array(value :_*))
    @scala.inline
    def setEncodings(value: js.Array[RTCRtpDecodingParameters]): Self = this.set("encodings", value.asInstanceOf[js.Any])
  }
  
}

