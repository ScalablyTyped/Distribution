package typings.shopifyPrime.productsMod

import typings.shopifyPrime.optionsBaseMod.DateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductListOptions
  extends ProductBaseOptions
     with DateOptions {
  /**
    * A comma-separated list of product ids
    */
  var ids: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object ProductListOptions {
  @scala.inline
  def apply(): ProductListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductListOptions]
  }
  @scala.inline
  implicit class ProductListOptionsOps[Self <: ProductListOptions] (val x: Self) extends AnyVal {
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
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

