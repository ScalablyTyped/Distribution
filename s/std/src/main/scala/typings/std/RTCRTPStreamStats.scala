package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRTPStreamStats extends RTCStats {
  var associateStatsId: js.UndefOr[java.lang.String] = js.undefined
  var codecId: js.UndefOr[java.lang.String] = js.undefined
  var firCount: js.UndefOr[Double] = js.undefined
  var isRemote: js.UndefOr[scala.Boolean] = js.undefined
  var mediaTrackId: js.UndefOr[java.lang.String] = js.undefined
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  var nackCount: js.UndefOr[Double] = js.undefined
  var pliCount: js.UndefOr[Double] = js.undefined
  var sliCount: js.UndefOr[Double] = js.undefined
  var ssrc: js.UndefOr[java.lang.String] = js.undefined
  var transportId: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRTPStreamStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: RTCStatsType,
    associateStatsId: java.lang.String = null,
    codecId: java.lang.String = null,
    firCount: Int | Double = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: Int | Double = null,
    pliCount: Int | Double = null,
    sliCount: Int | Double = null,
    ssrc: java.lang.String = null,
    transportId: java.lang.String = null
  ): RTCRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId)
    if (codecId != null) __obj.updateDynamic("codecId")(codecId)
    if (firCount != null) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote)
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (nackCount != null) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (pliCount != null) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (sliCount != null) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc)
    if (transportId != null) __obj.updateDynamic("transportId")(transportId)
    __obj.asInstanceOf[RTCRTPStreamStats]
  }
}

