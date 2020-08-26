package typings.shopifyPrime.productsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductBaseOptions extends js.Object {
  /**
    * Filter by collection id
    */
  var collection_id: js.UndefOr[String] = js.native
  /**
    * Filter Redirects with given target
    */
  var product_type: js.UndefOr[String] = js.native
  /**
    * Filter by product vendor
    */
  var vendor: js.UndefOr[String] = js.native
}

object ProductBaseOptions {
  @scala.inline
  def apply(): ProductBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductBaseOptions]
  }
  @scala.inline
  implicit class ProductBaseOptionsOps[Self <: ProductBaseOptions] (val x: Self) extends AnyVal {
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
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection_id: Self = this.set("collection_id", js.undefined)
    @scala.inline
    def setProduct_type(value: String): Self = this.set("product_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_type: Self = this.set("product_type", js.undefined)
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
  
}

