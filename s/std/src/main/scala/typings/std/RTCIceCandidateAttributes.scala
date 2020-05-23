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
    portNumber: js.UndefOr[Double] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    transport: java.lang.String = null
  ): RTCIceCandidateAttributes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (addressSourceUrl != null) __obj.updateDynamic("addressSourceUrl")(addressSourceUrl.asInstanceOf[js.Any])
    if (candidateType != null) __obj.updateDynamic("candidateType")(candidateType.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(portNumber)) __obj.updateDynamic("portNumber")(portNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidateAttributes]
  }
}

