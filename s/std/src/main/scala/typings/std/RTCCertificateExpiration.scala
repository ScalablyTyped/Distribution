package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCCertificateExpiration extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
}

object RTCCertificateExpiration {
  @scala.inline
  def apply(expires: Int | Double = null): RTCCertificateExpiration = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCCertificateExpiration]
  }
}

