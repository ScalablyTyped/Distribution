package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCodingParameters extends js.Object {
  var rid: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpCodingParameters {
  @scala.inline
  def apply(rid: java.lang.String = null): RTCRtpCodingParameters = {
    val __obj = js.Dynamic.literal()
    if (rid != null) __obj.updateDynamic("rid")(rid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodingParameters]
  }
}

