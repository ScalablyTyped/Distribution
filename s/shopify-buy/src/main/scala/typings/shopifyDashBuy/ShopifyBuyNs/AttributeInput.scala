package typings.shopifyDashBuy.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeInput extends js.Object {
  var id: js.UndefOr[String | Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  var variantId: js.UndefOr[String] = js.undefined
}

object AttributeInput {
  @scala.inline
  def apply(
    id: String | Double = null,
    key: String = null,
    quantity: Int | Double = null,
    value: String = null,
    variantId: String = null
  ): AttributeInput = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (variantId != null) __obj.updateDynamic("variantId")(variantId)
    __obj.asInstanceOf[AttributeInput]
  }
}

