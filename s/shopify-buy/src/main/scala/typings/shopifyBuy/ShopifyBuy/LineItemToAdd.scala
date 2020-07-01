package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineItemToAdd extends js.Object {
  var customAttributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
  var quantity: Double
  var variantId: String | Double
}

object LineItemToAdd {
  @scala.inline
  def apply(quantity: Double, variantId: String | Double, customAttributes: js.Array[CustomAttribute] = null): LineItemToAdd = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItemToAdd]
  }
}

