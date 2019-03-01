package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCOutboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesSent: js.UndefOr[scala.Double] = js.undefined
  var packetsSent: js.UndefOr[scala.Double] = js.undefined
  var roundTripTime: js.UndefOr[scala.Double] = js.undefined
  var targetBitrate: js.UndefOr[scala.Double] = js.undefined
}

object RTCOutboundRTPStreamStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: scala.Double,
    `type`: RTCStatsType,
    associateStatsId: java.lang.String = null,
    bytesSent: scala.Int | scala.Double = null,
    codecId: java.lang.String = null,
    firCount: scala.Int | scala.Double = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: scala.Int | scala.Double = null,
    packetsSent: scala.Int | scala.Double = null,
    pliCount: scala.Int | scala.Double = null,
    roundTripTime: scala.Int | scala.Double = null,
    sliCount: scala.Int | scala.Double = null,
    ssrc: java.lang.String = null,
    targetBitrate: scala.Int | scala.Double = null,
    transportId: java.lang.String = null
  ): RTCOutboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("timestamp")(timestamp)
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId)
    if (bytesSent != null) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId)
    if (firCount != null) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote)
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (nackCount != null) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (packetsSent != null) __obj.updateDynamic("packetsSent")(packetsSent.asInstanceOf[js.Any])
    if (pliCount != null) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (roundTripTime != null) __obj.updateDynamic("roundTripTime")(roundTripTime.asInstanceOf[js.Any])
    if (sliCount != null) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc)
    if (targetBitrate != null) __obj.updateDynamic("targetBitrate")(targetBitrate.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId)
    __obj.asInstanceOf[RTCOutboundRTPStreamStats]
  }
}

