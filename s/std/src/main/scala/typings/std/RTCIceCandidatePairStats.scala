package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidatePairStats
  extends StObject
     with RTCStats {
  
  var availableIncomingBitrate: js.UndefOr[Double] = js.undefined
  
  var availableOutgoingBitrate: js.UndefOr[Double] = js.undefined
  
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  var localCandidateId: js.UndefOr[java.lang.String] = js.undefined
  
  var nominated: js.UndefOr[scala.Boolean] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var readable: js.UndefOr[scala.Boolean] = js.undefined
  
  var remoteCandidateId: js.UndefOr[java.lang.String] = js.undefined
  
  var roundTripTime: js.UndefOr[Double] = js.undefined
  
  var state: js.UndefOr[RTCStatsIceCandidatePairState] = js.undefined
  
  var transportId: js.UndefOr[java.lang.String] = js.undefined
  
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}
object RTCIceCandidatePairStats {
  
  inline def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
  
  extension [Self <: RTCIceCandidatePairStats](x: Self) {
    
    inline def setAvailableIncomingBitrate(value: Double): Self = StObject.set(x, "availableIncomingBitrate", value.asInstanceOf[js.Any])
    
    inline def setAvailableIncomingBitrateUndefined: Self = StObject.set(x, "availableIncomingBitrate", js.undefined)
    
    inline def setAvailableOutgoingBitrate(value: Double): Self = StObject.set(x, "availableOutgoingBitrate", value.asInstanceOf[js.Any])
    
    inline def setAvailableOutgoingBitrateUndefined: Self = StObject.set(x, "availableOutgoingBitrate", js.undefined)
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setLocalCandidateId(value: java.lang.String): Self = StObject.set(x, "localCandidateId", value.asInstanceOf[js.Any])
    
    inline def setLocalCandidateIdUndefined: Self = StObject.set(x, "localCandidateId", js.undefined)
    
    inline def setNominated(value: scala.Boolean): Self = StObject.set(x, "nominated", value.asInstanceOf[js.Any])
    
    inline def setNominatedUndefined: Self = StObject.set(x, "nominated", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReadable(value: scala.Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    
    inline def setRemoteCandidateId(value: java.lang.String): Self = StObject.set(x, "remoteCandidateId", value.asInstanceOf[js.Any])
    
    inline def setRemoteCandidateIdUndefined: Self = StObject.set(x, "remoteCandidateId", js.undefined)
    
    inline def setRoundTripTime(value: Double): Self = StObject.set(x, "roundTripTime", value.asInstanceOf[js.Any])
    
    inline def setRoundTripTimeUndefined: Self = StObject.set(x, "roundTripTime", js.undefined)
    
    inline def setState(value: RTCStatsIceCandidatePairState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    inline def setTransportIdUndefined: Self = StObject.set(x, "transportId", js.undefined)
    
    inline def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
