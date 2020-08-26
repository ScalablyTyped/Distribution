package typings.sailthruClient.mod

import typings.sailthruClient.anon.Full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseItem extends js.Object {
  var id: String | Double = js.native
  var images: js.UndefOr[Full] = js.native
  var price: Double = js.native
  var qty: Double = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var title: String = js.native
  var url: String = js.native
  var vars: js.UndefOr[js.Object] = js.native
}

object PurchaseItem {
  @scala.inline
  def apply(id: String | Double, price: Double, qty: Double, title: String, url: String): PurchaseItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], qty = qty.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseItem]
  }
  @scala.inline
  implicit class PurchaseItemOps[Self <: PurchaseItem] (val x: Self) extends AnyVal {
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
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setQty(value: Double): Self = this.set("qty", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setImages(value: Full): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVars(value: js.Object): Self = this.set("vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
  
}

