package typings.std

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
  implicit class RTCInboundRTPStreamStatsOps[Self <: RTCInboundRTPStreamStats] (val x: Self) extends AnyVal {
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
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesReceived: Self = this.set("bytesReceived", js.undefined)
    @scala.inline
    def setFractionLost(value: Double): Self = this.set("fractionLost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionLost: Self = this.set("fractionLost", js.undefined)
    @scala.inline
    def setJitter(value: Double): Self = this.set("jitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJitter: Self = this.set("jitter", js.undefined)
    @scala.inline
    def setPacketsLost(value: Double): Self = this.set("packetsLost", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketsLost: Self = this.set("packetsLost", js.undefined)
    @scala.inline
    def setPacketsReceived(value: Double): Self = this.set("packetsReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketsReceived: Self = this.set("packetsReceived", js.undefined)
  }
  
}

