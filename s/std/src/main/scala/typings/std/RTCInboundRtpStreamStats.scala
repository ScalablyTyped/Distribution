package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCInboundRtpStreamStats
  extends StObject
     with RTCReceivedRtpStreamStats {
  
  /* standard dom */
  var firCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var framesDecoded: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var nackCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var pliCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var qpSum: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var remoteId: js.UndefOr[java.lang.String] = js.undefined
}
object RTCInboundRtpStreamStats {
  
  inline def apply(
    id: java.lang.String,
    kind: java.lang.String,
    ssrc: Double,
    timestamp: DOMHighResTimeStamp,
    `type`: RTCStatsType
  ): RTCInboundRtpStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRtpStreamStats]
  }
  
  extension [Self <: RTCInboundRtpStreamStats](x: Self) {
    
    inline def setFirCount(value: Double): Self = StObject.set(x, "firCount", value.asInstanceOf[js.Any])
    
    inline def setFirCountUndefined: Self = StObject.set(x, "firCount", js.undefined)
    
    inline def setFramesDecoded(value: Double): Self = StObject.set(x, "framesDecoded", value.asInstanceOf[js.Any])
    
    inline def setFramesDecodedUndefined: Self = StObject.set(x, "framesDecoded", js.undefined)
    
    inline def setNackCount(value: Double): Self = StObject.set(x, "nackCount", value.asInstanceOf[js.Any])
    
    inline def setNackCountUndefined: Self = StObject.set(x, "nackCount", js.undefined)
    
    inline def setPliCount(value: Double): Self = StObject.set(x, "pliCount", value.asInstanceOf[js.Any])
    
    inline def setPliCountUndefined: Self = StObject.set(x, "pliCount", js.undefined)
    
    inline def setQpSum(value: Double): Self = StObject.set(x, "qpSum", value.asInstanceOf[js.Any])
    
    inline def setQpSumUndefined: Self = StObject.set(x, "qpSum", js.undefined)
    
    inline def setRemoteId(value: java.lang.String): Self = StObject.set(x, "remoteId", value.asInstanceOf[js.Any])
    
    inline def setRemoteIdUndefined: Self = StObject.set(x, "remoteId", js.undefined)
  }
}
