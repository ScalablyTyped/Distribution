package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCInboundRTPStreamStats
  extends StObject
     with RTCRTPStreamStats {
  
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  var fractionLost: js.UndefOr[Double] = js.undefined
  
  var jitter: js.UndefOr[Double] = js.undefined
  
  var packetsLost: js.UndefOr[Double] = js.undefined
  
  var packetsReceived: js.UndefOr[Double] = js.undefined
}
object RTCInboundRTPStreamStats {
  
  inline def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCInboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRTPStreamStats]
  }
  
  extension [Self <: RTCInboundRTPStreamStats](x: Self) {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setFractionLost(value: Double): Self = StObject.set(x, "fractionLost", value.asInstanceOf[js.Any])
    
    inline def setFractionLostUndefined: Self = StObject.set(x, "fractionLost", js.undefined)
    
    inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    inline def setPacketsLost(value: Double): Self = StObject.set(x, "packetsLost", value.asInstanceOf[js.Any])
    
    inline def setPacketsLostUndefined: Self = StObject.set(x, "packetsLost", js.undefined)
    
    inline def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
    
    inline def setPacketsReceivedUndefined: Self = StObject.set(x, "packetsReceived", js.undefined)
  }
}
