package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentOptions extends js.Object {
  var requestPayerEmail: js.UndefOr[scala.Boolean] = js.undefined
  var requestPayerName: js.UndefOr[scala.Boolean] = js.undefined
  var requestPayerPhone: js.UndefOr[scala.Boolean] = js.undefined
  var requestShipping: js.UndefOr[scala.Boolean] = js.undefined
  var shippingType: js.UndefOr[java.lang.String] = js.undefined
}

object PaymentOptions {
  @scala.inline
  def apply(
    requestPayerEmail: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerName: js.UndefOr[scala.Boolean] = js.undefined,
    requestPayerPhone: js.UndefOr[scala.Boolean] = js.undefined,
    requestShipping: js.UndefOr[scala.Boolean] = js.undefined,
    shippingType: java.lang.String = null
  ): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requestPayerEmail)) __obj.updateDynamic("requestPayerEmail")(requestPayerEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerName)) __obj.updateDynamic("requestPayerName")(requestPayerName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestPayerPhone)) __obj.updateDynamic("requestPayerPhone")(requestPayerPhone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestShipping)) __obj.updateDynamic("requestShipping")(requestShipping.get.asInstanceOf[js.Any])
    if (shippingType != null) __obj.updateDynamic("shippingType")(shippingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOptions]
  }
}

