package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCInboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesReceived: js.UndefOr[Double] = js.undefined
  var fractionLost: js.UndefOr[Double] = js.undefined
  var jitter: js.UndefOr[Double] = js.undefined
  var packetsLost: js.UndefOr[Double] = js.undefined
  var packetsReceived: js.UndefOr[Double] = js.undefined
}

object RTCInboundRTPStreamStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: RTCStatsType,
    associateStatsId: java.lang.String = null,
    bytesReceived: js.UndefOr[Double] = js.undefined,
    codecId: java.lang.String = null,
    firCount: js.UndefOr[Double] = js.undefined,
    fractionLost: js.UndefOr[Double] = js.undefined,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    jitter: js.UndefOr[Double] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: js.UndefOr[Double] = js.undefined,
    packetsLost: js.UndefOr[Double] = js.undefined,
    packetsReceived: js.UndefOr[Double] = js.undefined,
    pliCount: js.UndefOr[Double] = js.undefined,
    sliCount: js.UndefOr[Double] = js.undefined,
    ssrc: java.lang.String = null,
    transportId: java.lang.String = null
  ): RTCInboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesReceived)) __obj.updateDynamic("bytesReceived")(bytesReceived.get.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId.asInstanceOf[js.Any])
    if (!js.isUndefined(firCount)) __obj.updateDynamic("firCount")(firCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fractionLost)) __obj.updateDynamic("fractionLost")(fractionLost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jitter)) __obj.updateDynamic("jitter")(jitter.get.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(nackCount)) __obj.updateDynamic("nackCount")(nackCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsLost)) __obj.updateDynamic("packetsLost")(packetsLost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packetsReceived)) __obj.updateDynamic("packetsReceived")(packetsReceived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pliCount)) __obj.updateDynamic("pliCount")(pliCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sliCount)) __obj.updateDynamic("sliCount")(sliCount.get.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRTPStreamStats]
  }
}

