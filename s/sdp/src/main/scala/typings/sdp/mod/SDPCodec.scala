package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPCodec
  extends StObject
     with SDPCodecParameters {
  
  var parameters: js.UndefOr[SDPCodecAdditionalParameters] = js.undefined
  
  var rtcpFeedback: js.UndefOr[js.Array[SDPFeedbackParameter]] = js.undefined
}
object SDPCodec {
  
  inline def apply(channels: Double, clockRate: Double, name: String, payloadType: Double): SDPCodec = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPCodec]
  }
  
  extension [Self <: SDPCodec](x: Self) {
    
    inline def setParameters(value: SDPCodecAdditionalParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRtcpFeedback(value: js.Array[SDPFeedbackParameter]): Self = StObject.set(x, "rtcpFeedback", value.asInstanceOf[js.Any])
    
    inline def setRtcpFeedbackUndefined: Self = StObject.set(x, "rtcpFeedback", js.undefined)
    
    inline def setRtcpFeedbackVarargs(value: SDPFeedbackParameter*): Self = StObject.set(x, "rtcpFeedback", js.Array(value :_*))
  }
}
