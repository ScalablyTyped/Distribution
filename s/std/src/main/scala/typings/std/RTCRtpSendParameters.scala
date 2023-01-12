package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpSendParameters
  extends StObject
     with RTCRtpParameters {
  
  /* standard dom */
  var degradationPreference: js.UndefOr[RTCDegradationPreference] = js.undefined
  
  /* standard dom */
  var encodings: js.Array[RTCRtpEncodingParameters]
  
  /* standard dom */
  var transactionId: java.lang.String
}
object RTCRtpSendParameters {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: RTCRtpSendParameters] (val x: Self) extends AnyVal {
    
    inline def setDegradationPreference(value: RTCDegradationPreference): Self = StObject.set(x, "degradationPreference", value.asInstanceOf[js.Any])
    
    inline def setDegradationPreferenceUndefined: Self = StObject.set(x, "degradationPreference", js.undefined)
    
    inline def setEncodings(value: js.Array[RTCRtpEncodingParameters]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
    
    inline def setEncodingsVarargs(value: RTCRtpEncodingParameters*): Self = StObject.set(x, "encodings", js.Array(value*))
    
    inline def setTransactionId(value: java.lang.String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
