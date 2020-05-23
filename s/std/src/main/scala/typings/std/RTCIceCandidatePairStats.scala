package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceCandidatePairStats extends RTCStats {
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
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: RTCStatsType,
    availableIncomingBitrate: js.UndefOr[Double] = js.undefined,
    availableOutgoingBitrate: js.UndefOr[Double] = js.undefined,
    bytesReceived: js.UndefOr[Double] = js.undefined,
    bytesSent: js.UndefOr[Double] = js.undefined,
    localCandidateId: java.lang.String = null,
    nominated: js.UndefOr[scala.Boolean] = js.undefined,
    priority: js.UndefOr[Double] = js.undefined,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    remoteCandidateId: java.lang.String = null,
    roundTripTime: js.UndefOr[Double] = js.undefined,
    state: RTCStatsIceCandidatePairState = null,
    transportId: java.lang.String = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(availableIncomingBitrate)) __obj.updateDynamic("availableIncomingBitrate")(availableIncomingBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(availableOutgoingBitrate)) __obj.updateDynamic("availableOutgoingBitrate")(availableOutgoingBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesReceived)) __obj.updateDynamic("bytesReceived")(bytesReceived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent.get.asInstanceOf[js.Any])
    if (localCandidateId != null) __obj.updateDynamic("localCandidateId")(localCandidateId.asInstanceOf[js.Any])
    if (!js.isUndefined(nominated)) __obj.updateDynamic("nominated")(nominated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    if (remoteCandidateId != null) __obj.updateDynamic("remoteCandidateId")(remoteCandidateId.asInstanceOf[js.Any])
    if (!js.isUndefined(roundTripTime)) __obj.updateDynamic("roundTripTime")(roundTripTime.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
}

