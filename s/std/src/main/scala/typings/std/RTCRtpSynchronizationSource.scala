package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpSynchronizationSource extends RTCRtpContributingSource {
  var voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined
}

object RTCRtpSynchronizationSource {
  @scala.inline
  def apply(
    rtpTimestamp: Double,
    source: Double,
    timestamp: Double,
    audioLevel: js.UndefOr[Double] = js.undefined,
    voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCRtpSynchronizationSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(audioLevel)) __obj.updateDynamic("audioLevel")(audioLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityFlag)) __obj.updateDynamic("voiceActivityFlag")(voiceActivityFlag.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSynchronizationSource]
  }
}

