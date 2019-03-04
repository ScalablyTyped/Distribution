package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends GraphModel {
  var created_at: java.lang.String
  var id: java.lang.String | scala.Double
  var position: scala.Double
  var product_id: java.lang.String
  var src: java.lang.String
  var updated_at: java.lang.String
  var variant_ids: js.Array[java.lang.String]
}

object Image {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    id: java.lang.String | scala.Double,
    position: scala.Double,
    product_id: java.lang.String,
    src: java.lang.String,
    updated_at: java.lang.String,
    variant_ids: js.Array[java.lang.String],
    attrs: js.Any = null,
    onlineStoreUrl: java.lang.String = null
  ): Image = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id.asInstanceOf[js.Any], position = position, product_id = product_id, src = src, updated_at = updated_at, variant_ids = variant_ids)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[Image]
  }
}

