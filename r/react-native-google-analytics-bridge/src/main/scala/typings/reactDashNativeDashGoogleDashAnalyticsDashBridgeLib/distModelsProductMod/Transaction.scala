package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var affiliation: js.UndefOr[java.lang.String] = js.undefined
  var couponCode: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var revenue: js.UndefOr[scala.Double] = js.undefined
  var shipping: js.UndefOr[scala.Double] = js.undefined
  var tax: js.UndefOr[scala.Double] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    id: java.lang.String,
    affiliation: java.lang.String = null,
    couponCode: java.lang.String = null,
    revenue: scala.Int | scala.Double = null,
    shipping: scala.Int | scala.Double = null,
    tax: scala.Int | scala.Double = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(id = id)
    if (affiliation != null) __obj.updateDynamic("affiliation")(affiliation)
    if (couponCode != null) __obj.updateDynamic("couponCode")(couponCode)
    if (revenue != null) __obj.updateDynamic("revenue")(revenue.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (tax != null) __obj.updateDynamic("tax")(tax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

