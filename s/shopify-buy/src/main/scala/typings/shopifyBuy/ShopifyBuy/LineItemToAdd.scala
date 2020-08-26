package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineItemToAdd extends js.Object {
  var customAttributes: js.UndefOr[js.Array[CustomAttribute]] = js.native
  var quantity: Double = js.native
  var variantId: String | Double = js.native
}

object LineItemToAdd {
  @scala.inline
  def apply(quantity: Double, variantId: String | Double): LineItemToAdd = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], variantId = variantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineItemToAdd]
  }
  @scala.inline
  implicit class LineItemToAddOps[Self <: LineItemToAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariantId(value: String | Double): Self = this.set("variantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomAttributesVarargs(value: CustomAttribute*): Self = this.set("customAttributes", js.Array(value :_*))
    @scala.inline
    def setCustomAttributes(value: js.Array[CustomAttribute]): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
  }
  
}

