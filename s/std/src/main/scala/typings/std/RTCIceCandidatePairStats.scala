package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidatePairStats extends RTCStats {
  
  var availableIncomingBitrate: js.UndefOr[Double] = js.native
  
  var availableOutgoingBitrate: js.UndefOr[Double] = js.native
  
  var bytesReceived: js.UndefOr[Double] = js.native
  
  var bytesSent: js.UndefOr[Double] = js.native
  
  var localCandidateId: js.UndefOr[java.lang.String] = js.native
  
  var nominated: js.UndefOr[scala.Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var readable: js.UndefOr[scala.Boolean] = js.native
  
  var remoteCandidateId: js.UndefOr[java.lang.String] = js.native
  
  var roundTripTime: js.UndefOr[Double] = js.native
  
  var state: js.UndefOr[RTCStatsIceCandidatePairState] = js.native
  
  var transportId: js.UndefOr[java.lang.String] = js.native
  
  var writable: js.UndefOr[scala.Boolean] = js.native
}
object RTCIceCandidatePairStats {
  
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
  
  @scala.inline
  implicit class RTCIceCandidatePairStatsMutableBuilder[Self <: RTCIceCandidatePairStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableIncomingBitrate(value: Double): Self = StObject.set(x, "availableIncomingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableIncomingBitrateUndefined: Self = StObject.set(x, "availableIncomingBitrate", js.undefined)
    
    @scala.inline
    def setAvailableOutgoingBitrate(value: Double): Self = StObject.set(x, "availableOutgoingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableOutgoingBitrateUndefined: Self = StObject.set(x, "availableOutgoingBitrate", js.undefined)
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    @scala.inline
    def setLocalCandidateId(value: java.lang.String): Self = StObject.set(x, "localCandidateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCandidateIdUndefined: Self = StObject.set(x, "localCandidateId", js.undefined)
    
    @scala.inline
    def setNominated(value: scala.Boolean): Self = StObject.set(x, "nominated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNominatedUndefined: Self = StObject.set(x, "nominated", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReadable(value: scala.Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    
    @scala.inline
    def setRemoteCandidateId(value: java.lang.String): Self = StObject.set(x, "remoteCandidateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCandidateIdUndefined: Self = StObject.set(x, "remoteCandidateId", js.undefined)
    
    @scala.inline
    def setRoundTripTime(value: Double): Self = StObject.set(x, "roundTripTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundTripTimeUndefined: Self = StObject.set(x, "roundTripTime", js.undefined)
    
    @scala.inline
    def setState(value: RTCStatsIceCandidatePairState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportIdUndefined: Self = StObject.set(x, "transportId", js.undefined)
    
    @scala.inline
    def setWritable(value: scala.Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
