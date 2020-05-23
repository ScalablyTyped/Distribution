package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpRtxParameters extends js.Object {
  var ssrc: js.UndefOr[Double] = js.undefined
}

object RTCRtpRtxParameters {
  @scala.inline
  def apply(ssrc: js.UndefOr[Double] = js.undefined): RTCRtpRtxParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ssrc)) __obj.updateDynamic("ssrc")(ssrc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpRtxParameters]
  }
}

