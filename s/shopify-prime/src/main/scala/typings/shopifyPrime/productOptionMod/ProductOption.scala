package typings.shopifyPrime.productOptionMod

import typings.shopifyPrime.baseMod.ShopifyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductOption extends ShopifyObject {
  /**
    * The name of the option.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The order of the product variant in the list of product variants. 1 is the first position.
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * The unique numeric identifier for the product.
    */
  var product_id: js.UndefOr[Double] = js.native
  /**
    * The values for the options.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object ProductOption {
  @scala.inline
  def apply(): ProductOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductOption]
  }
  @scala.inline
  implicit class ProductOptionOps[Self <: ProductOption] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setProduct_id(value: Double): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_id: Self = this.set("product_id", js.undefined)
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

