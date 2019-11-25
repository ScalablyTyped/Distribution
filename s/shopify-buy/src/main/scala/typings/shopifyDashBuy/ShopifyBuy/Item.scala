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
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Item]
  }
}

