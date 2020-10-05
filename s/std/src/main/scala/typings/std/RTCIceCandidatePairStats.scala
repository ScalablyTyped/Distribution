package typings.std

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
  implicit class RTCIceCandidatePairStatsOps[Self <: RTCIceCandidatePairStats] (val x: Self) extends AnyVal {
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
    def setAvailableIncomingBitrate(value: Double): Self = this.set("availableIncomingBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableIncomingBitrate: Self = this.set("availableIncomingBitrate", js.undefined)
    @scala.inline
    def setAvailableOutgoingBitrate(value: Double): Self = this.set("availableOutgoingBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableOutgoingBitrate: Self = this.set("availableOutgoingBitrate", js.undefined)
    @scala.inline
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesReceived: Self = this.set("bytesReceived", js.undefined)
    @scala.inline
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesSent: Self = this.set("bytesSent", js.undefined)
    @scala.inline
    def setLocalCandidateId(value: java.lang.String): Self = this.set("localCandidateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalCandidateId: Self = this.set("localCandidateId", js.undefined)
    @scala.inline
    def setNominated(value: scala.Boolean): Self = this.set("nominated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNominated: Self = this.set("nominated", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setReadable(value: scala.Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
    @scala.inline
    def setRemoteCandidateId(value: java.lang.String): Self = this.set("remoteCandidateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteCandidateId: Self = this.set("remoteCandidateId", js.undefined)
    @scala.inline
    def setRoundTripTime(value: Double): Self = this.set("roundTripTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundTripTime: Self = this.set("roundTripTime", js.undefined)
    @scala.inline
    def setState(value: RTCStatsIceCandidatePairState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTransportId(value: java.lang.String): Self = this.set("transportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportId: Self = this.set("transportId", js.undefined)
    @scala.inline
    def setWritable(value: scala.Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
  
}

