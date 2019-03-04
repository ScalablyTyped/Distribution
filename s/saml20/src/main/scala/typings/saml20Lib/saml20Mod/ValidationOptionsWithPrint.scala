package typings
package saml20Lib.saml20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsWithPrint extends ValidationOptions {
  var audience: js.UndefOr[js.Any] = js.undefined
  var bypassExpiration: js.UndefOr[scala.Boolean] = js.undefined
  var thumbprint: java.lang.String
}

object ValidationOptionsWithPrint {
  @scala.inline
  def apply(
    thumbprint: java.lang.String,
    audience: js.Any = null,
    bypassExpiration: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidationOptionsWithPrint = {
    val __obj = js.Dynamic.literal(thumbprint = thumbprint)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (!js.isUndefined(bypassExpiration)) __obj.updateDynamic("bypassExpiration")(bypassExpiration)
    __obj.asInstanceOf[ValidationOptionsWithPrint]
  }
}

