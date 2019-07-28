package typings.shopifyDashPrime.distModelsDraftUnderscoreOrderMod

import typings.shopifyDashPrime.distModelsAddressMod.Address
import typings.shopifyDashPrime.distModelsAppliedUnderscoreDiscountMod.AppliedDiscount
import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.distModelsCustomerMod.Customer
import typings.shopifyDashPrime.distModelsDraftUnderscoreLineUnderscoreItemMod.DraftLineItem
import typings.shopifyDashPrime.distModelsMetaUnderscoreFieldMod.MetaField
import typings.shopifyDashPrime.distModelsNoteUnderscoreAttributeMod.NoteAttribute
import typings.shopifyDashPrime.distModelsShippingUnderscoreLineMod.ShippingLine
import typings.shopifyDashPrime.distModelsTaxUnderscoreLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftOrder extends ShopifyObject {
  /**
    * Discount which will be applied to the line item or the overall order. A draft order line_item can have one discount. A draft order can have one order-level discount.
    */
  var applied_discount: AppliedDiscount
  /**
    * The mailing address associated with the payment method. This address is an optional field that will not be available on orders that do not require one.
    */
  var billing_address: Address
  /**
    * Date at which order is created and the draft order changes to completed status. The API returns this value in ISO 8601 format.
    */
  var completed_at: js.UndefOr[String] = js.undefined
  /**
    * This auto-generated property is the date and time when the draft order was created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: String
  /**
    * Customer associated with the draft order. Customer associated with the draft order. Used to load/remove the associated customer with customer id. When a customer is loaded, the customerΓÇÖs email address is also assocaited.
    */
  var customer: Customer
  /**
    * The customer's email address.
    */
  var email: String
  /**
    * This auto-generated property is the date and time when the invoice was emailed to the customer, in ISO 8601 format.
    */
  var invoice_sent_at: js.UndefOr[String] = js.undefined
  /**
    * The URL for the invoice.
    */
  var invoice_url: String
  /**
    * Product variant line item or custom line item associated to the draft order. Each draft order must include at least one line_item.
    */
  var line_items: js.Array[DraftLineItem]
  /**
    * Uses include: Creating, updating, & deserializing webhook bodies that include them.
    */
  var metafields: js.Array[MetaField]
  /**
    * Name of the draft order.
    */
  var name: String
  /**
    * The text of an optional note that a shop owner can attach to the draft order.
    */
  var note: String
  /**
    * Extra information that is added to the order.
    */
  var note_attributes: js.Array[NoteAttribute]
  /**
    * The unique numeric identifier for the order associated to the draft order, once created.
    */
  var order_id: js.UndefOr[Double] = js.undefined
  /**
    * The mailing address to where the order will be shipped. This address is optional and will not be available on orders that do not require one.
    */
  var shipping_address: Address
  /**
    * Details the shipping method used.
    */
  var shipping_line: ShippingLine
  /**
    * Known values are "open", "invoice_sent", and "completed".
    */
  var status: String
  /**
    * Price of the order before shipping and taxes
    */
  var subtotal_price: js.UndefOr[Double] = js.undefined
  /**
    * Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    */
  var tags: String
  /**
    * Sets whether or not taxes are exempt for the draft order. If this field is set to false, then Shopify will refer to the taxable field for each line_item. If a customer is applied to the draft order, then Shopify will use the customer's tax_exempt field instead.
    */
  var tax_exempt: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of tax_line objects, each of which details the total taxes applicable to the order. When creating an order through the API, tax lines may be specified on the order or the line items but not both. Tax lines specified on the order are split on the taxable line items in the created order.
    */
  var tax_lines: js.Array[TaxLine]
  /**
    * States whether or not taxes are included in the order subtotal.
    */
  var taxes_included: js.UndefOr[Boolean] = js.undefined
  /**
    * The sum of all the prices of all the items in the order, taxes and discounts included (must be positive).
    */
  var total_price: js.UndefOr[Double] = js.undefined
  /**
    * The sum of all the taxes applied to the order (must be positive).
    */
  var total_tax: js.UndefOr[Double] = js.undefined
  /**
    * The date and time when the order was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.undefined
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
    tax_lines: js.Array[TaxLine],
    admin_graphql_api_id: String = null,
    completed_at: String = null,
    created_at: String = null,
    id: Int | Double = null,
    invoice_sent_at: String = null,
    order_id: Int | Double = null,
    subtotal_price: Int | Double = null,
    tax_exempt: js.UndefOr[Boolean] = js.undefined,
    taxes_included: js.UndefOr[Boolean] = js.undefined,
    total_price: Int | Double = null,
    total_tax: Int | Double = null,
    updated_at: String = null
  ): DraftOrder = {
    val __obj = js.Dynamic.literal(applied_discount = applied_discount, billing_address = billing_address, currency = currency, customer = customer, email = email, invoice_url = invoice_url, line_items = line_items, metafields = metafields, name = name, note = note, note_attributes = note_attributes, shipping_address = shipping_address, shipping_line = shipping_line, status = status, tags = tags, tax_lines = tax_lines)
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invoice_sent_at != null) __obj.updateDynamic("invoice_sent_at")(invoice_sent_at)
    if (order_id != null) __obj.updateDynamic("order_id")(order_id.asInstanceOf[js.Any])
    if (subtotal_price != null) __obj.updateDynamic("subtotal_price")(subtotal_price.asInstanceOf[js.Any])
    if (!js.isUndefined(tax_exempt)) __obj.updateDynamic("tax_exempt")(tax_exempt)
    if (!js.isUndefined(taxes_included)) __obj.updateDynamic("taxes_included")(taxes_included)
    if (total_price != null) __obj.updateDynamic("total_price")(total_price.asInstanceOf[js.Any])
    if (total_tax != null) __obj.updateDynamic("total_tax")(total_tax.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[DraftOrder]
  }
}

