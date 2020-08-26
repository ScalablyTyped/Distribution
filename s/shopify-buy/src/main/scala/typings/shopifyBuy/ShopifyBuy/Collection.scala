package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  var body_html: String = js.native
  var handle: String = js.native
  var id: String = js.native
  var image: Image = js.native
  var metafields: js.Array[_] = js.native
  var published: Boolean = js.native
  var published_at: String = js.native
  var published_scope: String = js.native
  var sort_order: String = js.native
  var template_suffix: String = js.native
  var title: String = js.native
  var updated_at: String = js.native
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
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody_html(value: String): Self = this.set("body_html", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetafieldsVarargs(value: js.Any*): Self = this.set("metafields", js.Array(value :_*))
    @scala.inline
    def setMetafields(value: js.Array[_]): Self = this.set("metafields", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublished(value: Boolean): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublished_at(value: String): Self = this.set("published_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublished_scope(value: String): Self = this.set("published_scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setSort_order(value: String): Self = this.set("sort_order", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_suffix(value: String): Self = this.set("template_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
  }
  
}

