package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpSendParameters extends RTCRtpParameters {
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.native
  var encodings: js.Array[RTCRtpEncodingParameters] = js.native
  var priority: js.UndefOr[RTCPriorityType] = js.native
  var transactionId: java.lang.String = js.native
}

object RTCRtpSendParameters {
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    encodings: js.Array[RTCRtpEncodingParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters,
    transactionId: java.lang.String
  ): RTCRtpSendParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSendParameters]
  }
  @scala.inline
  implicit class RTCRtpSendParametersOps[Self <: RTCRtpSendParameters] (val x: Self) extends AnyVal {
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
    def setEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = this.set("encodings", js.Array(value :_*))
    @scala.inline
    def setEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = this.set("encodings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionId(value: java.lang.String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDegradationPreference(value: RTCDegradationPreference): Self = this.set("degradationPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDegradationPreference: Self = this.set("degradationPreference", js.undefined)
    @scala.inline
    def setPriority(value: RTCPriorityType): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

