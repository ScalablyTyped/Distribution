package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var body_html: java.lang.String
  var handle: java.lang.String
  var id: java.lang.String
  var image: Image
  var metafields: js.Array[_]
  var published: scala.Boolean
  var published_at: java.lang.String
  var published_scope: java.lang.String
  var sort_order: java.lang.String
  var template_suffix: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
}

object Collection {
  @scala.inline
  def apply(
    body_html: java.lang.String,
    handle: java.lang.String,
    id: java.lang.String,
    image: Image,
    metafields: js.Array[_],
    published: scala.Boolean,
    published_at: java.lang.String,
    published_scope: java.lang.String,
    sort_order: java.lang.String,
    template_suffix: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String
  ): Collection = {
    val __obj = js.Dynamic.literal(body_html = body_html, handle = handle, id = id, image = image, metafields = metafields, published = published, published_at = published_at, published_scope = published_scope, sort_order = sort_order, template_suffix = template_suffix, title = title, updated_at = updated_at)
  
    __obj.asInstanceOf[Collection]
  }
}

