package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpCodecParameters
  extends StObject
     with RTCRtpCodec {
  
  /* standard dom */
  var payloadType: Double
}
object RTCRtpCodecParameters {
  
  inline def apply(clockRate: Double, mimeType: java.lang.String, payloadType: Double): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpCodecParameters] (val x: Self) extends AnyVal {
    
    inline def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
  }
}
