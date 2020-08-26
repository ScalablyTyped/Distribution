package typings.shopifyPrime.lineItemMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.lineItemPropertyMod.LineItemProperty
import typings.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineItem extends ShopifyObject {
  var fulfillable_quantity: js.UndefOr[Double] = js.native
  var fulfillment_service: js.UndefOr[String] = js.native
  var fulfillment_status: js.UndefOr[String] = js.native
  var gift_card: js.UndefOr[Boolean] = js.native
  var grams: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var price: js.UndefOr[Double] = js.native
  var product_id: js.UndefOr[Double] = js.native
  var properties: js.UndefOr[js.Array[LineItemProperty]] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var requires_shipping: js.UndefOr[Boolean] = js.native
  var sku: js.UndefOr[String] = js.native
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.native
  var taxable: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var total_discount: js.UndefOr[Double] = js.native
  var variant_id: js.UndefOr[Double] = js.native
  var variant_title: js.UndefOr[String] = js.native
  var vendor: js.UndefOr[String] = js.native
}

object LineItem {
  @scala.inline
  def apply(): LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItem]
  }
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
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
    def setFulfillable_quantity(value: Double): Self = this.set("fulfillable_quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFulfillable_quantity: Self = this.set("fulfillable_quantity", js.undefined)
    @scala.inline
    def setFulfillment_service(value: String): Self = this.set("fulfillment_service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFulfillment_service: Self = this.set("fulfillment_service", js.undefined)
    @scala.inline
    def setFulfillment_status(value: String): Self = this.set("fulfillment_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFulfillment_status: Self = this.set("fulfillment_status", js.undefined)
    @scala.inline
    def setGift_card(value: Boolean): Self = this.set("gift_card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGift_card: Self = this.set("gift_card", js.undefined)
    @scala.inline
    def setGrams(value: Double): Self = this.set("grams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrams: Self = this.set("grams", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setProduct_id(value: Double): Self = this.set("product_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct_id: Self = this.set("product_id", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: LineItemProperty*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[LineItemProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setRequires_shipping(value: Boolean): Self = this.set("requires_shipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequires_shipping: Self = this.set("requires_shipping", js.undefined)
    @scala.inline
    def setSku(value: String): Self = this.set("sku", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSku: Self = this.set("sku", js.undefined)
    @scala.inline
    def setTax_linesVarargs(value: TaxLine*): Self = this.set("tax_lines", js.Array(value :_*))
    @scala.inline
    def setTax_lines(value: js.Array[TaxLine]): Self = this.set("tax_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_lines: Self = this.set("tax_lines", js.undefined)
    @scala.inline
    def setTaxable(value: Boolean): Self = this.set("taxable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxable: Self = this.set("taxable", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTotal_discount(value: Double): Self = this.set("total_discount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_discount: Self = this.set("total_discount", js.undefined)
    @scala.inline
    def setVariant_id(value: Double): Self = this.set("variant_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant_id: Self = this.set("variant_id", js.undefined)
    @scala.inline
    def setVariant_title(value: String): Self = this.set("variant_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant_title: Self = this.set("variant_title", js.undefined)
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
  
}

