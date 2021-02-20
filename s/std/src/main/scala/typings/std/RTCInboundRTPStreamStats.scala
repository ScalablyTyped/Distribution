package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCInboundRTPStreamStats extends RTCRTPStreamStats {
  
  var bytesReceived: js.UndefOr[Double] = js.native
  
  var fractionLost: js.UndefOr[Double] = js.native
  
  var jitter: js.UndefOr[Double] = js.native
  
  var packetsLost: js.UndefOr[Double] = js.native
  
  var packetsReceived: js.UndefOr[Double] = js.native
}
object RTCInboundRTPStreamStats {
  
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCInboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRTPStreamStats]
  }
  
  @scala.inline
  implicit class RTCInboundRTPStreamStatsMutableBuilder[Self <: RTCInboundRTPStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    @scala.inline
    def setFractionLost(value: Double): Self = StObject.set(x, "fractionLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionLostUndefined: Self = StObject.set(x, "fractionLost", js.undefined)
    
    @scala.inline
    def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    @scala.inline
    def setPacketsLost(value: Double): Self = StObject.set(x, "packetsLost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsLostUndefined: Self = StObject.set(x, "packetsLost", js.undefined)
    
    @scala.inline
    def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsReceivedUndefined: Self = StObject.set(x, "packetsReceived", js.undefined)
  }
}
