package typings.recurlyRecurlyJs.adyenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdyenOptions extends js.Object {
  var countryCode: js.UndefOr[String] = js.undefined
  var invoiceUuid: String
  var shopperLocale: js.UndefOr[String] = js.undefined
  var skinCode: js.UndefOr[String] = js.undefined
}

object AdyenOptions {
  @scala.inline
  def apply(
    invoiceUuid: String,
    countryCode: String = null,
    shopperLocale: String = null,
    skinCode: String = null
  ): AdyenOptions = {
    val __obj = js.Dynamic.literal(invoiceUuid = invoiceUuid.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (shopperLocale != null) __obj.updateDynamic("shopperLocale")(shopperLocale.asInstanceOf[js.Any])
    if (skinCode != null) __obj.updateDynamic("skinCode")(skinCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdyenOptions]
  }
}

