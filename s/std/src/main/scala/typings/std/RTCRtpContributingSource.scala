package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpContributingSource extends js.Object {
  var audioLevel: js.UndefOr[Double] = js.undefined
  var rtpTimestamp: Double
  var source: Double
  var timestamp: Double
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(
    rtpTimestamp: Double,
    source: Double,
    timestamp: Double,
    audioLevel: js.UndefOr[Double] = js.undefined
  ): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(audioLevel)) __obj.updateDynamic("audioLevel")(audioLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
}

