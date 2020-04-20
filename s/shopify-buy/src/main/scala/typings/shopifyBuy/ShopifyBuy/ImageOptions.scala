package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  var maxHeight: Double
  var maxWidth: Double
}

object ImageOptions {
  @scala.inline
  def apply(maxHeight: Double, maxWidth: Double): ImageOptions = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

