package typings
package shopifyDashPrimeLib.distModelsDraftUnderscoreOrderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftOrder
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * Discount which will be applied to the line item or the overall order. A draft order line_item can have one discount. A draft order can have one order-level discount.
    */
  var applied_discount: shopifyDashPrimeLib.distModelsAppliedUnderscoreDiscountMod.AppliedDiscount
  /**
    * The mailing address associated with the payment method. This address is an optional field that will not be available on orders that do not require one.
    */
  var billing_address: shopifyDashPrimeLib.distModelsAddressMod.Address
  /**
    * Date at which order is created and the draft order changes to completed status. The API returns this value in ISO 8601 format.
    */
  var completed_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This auto-generated property is the date and time when the draft order was created in Shopify, in ISO 8601 format.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: java.lang.String
  /**
    * Customer associated with the draft order. Customer associated with the draft order. Used to load/remove the associated customer with customer id. When a customer is loaded, the customerΓÇÖs email address is also assocaited.
    */
  var customer: shopifyDashPrimeLib.distModelsCustomerMod.Customer
  /**
    * The customer's email address.
    */
  var email: java.lang.String
  /**
    * This auto-generated property is the date and time when the invoice was emailed to the customer, in ISO 8601 format.
    */
  var invoice_sent_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL for the invoice.
    */
  var invoice_url: java.lang.String
  /**
    * Product variant line item or custom line item associated to the draft order. Each draft order must include at least one line_item.
    */
  var line_items: js.Array[shopifyDashPrimeLib.distModelsDraftUnderscoreLineUnderscoreItemMod.DraftLineItem]
  /**
    * Uses include: Creating, updating, & deserializing webhook bodies that include them.
    */
  var metafields: js.Array[shopifyDashPrimeLib.distModelsMetaUnderscoreFieldMod.MetaField]
  /**
    * Name of the draft order.
    */
  var name: java.lang.String
  /**
    * The text of an optional note that a shop owner can attach to the draft order.
    */
  var note: java.lang.String
  /**
    * Extra information that is added to the order.
    */
  var note_attributes: js.Array[shopifyDashPrimeLib.distModelsNoteUnderscoreAttributeMod.NoteAttribute]
  /**
    * The unique numeric identifier for the order associated to the draft order, once created.
    */
  var order_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * The mailing address to where the order will be shipped. This address is optional and will not be available on orders that do not require one.
    */
  var shipping_address: shopifyDashPrimeLib.distModelsAddressMod.Address
  /**
    * Details the shipping method used.
    */
  var shipping_line: shopifyDashPrimeLib.distModelsShippingUnderscoreLineMod.ShippingLine
  /**
    * Known values are "open", "invoice_sent", and "completed".
    */
  var status: java.lang.String
  /**
    * Price of the order before shipping and taxes
    */
  var subtotal_price: js.UndefOr[scala.Double] = js.undefined
  /**
    * Tags are additional short descriptors, commonly used for filtering and searching, formatted as a string of comma-separated values.
    */
  var tags: java.lang.String
  /**
    * Sets whether or not taxes are exempt for the draft order. If this field is set to false, then Shopify will refer to the taxable field for each line_item. If a customer is applied to the draft order, then Shopify will use the customer's tax_exempt field instead.
    */
  var tax_exempt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of tax_line objects, each of which details the total taxes applicable to the order. When creating an order through the API, tax lines may be specified on the order or the line items but not both. Tax lines specified on the order are split on the taxable line items in the created order.
    */
  var tax_lines: js.Array[shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod.TaxLine]
  /**
    * States whether or not taxes are included in the order subtotal.
    */
  var taxes_included: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The sum of all the prices of all the items in the order, taxes and discounts included (must be positive).
    */
  var total_price: js.UndefOr[scala.Double] = js.undefined
  /**
    * The sum of all the taxes applied to the order (must be positive).
    */
  var total_tax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The date and time when the order was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

object DraftOrder {
  @scala.inline
  def apply(
    applied_discount: shopifyDashPrimeLib.distModelsAppliedUnderscoreDiscountMod.AppliedDiscount,
    billing_address: shopifyDashPrimeLib.distModelsAddressMod.Address,
    currency: java.lang.String,
    customer: shopifyDashPrimeLib.distModelsCustomerMod.Customer,
    email: java.lang.String,
    invoice_url: java.lang.String,
    line_items: js.Array[shopifyDashPrimeLib.distModelsDraftUnderscoreLineUnderscoreItemMod.DraftLineItem],
    metafields: js.Array[shopifyDashPrimeLib.distModelsMetaUnderscoreFieldMod.MetaField],
    name: java.lang.String,
    note: java.lang.String,
    note_attributes: js.Array[shopifyDashPrimeLib.distModelsNoteUnderscoreAttributeMod.NoteAttribute],
    shipping_address: shopifyDashPrimeLib.distModelsAddressMod.Address,
    shipping_line: shopifyDashPrimeLib.distModelsShippingUnderscoreLineMod.ShippingLine,
    status: java.lang.String,
    tags: java.lang.String,
    tax_lines: js.Array[shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod.TaxLine],
    admin_graphql_api_id: java.lang.String = null,
    completed_at: java.lang.String = null,
    created_at: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    invoice_sent_at: java.lang.String = null,
    order_id: scala.Int | scala.Double = null,
    subtotal_price: scala.Int | scala.Double = null,
    tax_exempt: js.UndefOr[scala.Boolean] = js.undefined,
    taxes_included: js.UndefOr[scala.Boolean] = js.undefined,
    total_price: scala.Int | scala.Double = null,
    total_tax: scala.Int | scala.Double = null,
    updated_at: java.lang.String = null
  ): DraftOrder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applied_discount")(applied_discount)
    __obj.updateDynamic("billing_address")(billing_address)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("customer")(customer)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("invoice_url")(invoice_url)
    __obj.updateDynamic("line_items")(line_items)
    __obj.updateDynamic("metafields")(metafields)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("note")(note)
    __obj.updateDynamic("note_attributes")(note_attributes)
    __obj.updateDynamic("shipping_address")(shipping_address)
    __obj.updateDynamic("shipping_line")(shipping_line)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("tax_lines")(tax_lines)
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

