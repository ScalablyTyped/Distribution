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
  def apply(muxId: java.lang.String = null, payloadType: Int | Double = null, ssrc: Int | Double = null): RTCRtpUnhandled = {
    val __obj = js.Dynamic.literal()
    if (muxId != null) __obj.updateDynamic("muxId")(muxId)
    if (payloadType != null) __obj.updateDynamic("payloadType")(payloadType.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpUnhandled]
  }
}

