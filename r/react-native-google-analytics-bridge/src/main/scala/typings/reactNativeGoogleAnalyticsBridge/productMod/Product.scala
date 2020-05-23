package typings.reactNativeGoogleAnalyticsBridge.productMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  var brand: js.UndefOr[String] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var couponCode: js.UndefOr[String] = js.undefined
  var id: String
  var name: String
  var price: js.UndefOr[Double] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var variant: js.UndefOr[String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    id: String,
    name: String,
    brand: String = null,
    category: String = null,
    couponCode: String = null,
    price: js.UndefOr[Double] = js.undefined,
    quantity: js.UndefOr[Double] = js.undefined,
    variant: String = null
  ): Product = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (couponCode != null) __obj.updateDynamic("couponCode")(couponCode.asInstanceOf[js.Any])
    if (!js.isUndefined(price)) __obj.updateDynamic("price")(price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

