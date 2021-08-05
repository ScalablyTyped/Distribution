package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpReceiveParameters
  extends StObject
     with RTCRtpParameters {
  
  var encodings: js.Array[RTCRtpDecodingParameters]
}
object RTCRtpReceiveParameters {
  
  inline def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    encodings: js.Array[RTCRtpDecodingParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpReceiveParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpReceiveParameters]
  }
  
  extension [Self <: RTCRtpReceiveParameters](x: Self) {
    
    inline def setEncodings(value: js.Array[RTCRtpDecodingParameters]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
    
    inline def setEncodingsVarargs(value: RTCRtpDecodingParameters*): Self = StObject.set(x, "encodings", js.Array(value :_*))
  }
}
