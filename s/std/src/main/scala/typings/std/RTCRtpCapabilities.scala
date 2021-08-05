package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpCapabilities extends StObject {
  
  var codecs: js.Array[RTCRtpCodecCapability]
  
  var headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
}
object RTCRtpCapabilities {
  
  inline def apply(
    codecs: js.Array[RTCRtpCodecCapability],
    headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
  ): RTCRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCapabilities]
  }
  
  extension [Self <: RTCRtpCapabilities](x: Self) {
    
    inline def setCodecs(value: js.Array[RTCRtpCodecCapability]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setCodecsVarargs(value: RTCRtpCodecCapability*): Self = StObject.set(x, "codecs", js.Array(value :_*))
    
    inline def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionCapability]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    inline def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionCapability*): Self = StObject.set(x, "headerExtensions", js.Array(value :_*))
  }
}
