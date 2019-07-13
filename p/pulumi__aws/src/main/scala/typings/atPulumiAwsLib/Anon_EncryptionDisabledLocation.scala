package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionDisabledLocation extends js.Object {
  var encryptionDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncryptionDisabledLocation {
  @scala.inline
  def apply(
    encryptionDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    status: java.lang.String = null
  ): Anon_EncryptionDisabledLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled)
    if (location != null) __obj.updateDynamic("location")(location)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_EncryptionDisabledLocation]
  }
}

