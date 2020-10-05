package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidateAttributes extends RTCStats {
  var addressSourceUrl: js.UndefOr[java.lang.String] = js.native
  var candidateType: js.UndefOr[RTCStatsIceCandidateType] = js.native
  var ipAddress: js.UndefOr[java.lang.String] = js.native
  var portNumber: js.UndefOr[Double] = js.native
  var priority: js.UndefOr[Double] = js.native
  var transport: js.UndefOr[java.lang.String] = js.native
}

object RTCIceCandidateAttributes {
  @scala.inline
  def apply(id: java.lang.String, timestamp: Double, `type`: RTCStatsType): RTCIceCandidateAttributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidateAttributes]
  }
  @scala.inline
  implicit class RTCIceCandidateAttributesOps[Self <: RTCIceCandidateAttributes] (val x: Self) extends AnyVal {
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
    def setAddressSourceUrl(value: java.lang.String): Self = this.set("addressSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressSourceUrl: Self = this.set("addressSourceUrl", js.undefined)
    @scala.inline
    def setCandidateType(value: RTCStatsIceCandidateType): Self = this.set("candidateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandidateType: Self = this.set("candidateType", js.undefined)
    @scala.inline
    def setIpAddress(value: java.lang.String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    @scala.inline
    def setPortNumber(value: Double): Self = this.set("portNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortNumber: Self = this.set("portNumber", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTransport(value: java.lang.String): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
  }
  
}

