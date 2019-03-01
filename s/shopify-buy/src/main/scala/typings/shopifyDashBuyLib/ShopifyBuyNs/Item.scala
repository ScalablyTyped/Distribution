package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var quantity: scala.Double
  var variant: ProductVariant
}

object Item {
  @scala.inline
  def apply(quantity: scala.Double, variant: ProductVariant): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("quantity")(quantity)
    __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[Item]
  }
}

