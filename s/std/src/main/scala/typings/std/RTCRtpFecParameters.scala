package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpFecParameters extends js.Object {
  var mechanism: js.UndefOr[java.lang.String] = js.undefined
  var ssrc: js.UndefOr[Double] = js.undefined
}

object RTCRtpFecParameters {
  @scala.inline
  def apply(mechanism: java.lang.String = null, ssrc: Int | Double = null): RTCRtpFecParameters = {
    val __obj = js.Dynamic.literal()
    if (mechanism != null) __obj.updateDynamic("mechanism")(mechanism.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpFecParameters]
  }
}

