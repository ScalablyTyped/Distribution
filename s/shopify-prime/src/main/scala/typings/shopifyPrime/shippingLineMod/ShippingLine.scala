package typings.shopifyPrime.shippingLineMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShippingLine extends ShopifyObject {
  /**
    * A reference to the shipping method.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * The price of this shipping method.
    */
  var price: js.UndefOr[Double] = js.native
  /**
    * The source of the shipping method.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * A list of <see cref="ShopifyTaxLine"/> objects, each of which details the taxes applicable to this <see cref="ShopifyShippingLine"/>.
    */
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.native
  /**
    * The title of the shipping method.
    */
  var title: js.UndefOr[String] = js.native
}

object ShippingLine {
  @scala.inline
  def apply(): ShippingLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingLine]
  }
  @scala.inline
  implicit class ShippingLineOps[Self <: ShippingLine] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTax_linesVarargs(value: TaxLine*): Self = this.set("tax_lines", js.Array(value :_*))
    @scala.inline
    def setTax_lines(value: js.Array[TaxLine]): Self = this.set("tax_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_lines: Self = this.set("tax_lines", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

