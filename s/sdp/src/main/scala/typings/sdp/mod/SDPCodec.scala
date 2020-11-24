package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPCodec extends SDPCodecParameters {
  
  var parameters: js.UndefOr[SDPCodecAdditionalParameters] = js.native
  
  var rtcpFeedback: js.UndefOr[js.Array[SDPFeedbackParameter]] = js.native
}
object SDPCodec {
  
  @scala.inline
  def apply(channels: Double, clockRate: Double, name: String, payloadType: Double): SDPCodec = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPCodec]
  }
  
  @scala.inline
  implicit class SDPCodecOps[Self <: SDPCodec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: SDPCodecAdditionalParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setRtcpFeedbackVarargs(value: SDPFeedbackParameter*): Self = this.set("rtcpFeedback", js.Array(value :_*))
    
    @scala.inline
    def setRtcpFeedback(value: js.Array[SDPFeedbackParameter]): Self = this.set("rtcpFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtcpFeedback: Self = this.set("rtcpFeedback", js.undefined)
  }
}
