package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpUnhandled extends js.Object {
  var muxId: js.UndefOr[java.lang.String] = js.undefined
  var payloadType: js.UndefOr[Double] = js.undefined
  var ssrc: js.UndefOr[Double] = js.undefined
}

object RTCRtpUnhandled {
  @scala.inline
  def apply(
    muxId: java.lang.String = null,
    payloadType: js.UndefOr[Double] = js.undefined,
    ssrc: js.UndefOr[Double] = js.undefined
  ): RTCRtpUnhandled = {
    val __obj = js.Dynamic.literal()
    if (muxId != null) __obj.updateDynamic("muxId")(muxId.asInstanceOf[js.Any])
    if (!js.isUndefined(payloadType)) __obj.updateDynamic("payloadType")(payloadType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrc)) __obj.updateDynamic("ssrc")(ssrc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpUnhandled]
  }
}

