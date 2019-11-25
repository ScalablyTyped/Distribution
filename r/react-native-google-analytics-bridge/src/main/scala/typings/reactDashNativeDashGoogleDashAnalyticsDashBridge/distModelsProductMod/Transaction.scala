package typings.reactDashNativeDashGoogleDashAnalyticsDashBridge.distModelsProductMod

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
    revenue: Int | Double = null,
    shipping: Int | Double = null,
    tax: Int | Double = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation.asInstanceOf[js.Any])
    if (couponCode != null) __obj.updateDynamic("couponCode")(couponCode.asInstanceOf[js.Any])
    if (revenue != null) __obj.updateDynamic("revenue")(revenue.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

