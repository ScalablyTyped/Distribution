package typings.shopifyDashBuy.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var body_html: String
  var handle: String
  var id: String
  var image: Image
  var metafields: js.Array[_]
  var published: Boolean
  var published_at: String
  var published_scope: String
  var sort_order: String
  var template_suffix: String
  var title: String
  var updated_at: String
}

object Collection {
  @scala.inline
  def apply(
    body_html: String,
    handle: String,
    id: String,
    image: Image,
    metafields: js.Array[_],
    published: Boolean,
    published_at: String,
    published_scope: String,
    sort_order: String,
    template_suffix: String,
    title: String,
    updated_at: String
  ): Collection = {
    val __obj = js.Dynamic.literal(body_html = body_html, handle = handle, id = id, image = image, metafields = metafields, published = published, published_at = published_at, published_scope = published_scope, sort_order = sort_order, template_suffix = template_suffix, title = title, updated_at = updated_at)
  
    __obj.asInstanceOf[Collection]
  }
}

