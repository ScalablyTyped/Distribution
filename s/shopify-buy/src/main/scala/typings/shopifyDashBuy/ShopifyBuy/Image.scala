package typings.shopifyDashBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends GraphModel {
  var created_at: String
  var id: String | Double
  var position: Double
  var product_id: String
  var src: String
  var updated_at: String
  var variant_ids: js.Array[String]
}

object Image {
  @scala.inline
  def apply(
    created_at: String,
    id: String | Double,
    position: Double,
    product_id: String,
    src: String,
    updated_at: String,
    variant_ids: js.Array[String],
    attrs: js.Any = null,
    onlineStoreUrl: String = null
  ): Image = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id.asInstanceOf[js.Any], position = position, product_id = product_id, src = src, updated_at = updated_at, variant_ids = variant_ids)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl)
    __obj.asInstanceOf[Image]
  }
}

