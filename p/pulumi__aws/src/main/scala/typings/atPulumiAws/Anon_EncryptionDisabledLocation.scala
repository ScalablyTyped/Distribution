package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionDisabledLocation extends js.Object {
  var encryptionDisabled: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object Anon_EncryptionDisabledLocation {
  @scala.inline
  def apply(
    encryptionDisabled: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    status: String = null
  ): Anon_EncryptionDisabledLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encryptionDisabled)) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled)
    if (location != null) __obj.updateDynamic("location")(location)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_EncryptionDisabledLocation]
  }
}

