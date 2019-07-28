package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidateAttributes extends RTCStats {
  var addressSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  var candidateType: js.UndefOr[RTCStatsIceCandidateType] = js.undefined
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  var portNumber: js.UndefOr[Double] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var transport: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIceCandidateAttributes {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: RTCStatsType,
    addressSourceUrl: java.lang.String = null,
    candidateType: RTCStatsIceCandidateType = null,
    ipAddress: java.lang.String = null,
    portNumber: Int | Double = null,
    priority: Int | Double = null,
    transport: java.lang.String = null
  ): RTCIceCandidateAttributes = {
    val __obj = js.Dynamic.literal(id = id, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    if (addressSourceUrl != null) __obj.updateDynamic("addressSourceUrl")(addressSourceUrl)
    if (candidateType != null) __obj.updateDynamic("candidateType")(candidateType)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (portNumber != null) __obj.updateDynamic("portNumber")(portNumber.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[RTCIceCandidateAttributes]
  }
}

