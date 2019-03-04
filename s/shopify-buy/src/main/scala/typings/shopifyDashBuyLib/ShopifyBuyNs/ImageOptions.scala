package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  var maxHeight: scala.Double
  var maxWidth: scala.Double
}

object ImageOptions {
  @scala.inline
  def apply(maxHeight: scala.Double, maxWidth: scala.Double): ImageOptions = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight, maxWidth = maxWidth)
  
    __obj.asInstanceOf[ImageOptions]
  }
}

