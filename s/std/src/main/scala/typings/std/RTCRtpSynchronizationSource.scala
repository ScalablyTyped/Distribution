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
    source: Double,
    timestamp: Double,
    audioLevel: Int | Double = null,
    voiceActivityFlag: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCRtpSynchronizationSource = {
    val __obj = js.Dynamic.literal(source = source, timestamp = timestamp)
    if (audioLevel != null) __obj.updateDynamic("audioLevel")(audioLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityFlag)) __obj.updateDynamic("voiceActivityFlag")(voiceActivityFlag)
    __obj.asInstanceOf[RTCRtpSynchronizationSource]
  }
}

