package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var quantity: Double
  var variant: ProductVariant
}

object Item {
  @scala.inline
  def apply(quantity: Double, variant: ProductVariant): Item = {
    val __obj = js.Dynamic.literal(quantity = quantity, variant = variant)
  
    __obj.asInstanceOf[Item]
  }
}

