package typings.shopifyPrime.draftOrderMod

import typings.shopifyPrime.addressMod.Address
import typings.shopifyPrime.appliedDiscountMod.AppliedDiscount
import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.customerMod.Customer
import typings.shopifyPrime.draftLineItemMod.DraftLineItem
import typings.shopifyPrime.metaFieldMod.MetaField
import typings.shopifyPrime.noteAttributeMod.NoteAttribute
import typings.shopifyPrime.shippingLineMod.ShippingLine
import typings.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraftOrder extends ShopifyObject {
  /**
    * Discount which will be applied to the line item or the overall order. A draft order line_item can have one discount. A draft order can have one order-level discount.
    */
  var applied_discount: AppliedDiscount = js.native
  /**
    * The mailing address associated with the payment method. This address is an optional field that will not be available on orders that do not require one.
    */
  var billing_address: Address = js.native
  /**
    * Date at which order is created and the draft order changes to completed status. The API returns this value in ISO 8601 format.
    */
  var completed_at: js.UndefOr[String] = js.native
  /**
    * This auto-generated property is the date and time when the draft order was created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: String = js.native
  /**
    * Customer associated with the draft order. Customer associated with the draft order. Used to load/remove the associated customer with customer id. When a customer is loaded, the customerΓÇÖs email address is also assocaited.
    */
  var customer: Customer = js.native
  /**
    * The customer's email address.
    */
  var email: String = js.native
  /**
    * This auto-generated property is the date and time when the invoice was emailed to the customer, in ISO 8601 format.
    */
  var invoice_sent_at: js.UndefOr[String] = js.native
  /**
    * The URL for the invoice.
    */
  var invoice_url: String = js.native
  /**
    * Product variant line item or custom line item associated to the draft order. Each draft order must include at least one line_item.
    */
  var line_items: js.Array[DraftLineItem] = js.native
  /**
    * Uses include: Creating, updating, & deserializing webhook bodies that include them.
    */
  var metafields: js.Array[MetaField] = js.native
  /**
    * Name of the draft order.
    */
  var name: String = js.native
  /**
    * The text of an optional note that a shop owner can attach to the draft order.
    */
  var note: String = js.native
  /**
    * Extra information that is added to the order.
    */
  var note_attributes: js.Array[NoteAttribute] = js.native
  /**
    * The unique numeric identifier for the order associated to the draft order, once created.
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * The mailing address to where the order will be shipped. This address is optional and will not be available on orders that do not require one.
    */
  var shipping_address: Address = js.native
  /**
    * Details the shipping method used.
    */
  var shipping_line: ShippingLine = js.native
  /**
    * Known values are "open", "invoice_sent", and "completed".
    */
  var status: String = js.native
  /**
    * Price of the order before shipping and taxes
    */
  var subtotal_price: js.UndefOr[Double] = js.native
  /**
    * Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    */
  var tags: String = js.native
  /**
    * Sets whether or not taxes are exempt for the draft order. If this field is set to false, then Shopify will refer to the taxable field for each line_item. If a customer is applied to the draft order, then Shopify will use the customer's tax_exempt field instead.
    */
  var tax_exempt: js.UndefOr[Boolean] = js.native
  /**
    * An array of tax_line objects, each of which details the total taxes applicable to the order. When creating an order through the API, tax lines may be specified on the order or the line items but not both. Tax lines specified on the order are split on the taxable line items in the created order.
    */
  var tax_lines: js.Array[TaxLine] = js.native
  /**
    * States whether or not taxes are included in the order subtotal.
    */
  var taxes_included: js.UndefOr[Boolean] = js.native
  /**
    * The sum of all the prices of all the items in the order, taxes and discounts included (must be positive).
    */
  var total_price: js.UndefOr[Double] = js.native
  /**
    * The sum of all the taxes applied to the order (must be positive).
    */
  var total_tax: js.UndefOr[Double] = js.native
  /**
    * The date and time when the order was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object DraftOrder {
  @scala.inline
  def apply(
    applied_discount: AppliedDiscount,
    billing_address: Address,
    currency: String,
    customer: Customer,
    email: String,
    invoice_url: String,
    line_items: js.Array[DraftLineItem],
    metafields: js.Array[MetaField],
    name: String,
    note: String,
    note_attributes: js.Array[NoteAttribute],
    shipping_address: Address,
    shipping_line: ShippingLine,
    status: String,
    tags: String,
    tax_lines: js.Array[TaxLine]
  ): DraftOrder = {
    val __obj = js.Dynamic.literal(applied_discount = applied_discount.asInstanceOf[js.Any], billing_address = billing_address.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], invoice_url = invoice_url.asInstanceOf[js.Any], line_items = line_items.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_attributes = note_attributes.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any], shipping_line = shipping_line.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tax_lines = tax_lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftOrder]
  }
  @scala.inline
  implicit class DraftOrderOps[Self <: DraftOrder] (val x: Self) extends AnyVal {
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
    def setApplied_discount(value: AppliedDiscount): Self = this.set("applied_discount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_address(value: Address): Self = this.set("billing_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer(value: Customer): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoice_url(value: String): Self = this.set("invoice_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine_itemsVarargs(value: DraftLineItem*): Self = this.set("line_items", js.Array(value :_*))
    @scala.inline
    def setLine_items(value: js.Array[DraftLineItem]): Self = this.set("line_items", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetafieldsVarargs(value: MetaField*): Self = this.set("metafields", js.Array(value :_*))
    @scala.inline
    def setMetafields(value: js.Array[MetaField]): Self = this.set("metafields", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote_attributesVarargs(value: NoteAttribute*): Self = this.set("note_attributes", js.Array(value :_*))
    @scala.inline
    def setNote_attributes(value: js.Array[NoteAttribute]): Self = this.set("note_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setShipping_address(value: Address): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setShipping_line(value: ShippingLine): Self = this.set("shipping_line", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTax_linesVarargs(value: TaxLine*): Self = this.set("tax_lines", js.Array(value :_*))
    @scala.inline
    def setTax_lines(value: js.Array[TaxLine]): Self = this.set("tax_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompleted_at(value: String): Self = this.set("completed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted_at: Self = this.set("completed_at", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setInvoice_sent_at(value: String): Self = this.set("invoice_sent_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_sent_at: Self = this.set("invoice_sent_at", js.undefined)
    @scala.inline
    def setOrder_id(value: Double): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_id: Self = this.set("order_id", js.undefined)
    @scala.inline
    def setSubtotal_price(value: Double): Self = this.set("subtotal_price", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotal_price: Self = this.set("subtotal_price", js.undefined)
    @scala.inline
    def setTax_exempt(value: Boolean): Self = this.set("tax_exempt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTax_exempt: Self = this.set("tax_exempt", js.undefined)
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

