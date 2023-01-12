package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPCodecParameters extends StObject {
  
  var channels: Double
  
  var clockRate: Double
  
  var maxptime: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var numChannels: js.UndefOr[Double] = js.undefined
  
  var payloadType: Double
  
  var preferredPayloadType: js.UndefOr[Double] = js.undefined
}
object SDPCodecParameters {
  
  inline def apply(channels: Double, clockRate: Double, name: String, payloadType: Double): SDPCodecParameters = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPCodecParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SDPCodecParameters] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: Double): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMaxptime(value: Double): Self = StObject.set(x, "maxptime", value.asInstanceOf[js.Any])
    
    inline def setMaxptimeUndefined: Self = StObject.set(x, "maxptime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumChannels(value: Double): Self = StObject.set(x, "numChannels", value.asInstanceOf[js.Any])
    
    inline def setNumChannelsUndefined: Self = StObject.set(x, "numChannels", js.undefined)
    
    inline def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
    
    inline def setPreferredPayloadType(value: Double): Self = StObject.set(x, "preferredPayloadType", value.asInstanceOf[js.Any])
    
    inline def setPreferredPayloadTypeUndefined: Self = StObject.set(x, "preferredPayloadType", js.undefined)
  }
}
