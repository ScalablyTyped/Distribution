package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCOutboundRTPStreamStats extends RTCRTPStreamStats {
  
  var bytesSent: js.UndefOr[Double] = js.native
  
  var packetsSent: js.UndefOr[Double] = js.native
  
  var roundTripTime: js.UndefOr[Double] = js.native
  
  var targetBitrate: js.UndefOr[Double] = js.native
}
object RTCOutboundRTPStreamStats {
  
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
  
  @scala.inline
  implicit class RTCOutboundRTPStreamStatsOps[Self <: RTCOutboundRTPStreamStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBytesSent: Self = this.set("bytesSent", js.undefined)
    
    @scala.inline
    def setPacketsSent(value: Double): Self = this.set("packetsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketsSent: Self = this.set("packetsSent", js.undefined)
    
    @scala.inline
    def setRoundTripTime(value: Double): Self = this.set("roundTripTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundTripTime: Self = this.set("roundTripTime", js.undefined)
    
    @scala.inline
    def setTargetBitrate(value: Double): Self = this.set("targetBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetBitrate: Self = this.set("targetBitrate", js.undefined)
  }
}
