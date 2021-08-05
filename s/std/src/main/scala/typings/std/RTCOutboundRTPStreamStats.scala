package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOutboundRTPStreamStats
  extends StObject
     with RTCRTPStreamStats {
  
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  var packetsSent: js.UndefOr[Double] = js.undefined
  
  var roundTripTime: js.UndefOr[Double] = js.undefined
  
  var targetBitrate: js.UndefOr[Double] = js.undefined
}
object RTCOutboundRTPStreamStats {
  
  inline def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
  
  extension [Self <: RTCOutboundRTPStreamStats](x: Self) {
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setPacketsSent(value: Double): Self = StObject.set(x, "packetsSent", value.asInstanceOf[js.Any])
    
    inline def setPacketsSentUndefined: Self = StObject.set(x, "packetsSent", js.undefined)
    
    inline def setRoundTripTime(value: Double): Self = StObject.set(x, "roundTripTime", value.asInstanceOf[js.Any])
    
    inline def setRoundTripTimeUndefined: Self = StObject.set(x, "roundTripTime", js.undefined)
    
    inline def setTargetBitrate(value: Double): Self = StObject.set(x, "targetBitrate", value.asInstanceOf[js.Any])
    
    inline def setTargetBitrateUndefined: Self = StObject.set(x, "targetBitrate", js.undefined)
  }
}
