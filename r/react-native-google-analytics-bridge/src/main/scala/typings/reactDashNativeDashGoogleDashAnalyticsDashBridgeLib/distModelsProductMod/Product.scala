package typings
package reactDashNativeDashGoogleDashAnalyticsDashBridgeLib.distModelsProductMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  var brand: js.UndefOr[java.lang.String] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var couponCode: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var name: java.lang.String
  var price: js.UndefOr[scala.Double] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var variant: js.UndefOr[java.lang.String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    brand: java.lang.String = null,
    category: java.lang.String = null,
    couponCode: java.lang.String = null,
    price: scala.Int | scala.Double = null,
    quantity: scala.Int | scala.Double = null,
    variant: java.lang.String = null
  ): Product = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (category != null) __obj.updateDynamic("category")(category)
    if (couponCode != null) __obj.updateDynamic("couponCode")(couponCode)
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[Product]
  }
}

