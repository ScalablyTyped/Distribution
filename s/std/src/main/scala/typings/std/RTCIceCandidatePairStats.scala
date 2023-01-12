package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidatePairStats
  extends StObject
     with RTCStats {
  
  /* standard dom */
  var availableIncomingBitrate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var availableOutgoingBitrate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var currentRoundTripTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var lastPacketReceivedTimestamp: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var lastPacketSentTimestamp: js.UndefOr[DOMHighResTimeStamp] = js.undefined
  
  /* standard dom */
  var localCandidateId: java.lang.String
  
  /* standard dom */
  var nominated: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var remoteCandidateId: java.lang.String
  
  /* standard dom */
  var requestsReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var requestsSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var responsesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var responsesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var state: RTCStatsIceCandidatePairState
  
  /* standard dom */
  var totalRoundTripTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var transportId: java.lang.String
}
object RTCIceCandidatePairStats {
  
  inline def apply(
    id: java.lang.String,
    localCandidateId: java.lang.String,
    remoteCandidateId: java.lang.String,
    state: RTCStatsIceCandidatePairState,
    timestamp: DOMHighResTimeStamp,
    transportId: java.lang.String,
    `type`: RTCStatsType
  ): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localCandidateId = localCandidateId.asInstanceOf[js.Any], remoteCandidateId = remoteCandidateId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCIceCandidatePairStats] (val x: Self) extends AnyVal {
    
    inline def setAvailableIncomingBitrate(value: Double): Self = StObject.set(x, "availableIncomingBitrate", value.asInstanceOf[js.Any])
    
    inline def setAvailableIncomingBitrateUndefined: Self = StObject.set(x, "availableIncomingBitrate", js.undefined)
    
    inline def setAvailableOutgoingBitrate(value: Double): Self = StObject.set(x, "availableOutgoingBitrate", value.asInstanceOf[js.Any])
    
    inline def setAvailableOutgoingBitrateUndefined: Self = StObject.set(x, "availableOutgoingBitrate", js.undefined)
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setCurrentRoundTripTime(value: Double): Self = StObject.set(x, "currentRoundTripTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentRoundTripTimeUndefined: Self = StObject.set(x, "currentRoundTripTime", js.undefined)
    
    inline def setLastPacketReceivedTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "lastPacketReceivedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastPacketReceivedTimestampUndefined: Self = StObject.set(x, "lastPacketReceivedTimestamp", js.undefined)
    
    inline def setLastPacketSentTimestamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "lastPacketSentTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastPacketSentTimestampUndefined: Self = StObject.set(x, "lastPacketSentTimestamp", js.undefined)
    
    inline def setLocalCandidateId(value: java.lang.String): Self = StObject.set(x, "localCandidateId", value.asInstanceOf[js.Any])
    
    inline def setNominated(value: scala.Boolean): Self = StObject.set(x, "nominated", value.asInstanceOf[js.Any])
    
    inline def setNominatedUndefined: Self = StObject.set(x, "nominated", js.undefined)
    
    inline def setRemoteCandidateId(value: java.lang.String): Self = StObject.set(x, "remoteCandidateId", value.asInstanceOf[js.Any])
    
    inline def setRequestsReceived(value: Double): Self = StObject.set(x, "requestsReceived", value.asInstanceOf[js.Any])
    
    inline def setRequestsReceivedUndefined: Self = StObject.set(x, "requestsReceived", js.undefined)
    
    inline def setRequestsSent(value: Double): Self = StObject.set(x, "requestsSent", value.asInstanceOf[js.Any])
    
    inline def setRequestsSentUndefined: Self = StObject.set(x, "requestsSent", js.undefined)
    
    inline def setResponsesReceived(value: Double): Self = StObject.set(x, "responsesReceived", value.asInstanceOf[js.Any])
    
    inline def setResponsesReceivedUndefined: Self = StObject.set(x, "responsesReceived", js.undefined)
    
    inline def setResponsesSent(value: Double): Self = StObject.set(x, "responsesSent", value.asInstanceOf[js.Any])
    
    inline def setResponsesSentUndefined: Self = StObject.set(x, "responsesSent", js.undefined)
    
    inline def setState(value: RTCStatsIceCandidatePairState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTotalRoundTripTime(value: Double): Self = StObject.set(x, "totalRoundTripTime", value.asInstanceOf[js.Any])
    
    inline def setTotalRoundTripTimeUndefined: Self = StObject.set(x, "totalRoundTripTime", js.undefined)
    
    inline def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
  }
}
