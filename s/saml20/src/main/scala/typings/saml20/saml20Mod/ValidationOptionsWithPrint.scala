package typings.saml20.saml20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsWithPrint extends ValidationOptions {
  var audience: js.UndefOr[js.Any] = js.undefined
  var bypassExpiration: js.UndefOr[Boolean] = js.undefined
  var thumbprint: String
}

object ValidationOptionsWithPrint {
  @scala.inline
  def apply(thumbprint: String, audience: js.Any = null, bypassExpiration: js.UndefOr[Boolean] = js.undefined): ValidationOptionsWithPrint = {
    val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassExpiration)) __obj.updateDynamic("bypassExpiration")(bypassExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsWithPrint]
  }
}

