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
    id: js.UndefOr[Double] = js.undefined,
    invoice_sent_at: String = null,
    order_id: js.UndefOr[Double] = js.undefined,
    subtotal_price: js.UndefOr[Double] = js.undefined,
    tax_exempt: js.UndefOr[Boolean] = js.undefined,
    taxes_included: js.UndefOr[Boolean] = js.undefined,
    total_price: js.UndefOr[Double] = js.undefined,
    total_tax: js.UndefOr[Double] = js.undefined,
    updated_at: String = null
  ): DraftOrder = {
    val __obj = js.Dynamic.literal(applied_discount = applied_discount.asInstanceOf[js.Any], billing_address = billing_address.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], invoice_url = invoice_url.asInstanceOf[js.Any], line_items = line_items.asInstanceOf[js.Any], metafields = metafields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], note_attributes = note_attributes.asInstanceOf[js.Any], shipping_address = shipping_address.asInstanceOf[js.Any], shipping_line = shipping_line.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tax_lines = tax_lines.asInstanceOf[js.Any])
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (invoice_sent_at != null) __obj.updateDynamic("invoice_sent_at")(invoice_sent_at.asInstanceOf[js.Any])
    if (!js.isUndefined(order_id)) __obj.updateDynamic("order_id")(order_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subtotal_price)) __obj.updateDynamic("subtotal_price")(subtotal_price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tax_exempt)) __obj.updateDynamic("tax_exempt")(tax_exempt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(taxes_included)) __obj.updateDynamic("taxes_included")(taxes_included.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_price)) __obj.updateDynamic("total_price")(total_price.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_tax)) __obj.updateDynamic("total_tax")(total_tax.get.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraftOrder]
  }
}

