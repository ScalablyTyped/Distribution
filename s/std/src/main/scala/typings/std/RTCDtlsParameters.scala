package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtlsParameters extends js.Object {
  var fingerprints: js.UndefOr[js.Array[RTCDtlsFingerprint]] = js.undefined
  var role: js.UndefOr[RTCDtlsRole] = js.undefined
}

object RTCDtlsParameters {
  @scala.inline
  def apply(fingerprints: js.Array[RTCDtlsFingerprint] = null, role: RTCDtlsRole = null): RTCDtlsParameters = {
    val __obj = js.Dynamic.literal()
    if (fingerprints != null) __obj.updateDynamic("fingerprints")(fingerprints)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[RTCDtlsParameters]
  }
}

