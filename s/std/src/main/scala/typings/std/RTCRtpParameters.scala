package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpParameters extends js.Object {
  var codecs: js.Array[RTCRtpCodecParameters] = js.native
  var headerExtensions: js.Array[RTCRtpHeaderExtensionParameters] = js.native
  var rtcp: RTCRtcpParameters = js.native
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
  @scala.inline
  implicit class RTCRtpParametersOps[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
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
    def setCodecsVarargs(value: RTCRtpCodecParameters*): Self = this.set("codecs", js.Array(value :_*))
    @scala.inline
    def setCodecs(value: js.Array[RTCRtpCodecParameters]): Self = this.set("codecs", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionParameters*): Self = this.set("headerExtensions", js.Array(value :_*))
    @scala.inline
    def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionParameters]): Self = this.set("headerExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtcp(value: RTCRtcpParameters): Self = this.set("rtcp", value.asInstanceOf[js.Any])
  }
  
}

