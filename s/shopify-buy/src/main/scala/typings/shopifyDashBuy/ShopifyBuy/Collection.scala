package typings.shopifyDashBuy.ShopifyBuy

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
    val __obj = js.Dynamic.literal(body_html = body_html.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], published_at = published_at.asInstanceOf[js.Any], published_scope = published_scope.asInstanceOf[js.Any], sort_order = sort_order.asInstanceOf[js.Any], template_suffix = template_suffix.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Collection]
  }
}

