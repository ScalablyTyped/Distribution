package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCCertificateExpiration extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
}

object RTCCertificateExpiration {
  @scala.inline
  def apply(expires: js.UndefOr[Double] = js.undefined): RTCCertificateExpiration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCCertificateExpiration]
  }
}

