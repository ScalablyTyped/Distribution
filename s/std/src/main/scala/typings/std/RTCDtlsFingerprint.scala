package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtlsFingerprint extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object RTCDtlsFingerprint {
  @scala.inline
  def apply(algorithm: java.lang.String = null, value: java.lang.String = null): RTCDtlsFingerprint = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsFingerprint]
  }
}

