package typings.shopifyBuy.ShopifyBuy

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
    quantity: js.UndefOr[Double] = js.undefined,
    value: String = null,
    variantId: String = null
  ): AttributeInput = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variantId != null) __obj.updateDynamic("variantId")(variantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeInput]
  }
}

