package typings.shopifyBuy.ShopifyBuy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends GraphModel {
  var created_at: String = js.native
  var id: String | Double = js.native
  var position: Double = js.native
  var product_id: String = js.native
  var src: String = js.native
  var updated_at: String = js.native
  var variant_ids: js.Array[String] = js.native
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
    variant_ids: js.Array[String]
  ): Image = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], variant_ids = variant_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
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
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct_id(value: String): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariant_idsVarargs(value: String*): Self = this.set("variant_ids", js.Array(value :_*))
    @scala.inline
    def setVariant_ids(value: js.Array[String]): Self = this.set("variant_ids", value.asInstanceOf[js.Any])
  }
  
}

