package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpParameters extends StObject {
  
  /* standard dom */
  var codecs: js.Array[RTCRtpCodecParameters]
  
  /* standard dom */
  var headerExtensions: js.Array[RTCRtpHeaderExtensionParameters]
  
  /* standard dom */
  var rtcp: RTCRtcpParameters
}
object RTCRtpParameters {
  
  inline def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
    
    inline def setCodecs(value: js.Array[RTCRtpCodecParameters]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setCodecsVarargs(value: RTCRtpCodecParameters*): Self = StObject.set(x, "codecs", js.Array(value*))
    
    inline def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionParameters]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    inline def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionParameters*): Self = StObject.set(x, "headerExtensions", js.Array(value*))
    
    inline def setRtcp(value: RTCRtcpParameters): Self = StObject.set(x, "rtcp", value.asInstanceOf[js.Any])
  }
}
