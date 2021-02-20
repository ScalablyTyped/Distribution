package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpCapabilities extends StObject {
  
  var codecs: js.Array[RTCRtpCodecCapability] = js.native
  
  var headerExtensions: js.Array[RTCRtpHeaderExtensionCapability] = js.native
}
object RTCRtpCapabilities {
  
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecCapability],
    headerExtensions: js.Array[RTCRtpHeaderExtensionCapability]
  ): RTCRtpCapabilities = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCapabilities]
  }
  
  @scala.inline
  implicit class RTCRtpCapabilitiesMutableBuilder[Self <: RTCRtpCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecs(value: js.Array[RTCRtpCodecCapability]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecsVarargs(value: RTCRtpCodecCapability*): Self = StObject.set(x, "codecs", js.Array(value :_*))
    
    @scala.inline
    def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionCapability]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionCapability*): Self = StObject.set(x, "headerExtensions", js.Array(value :_*))
  }
}
