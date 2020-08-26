package typings.shopifyPrime.optionsProductCollectionMod

import typings.shopifyPrime.optionsBaseMod.FieldOptions
import typings.shopifyPrime.optionsBaseMod.ListOptions
import typings.shopifyPrime.optionsBaseMod.PublishedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionListOptions
  extends ListOptions
     with FieldOptions
     with PublishedOptions {
  var handle: js.UndefOr[String] = js.native
  var ids: js.UndefOr[String] = js.native
  var product_id: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
}

object CollectionListOptions {
  @scala.inline
  def apply(): CollectionListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionListOptions]
  }
  @scala.inline
  implicit class CollectionListOptionsOps[Self <: CollectionListOptions] (val x: Self) extends AnyVal {
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
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setProduct_id(value: Double): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_id: Self = this.set("product_id", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

