package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCOutboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesSent: js.UndefOr[Double] = js.undefined
  var packetsSent: js.UndefOr[Double] = js.undefined
  var roundTripTime: js.UndefOr[Double] = js.undefined
  var targetBitrate: js.UndefOr[Double] = js.undefined
}

object RTCOutboundRTPStreamStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: RTCStatsType,
    associateStatsId: java.lang.String = null,
    bytesSent: js.UndefOr[Double] = js.undefined,
    codecId: java.lang.String = null,
    firCount: js.UndefOr[Double] = js.undefined,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: js.UndefOr[Double] = js.undefined,
    packetsSent: js.UndefOr[Double] = js.undefined,
    pliCount: js.UndefOr[Double] = js.undefined,
    roundTripTime: js.UndefOr[Double] = js.undefined,
    sliCount: js.UndefOr[Double] = js.undefined,
    ssrc: java.lang.String = null,
    targetBitrate: js.UndefOr[Double] = js.undefined,
    transportId: java.lang.String = null
  ): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent.get.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId.asInstanceOf[js.Any])
    if (!js.isUndefined(firCount)) __obj.updateDynamic("firCount")(firCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote.get.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(nackCount)) __obj.updateDynamic("nackCount")(nackCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsSent)) __obj.updateDynamic("packetsSent")(packetsSent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pliCount)) __obj.updateDynamic("pliCount")(pliCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(roundTripTime)) __obj.updateDynamic("roundTripTime")(roundTripTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sliCount)) __obj.updateDynamic("sliCount")(sliCount.get.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    if (!js.isUndefined(targetBitrate)) __obj.updateDynamic("targetBitrate")(targetBitrate.get.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
}

