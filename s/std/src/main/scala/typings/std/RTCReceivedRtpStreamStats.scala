package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCReceivedRtpStreamStats
  extends StObject
     with RTCRtpStreamStats {
  
  /* standard dom */
  var jitter: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var packetsDiscarded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var packetsLost: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var packetsReceived: js.UndefOr[Double] = js.undefined
}
object RTCReceivedRtpStreamStats {
  
  inline def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: RTCStatsType
  ): RTCReceivedRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCReceivedRtpStreamStats]
  }
  
  extension [Self <: RTCReceivedRtpStreamStats](x: Self) {
    
    inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    inline def setPacketsDiscarded(value: Double): Self = StObject.set(x, "packetsDiscarded", value.asInstanceOf[js.Any])
    
    inline def setPacketsDiscardedUndefined: Self = StObject.set(x, "packetsDiscarded", js.undefined)
    
    inline def setPacketsLost(value: Double): Self = StObject.set(x, "packetsLost", value.asInstanceOf[js.Any])
    
    inline def setPacketsLostUndefined: Self = StObject.set(x, "packetsLost", js.undefined)
    
    inline def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
    
    inline def setPacketsReceivedUndefined: Self = StObject.set(x, "packetsReceived", js.undefined)
  }
}
