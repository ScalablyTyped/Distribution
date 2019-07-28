package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpRtxParameters extends js.Object {
  var ssrc: js.UndefOr[Double] = js.undefined
}

object RTCRtpRtxParameters {
  @scala.inline
  def apply(ssrc: Int | Double = null): RTCRtpRtxParameters = {
    val __obj = js.Dynamic.literal()
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpRtxParameters]
  }
}

