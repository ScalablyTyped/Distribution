package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpParameters extends StObject {
  
  var codecs: js.Array[RTCRtpCodecParameters] = js.native
  
  var headerExtensions: js.Array[RTCRtpHeaderExtensionParameters] = js.native
  
  var rtcp: RTCRtcpParameters = js.native
}
object RTCRtpParameters {
  
  @scala.inline
  def apply(
    codecs: js.Array[RTCRtpCodecParameters],
    headerExtensions: js.Array[RTCRtpHeaderExtensionParameters],
    rtcp: RTCRtcpParameters
  ): RTCRtpParameters = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], headerExtensions = headerExtensions.asInstanceOf[js.Any], rtcp = rtcp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpParameters]
  }
  
  @scala.inline
  implicit class RTCRtpParametersMutableBuilder[Self <: RTCRtpParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecs(value: js.Array[RTCRtpCodecParameters]): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecsVarargs(value: RTCRtpCodecParameters*): Self = StObject.set(x, "codecs", js.Array(value :_*))
    
    @scala.inline
    def setHeaderExtensions(value: js.Array[RTCRtpHeaderExtensionParameters]): Self = StObject.set(x, "headerExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderExtensionsVarargs(value: RTCRtpHeaderExtensionParameters*): Self = StObject.set(x, "headerExtensions", js.Array(value :_*))
    
    @scala.inline
    def setRtcp(value: RTCRtcpParameters): Self = StObject.set(x, "rtcp", value.asInstanceOf[js.Any])
  }
}
