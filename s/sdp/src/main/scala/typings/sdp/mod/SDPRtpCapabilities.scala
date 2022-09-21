package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPRtpCapabilities extends StObject {
  
  var codecs: js.Array[SDPCodec]
  
  var fecMechanisms: js.Array[String]
  
  var headerExtensions: js.Array[SDPHeaderExtension]
  
  var rtcp: js.UndefOr[js.Array[SDPRtcpParameters]] = js.undefined
}
object SDPRtpCapabilities {
  
  inline def apply(
    codecs: js.Array[SDPCodec],
    fecMechanisms: js.Array[String],
    headerExtensions: js.Array[SDPHeaderExtension]
  ): SDPRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], fecMechanisms = fecMechanisms.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPRtpCapabilities]
  }
  
  extension [Self <: SDPRtpCapabilities](x: Self) {
    
    inline def setCodecs(value: js.Array[SDPCodec]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setCodecsVarargs(value: SDPCodec*): Self = StObject.set(x, "codecs", js.Array(value*))
    
    inline def setFecMechanisms(value: js.Array[String]): Self = StObject.set(x, "fecMechanisms", value.asInstanceOf[js.Any])
    
    inline def setFecMechanismsVarargs(value: String*): Self = StObject.set(x, "fecMechanisms", js.Array(value*))
    
    inline def setHeaderExtensions(value: js.Array[SDPHeaderExtension]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    inline def setHeaderExtensionsVarargs(value: SDPHeaderExtension*): Self = StObject.set(x, "headerExtensions", js.Array(value*))
    
    inline def setRtcp(value: js.Array[SDPRtcpParameters]): Self = StObject.set(x, "rtcp", value.asInstanceOf[js.Any])
    
    inline def setRtcpUndefined: Self = StObject.set(x, "rtcp", js.undefined)
    
    inline def setRtcpVarargs(value: SDPRtcpParameters*): Self = StObject.set(x, "rtcp", js.Array(value*))
  }
}
