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
    bytesSent: Int | Double = null,
    codecId: java.lang.String = null,
    firCount: Int | Double = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: Int | Double = null,
    packetsSent: Int | Double = null,
    pliCount: Int | Double = null,
    roundTripTime: Int | Double = null,
    sliCount: Int | Double = null,
    ssrc: java.lang.String = null,
    targetBitrate: Int | Double = null,
    transportId: java.lang.String = null
  ): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId.asInstanceOf[js.Any])
    if (bytesSent != null) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId.asInstanceOf[js.Any])
    if (firCount != null) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (nackCount != null) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (packetsSent != null) __obj.updateDynamic("packetsSent")(packetsSent.asInstanceOf[js.Any])
    if (pliCount != null) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (roundTripTime != null) __obj.updateDynamic("roundTripTime")(roundTripTime.asInstanceOf[js.Any])
    if (sliCount != null) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    if (targetBitrate != null) __obj.updateDynamic("targetBitrate")(targetBitrate.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
}

