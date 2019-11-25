package typings.saml20.saml20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsWithKey extends ValidationOptions {
  var audience: js.UndefOr[js.Any] = js.undefined
  var bypassExpiration: js.UndefOr[Boolean] = js.undefined
  var publicKey: String
}

object ValidationOptionsWithKey {
  @scala.inline
  def apply(publicKey: String, audience: js.Any = null, bypassExpiration: js.UndefOr[Boolean] = js.undefined): ValidationOptionsWithKey = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassExpiration)) __obj.updateDynamic("bypassExpiration")(bypassExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptionsWithKey]
  }
}

