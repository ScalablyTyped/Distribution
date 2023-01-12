package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCRtpCodecCapability extends StObject {
  
  /* standard dom */
  var channels: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var clockRate: Double
  
  /* standard dom */
  var mimeType: java.lang.String
  
  /* standard dom */
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}
object RTCRtpCodecCapability {
  
  inline def apply(clockRate: Double, mimeType: java.lang.String): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCRtpCodecCapability] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setClockRate(value: Double): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: java.lang.String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setSdpFmtpLine(value: java.lang.String): Self = StObject.set(x, "sdpFmtpLine", value.asInstanceOf[js.Any])
    
    inline def setSdpFmtpLineUndefined: Self = StObject.set(x, "sdpFmtpLine", js.undefined)
  }
}
