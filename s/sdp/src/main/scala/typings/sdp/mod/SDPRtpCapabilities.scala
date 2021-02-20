package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPRtpCapabilities extends StObject {
  
  var codecs: js.Array[SDPCodec] = js.native
  
  var fecMechanisms: js.Array[String] = js.native
  
  var headerExtensions: js.Array[SDPHeaderExtension] = js.native
  
  var rtcp: js.UndefOr[js.Array[SDPRtcpParameters]] = js.native
}
object SDPRtpCapabilities {
  
  @scala.inline
  def apply(
    codecs: js.Array[SDPCodec],
    fecMechanisms: js.Array[String],
    headerExtensions: js.Array[SDPHeaderExtension]
  ): SDPRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], fecMechanisms = fecMechanisms.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPRtpCapabilities]
  }
  
  @scala.inline
  implicit class SDPRtpCapabilitiesMutableBuilder[Self <: SDPRtpCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecs(value: js.Array[SDPCodec]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecsVarargs(value: SDPCodec*): Self = StObject.set(x, "codecs", js.Array(value :_*))
    
    @scala.inline
    def setFecMechanisms(value: js.Array[String]): Self = StObject.set(x, "fecMechanisms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFecMechanismsVarargs(value: String*): Self = StObject.set(x, "fecMechanisms", js.Array(value :_*))
    
    @scala.inline
    def setHeaderExtensions(value: js.Array[SDPHeaderExtension]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtensionsVarargs(value: SDPHeaderExtension*): Self = StObject.set(x, "headerExtensions", js.Array(value :_*))
    
    @scala.inline
    def setRtcp(value: js.Array[SDPRtcpParameters]): Self = StObject.set(x, "rtcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpUndefined: Self = StObject.set(x, "rtcp", js.undefined)
    
    @scala.inline
    def setRtcpVarargs(value: SDPRtcpParameters*): Self = StObject.set(x, "rtcp", js.Array(value :_*))
  }
}
