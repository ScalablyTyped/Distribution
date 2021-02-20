package typings.sdp.mod

import org.scalablytyped.runtime.StObject
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
  implicit class SDPCodecMutableBuilder[Self <: SDPCodec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SDPCodecAdditionalParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setRtcpFeedback(value: js.Array[SDPFeedbackParameter]): Self = StObject.set(x, "rtcpFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpFeedbackUndefined: Self = StObject.set(x, "rtcpFeedback", js.undefined)
    
    @scala.inline
    def setRtcpFeedbackVarargs(value: SDPFeedbackParameter*): Self = StObject.set(x, "rtcpFeedback", js.Array(value :_*))
  }
}
