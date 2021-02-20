package typings.std

import org.scalablytyped.runtime.StObject
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
  implicit class RTCRtpSendParametersMutableBuilder[Self <: RTCRtpSendParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDegradationPreference(value: RTCDegradationPreference): Self = StObject.set(x, "degradationPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDegradationPreferenceUndefined: Self = StObject.set(x, "degradationPreference", js.undefined)
    
    @scala.inline
    def setEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = StObject.set(x, "encodings", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: RTCPriorityType): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setTransactionId(value: java.lang.String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
