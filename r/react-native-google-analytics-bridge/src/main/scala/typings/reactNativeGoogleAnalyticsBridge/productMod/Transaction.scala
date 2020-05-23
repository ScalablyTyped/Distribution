package typings.reactNativeGoogleAnalyticsBridge.productMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var affiliation: js.UndefOr[String] = js.undefined
  var couponCode: js.UndefOr[String] = js.undefined
  var id: String
  var revenue: js.UndefOr[Double] = js.undefined
  var shipping: js.UndefOr[Double] = js.undefined
  var tax: js.UndefOr[Double] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    id: String,
    affiliation: String = null,
    couponCode: String = null,
    revenue: js.UndefOr[Double] = js.undefined,
    shipping: js.UndefOr[Double] = js.undefined,
    tax: js.UndefOr[Double] = js.undefined
  ): Transaction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (couponCode != null) __obj.updateDynamic("couponCode")(couponCode.asInstanceOf[js.Any])
    if (!js.isUndefined(revenue)) __obj.updateDynamic("revenue")(revenue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shipping)) __obj.updateDynamic("shipping")(shipping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tax)) __obj.updateDynamic("tax")(tax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

