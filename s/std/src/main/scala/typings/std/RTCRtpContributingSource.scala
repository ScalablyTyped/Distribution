package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpContributingSource extends js.Object {
  var audioLevel: js.UndefOr[Double] = js.undefined
  var source: Double
  var timestamp: Double
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(source: Double, timestamp: Double, audioLevel: Int | Double = null): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (audioLevel != null) __obj.updateDynamic("audioLevel")(audioLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
}

