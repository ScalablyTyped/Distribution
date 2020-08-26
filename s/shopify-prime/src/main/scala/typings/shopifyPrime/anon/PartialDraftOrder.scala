package typings.shopifyPrime.anon

import typings.shopifyPrime.addressMod.Address
import typings.shopifyPrime.appliedDiscountMod.AppliedDiscount
import typings.shopifyPrime.customerMod.Customer
import typings.shopifyPrime.draftLineItemMod.DraftLineItem
import typings.shopifyPrime.metaFieldMod.MetaField
import typings.shopifyPrime.noteAttributeMod.NoteAttribute
import typings.shopifyPrime.shippingLineMod.ShippingLine
import typings.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<shopify-prime.shopify-prime/dist/models.DraftOrder> */
@js.native
trait PartialDraftOrder extends js.Object {
  var admin_graphql_api_id: js.UndefOr[String] = js.native
  var applied_discount: js.UndefOr[AppliedDiscount] = js.native
  var billing_address: js.UndefOr[Address] = js.native
  var completed_at: js.UndefOr[String] = js.native
  var created_at: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var customer: js.UndefOr[Customer] = js.native
  var email: js.UndefOr[String] = js.native
  var id: js.UndefOr[Double] = js.native
  var invoice_sent_at: js.UndefOr[String] = js.native
  var invoice_url: js.UndefOr[String] = js.native
  var line_items: js.UndefOr[js.Array[DraftLineItem]] = js.native
  var metafields: js.UndefOr[js.Array[MetaField]] = js.native
  var name: js.UndefOr[String] = js.native
  var note: js.UndefOr[String] = js.native
  var note_attributes: js.UndefOr[js.Array[NoteAttribute]] = js.native
  var order_id: js.UndefOr[Double] = js.native
  var shipping_address: js.UndefOr[Address] = js.native
  var shipping_line: js.UndefOr[ShippingLine] = js.native
  var status: js.UndefOr[String] = js.native
  var subtotal_price: js.UndefOr[Double] = js.native
  var tags: js.UndefOr[String] = js.native
  var tax_exempt: js.UndefOr[Boolean] = js.native
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.native
  var taxes_included: js.UndefOr[Boolean] = js.native
  var total_price: js.UndefOr[Double] = js.native
  var total_tax: js.UndefOr[Double] = js.native
  var updated_at: js.UndefOr[String] = js.native
}

object PartialDraftOrder {
  @scala.inline
  def apply(): PartialDraftOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDraftOrder]
  }
  @scala.inline
  implicit class PartialDraftOrderOps[Self <: PartialDraftOrder] (val x: Self) extends AnyVal {
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
    def setAdmin_graphql_api_id(value: String): Self = this.set("admin_graphql_api_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdmin_graphql_api_id: Self = this.set("admin_graphql_api_id", js.undefined)
    @scala.inline
    def setApplied_discount(value: AppliedDiscount): Self = this.set("applied_discount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplied_discount: Self = this.set("applied_discount", js.undefined)
    @scala.inline
    def setBilling_address(value: Address): Self = this.set("billing_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_address: Self = this.set("billing_address", js.undefined)
    @scala.inline
    def setCompleted_at(value: String): Self = this.set("completed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted_at: Self = this.set("completed_at", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCustomer(value: Customer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomer: Self = this.set("customer", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInvoice_sent_at(value: String): Self = this.set("invoice_sent_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_sent_at: Self = this.set("invoice_sent_at", js.undefined)
    @scala.inline
    def setInvoice_url(value: String): Self = this.set("invoice_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_url: Self = this.set("invoice_url", js.undefined)
    @scala.inline
    def setLine_itemsVarargs(value: DraftLineItem*): Self = this.set("line_items", js.Array(value :_*))
    @scala.inline
    def setLine_items(value: js.Array[DraftLineItem]): Self = this.set("line_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine_items: Self = this.set("line_items", js.undefined)
    @scala.inline
    def setMetafieldsVarargs(value: MetaField*): Self = this.set("metafields", js.Array(value :_*))
    @scala.inline
    def setMetafields(value: js.Array[MetaField]): Self = this.set("metafields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetafields: Self = this.set("metafields", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setNote_attributesVarargs(value: NoteAttribute*): Self = this.set("note_attributes", js.Array(value :_*))
    @scala.inline
    def setNote_attributes(value: js.Array[NoteAttribute]): Self = this.set("note_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote_attributes: Self = this.set("note_attributes", js.undefined)
    @scala.inline
    def setOrder_id(value: Double): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_id: Self = this.set("order_id", js.undefined)
    @scala.inline
    def setShipping_address(value: Address): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_address: Self = this.set("shipping_address", js.undefined)
    @scala.inline
    def setShipping_line(value: ShippingLine): Self = this.set("shipping_line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_line: Self = this.set("shipping_line", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubtotal_price(value: Double): Self = this.set("subtotal_price", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotal_price: Self = this.set("subtotal_price", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTax_exempt(value: Boolean): Self = this.set("tax_exempt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_exempt: Self = this.set("tax_exempt", js.undefined)
    @scala.inline
    def setTax_linesVarargs(value: TaxLine*): Self = this.set("tax_lines", js.Array(value :_*))
    @scala.inline
    def setTax_lines(value: js.Array[TaxLine]): Self = this.set("tax_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_lines: Self = this.set("tax_lines", js.undefined)
    @scala.inline
    def setTaxes_included(value: Boolean): Self = this.set("taxes_included", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxes_included: Self = this.set("taxes_included", js.undefined)
    @scala.inline
    def setTotal_price(value: Double): Self = this.set("total_price", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_price: Self = this.set("total_price", js.undefined)
    @scala.inline
    def setTotal_tax(value: Double): Self = this.set("total_tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_tax: Self = this.set("total_tax", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

