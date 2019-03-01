package typings
package shopifyDashPrimeLib.distModelsOrderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  var billing_address: js.UndefOr[shopifyDashPrimeLib.distModelsAddressMod.Address] = js.undefined
  var browser_ip: js.UndefOr[java.lang.String] = js.undefined
  var buyer_accepts_marketing: js.UndefOr[scala.Boolean] = js.undefined
  var cancel_reason: js.UndefOr[java.lang.String] = js.undefined
  var cancelled_at: js.UndefOr[java.lang.String] = js.undefined
  var cart_token: js.UndefOr[java.lang.String] = js.undefined
  var client_details: js.UndefOr[shopifyDashPrimeLib.distModelsClientUnderscoreDetailsMod.ClientDetails] = js.undefined
  var closed_at: js.UndefOr[java.lang.String] = js.undefined
  var contact_email: js.UndefOr[java.lang.String] = js.undefined
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var customer: js.UndefOr[shopifyDashPrimeLib.distModelsCustomerMod.Customer] = js.undefined
  var discount_codes: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsDiscountUnderscoreCodeMod.DiscountCode]] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var financial_status: js.UndefOr[shopifyDashPrimeLib.distEnumsFinancialUnderscoreStatusMod.FinancialStatus] = js.undefined
  var fulfillment_status: js.UndefOr[
    shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fulfilled | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.partial | java.lang.String
  ] = js.undefined
  var fulfillments: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment]] = js.undefined
  var landing_site: js.UndefOr[java.lang.String] = js.undefined
  var line_items: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsLineUnderscoreItemMod.LineItem]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var note: js.UndefOr[java.lang.String] = js.undefined
  var note_attributes: js.UndefOr[shopifyDashPrimeLib.Anon_Name] = js.undefined
  var number: js.UndefOr[scala.Double] = js.undefined
  var order_number: js.UndefOr[scala.Double] = js.undefined
  var payment_details: js.UndefOr[shopifyDashPrimeLib.distModelsPaymentUnderscoreDetailsMod.PaymentDetails] = js.undefined
  var processed_at: js.UndefOr[java.lang.String] = js.undefined
  var processing_method: js.UndefOr[java.lang.String] = js.undefined
  var referring_site: js.UndefOr[java.lang.String] = js.undefined
  var refunds: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsRefundMod.Refund]] = js.undefined
  var shipping_address: js.UndefOr[shopifyDashPrimeLib.distModelsAddressMod.Address] = js.undefined
  var shipping_lines: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsShippingUnderscoreLineMod.ShippingLine]] = js.undefined
  var source_name: js.UndefOr[java.lang.String] = js.undefined
  var subtotal_price: js.UndefOr[scala.Double] = js.undefined
  var tags: js.UndefOr[java.lang.String] = js.undefined
  var tax_lines: js.UndefOr[js.Array[shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod.TaxLine]] = js.undefined
  var taxes_included: js.UndefOr[scala.Boolean] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var total_discounts: js.UndefOr[scala.Double] = js.undefined
  var total_line_items_price: js.UndefOr[scala.Double] = js.undefined
  var total_price: js.UndefOr[scala.Double] = js.undefined
  var total_price_usd: js.UndefOr[scala.Double] = js.undefined
  var total_tax: js.UndefOr[scala.Double] = js.undefined
  var total_weight: js.UndefOr[scala.Double] = js.undefined
  var updated_at: js.UndefOr[java.lang.String] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    billing_address: shopifyDashPrimeLib.distModelsAddressMod.Address = null,
    browser_ip: java.lang.String = null,
    buyer_accepts_marketing: js.UndefOr[scala.Boolean] = js.undefined,
    cancel_reason: java.lang.String = null,
    cancelled_at: java.lang.String = null,
    cart_token: java.lang.String = null,
    client_details: shopifyDashPrimeLib.distModelsClientUnderscoreDetailsMod.ClientDetails = null,
    closed_at: java.lang.String = null,
    contact_email: java.lang.String = null,
    created_at: java.lang.String = null,
    currency: java.lang.String = null,
    customer: shopifyDashPrimeLib.distModelsCustomerMod.Customer = null,
    discount_codes: js.Array[shopifyDashPrimeLib.distModelsDiscountUnderscoreCodeMod.DiscountCode] = null,
    email: java.lang.String = null,
    financial_status: shopifyDashPrimeLib.distEnumsFinancialUnderscoreStatusMod.FinancialStatus = null,
    fulfillment_status: shopifyDashPrimeLib.shopifyDashPrimeLibStrings.fulfilled | shopifyDashPrimeLib.shopifyDashPrimeLibStrings.partial | java.lang.String = null,
    fulfillments: js.Array[shopifyDashPrimeLib.distModelsFulfillmentMod.Fulfillment] = null,
    id: scala.Int | scala.Double = null,
    landing_site: java.lang.String = null,
    line_items: js.Array[shopifyDashPrimeLib.distModelsLineUnderscoreItemMod.LineItem] = null,
    name: java.lang.String = null,
    note: java.lang.String = null,
    note_attributes: shopifyDashPrimeLib.Anon_Name = null,
    number: scala.Int | scala.Double = null,
    order_number: scala.Int | scala.Double = null,
    payment_details: shopifyDashPrimeLib.distModelsPaymentUnderscoreDetailsMod.PaymentDetails = null,
    processed_at: java.lang.String = null,
    processing_method: java.lang.String = null,
    referring_site: java.lang.String = null,
    refunds: js.Array[shopifyDashPrimeLib.distModelsRefundMod.Refund] = null,
    shipping_address: shopifyDashPrimeLib.distModelsAddressMod.Address = null,
    shipping_lines: js.Array[shopifyDashPrimeLib.distModelsShippingUnderscoreLineMod.ShippingLine] = null,
    source_name: java.lang.String = null,
    subtotal_price: scala.Int | scala.Double = null,
    tags: java.lang.String = null,
    tax_lines: js.Array[shopifyDashPrimeLib.distModelsTaxUnderscoreLineMod.TaxLine] = null,
    taxes_included: js.UndefOr[scala.Boolean] = js.undefined,
    token: java.lang.String = null,
    total_discounts: scala.Int | scala.Double = null,
    total_line_items_price: scala.Int | scala.Double = null,
    total_price: scala.Int | scala.Double = null,
    total_price_usd: scala.Int | scala.Double = null,
    total_tax: scala.Int | scala.Double = null,
    total_weight: scala.Int | scala.Double = null,
    updated_at: java.lang.String = null
  ): Order = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (billing_address != null) __obj.updateDynamic("billing_address")(billing_address)
    if (browser_ip != null) __obj.updateDynamic("browser_ip")(browser_ip)
    if (!js.isUndefined(buyer_accepts_marketing)) __obj.updateDynamic("buyer_accepts_marketing")(buyer_accepts_marketing)
    if (cancel_reason != null) __obj.updateDynamic("cancel_reason")(cancel_reason)
    if (cancelled_at != null) __obj.updateDynamic("cancelled_at")(cancelled_at)
    if (cart_token != null) __obj.updateDynamic("cart_token")(cart_token)
    if (client_details != null) __obj.updateDynamic("client_details")(client_details)
    if (closed_at != null) __obj.updateDynamic("closed_at")(closed_at)
    if (contact_email != null) __obj.updateDynamic("contact_email")(contact_email)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (discount_codes != null) __obj.updateDynamic("discount_codes")(discount_codes)
    if (email != null) __obj.updateDynamic("email")(email)
    if (financial_status != null) __obj.updateDynamic("financial_status")(financial_status.asInstanceOf[js.Any])
    if (fulfillment_status != null) __obj.updateDynamic("fulfillment_status")(fulfillment_status.asInstanceOf[js.Any])
    if (fulfillments != null) __obj.updateDynamic("fulfillments")(fulfillments)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (landing_site != null) __obj.updateDynamic("landing_site")(landing_site)
    if (line_items != null) __obj.updateDynamic("line_items")(line_items)
    if (name != null) __obj.updateDynamic("name")(name)
    if (note != null) __obj.updateDynamic("note")(note)
    if (note_attributes != null) __obj.updateDynamic("note_attributes")(note_attributes)
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (order_number != null) __obj.updateDynamic("order_number")(order_number.asInstanceOf[js.Any])
    if (payment_details != null) __obj.updateDynamic("payment_details")(payment_details)
    if (processed_at != null) __obj.updateDynamic("processed_at")(processed_at)
    if (processing_method != null) __obj.updateDynamic("processing_method")(processing_method)
    if (referring_site != null) __obj.updateDynamic("referring_site")(referring_site)
    if (refunds != null) __obj.updateDynamic("refunds")(refunds)
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address)
    if (shipping_lines != null) __obj.updateDynamic("shipping_lines")(shipping_lines)
    if (source_name != null) __obj.updateDynamic("source_name")(source_name)
    if (subtotal_price != null) __obj.updateDynamic("subtotal_price")(subtotal_price.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (tax_lines != null) __obj.updateDynamic("tax_lines")(tax_lines)
    if (!js.isUndefined(taxes_included)) __obj.updateDynamic("taxes_included")(taxes_included)
    if (token != null) __obj.updateDynamic("token")(token)
    if (total_discounts != null) __obj.updateDynamic("total_discounts")(total_discounts.asInstanceOf[js.Any])
    if (total_line_items_price != null) __obj.updateDynamic("total_line_items_price")(total_line_items_price.asInstanceOf[js.Any])
    if (total_price != null) __obj.updateDynamic("total_price")(total_price.asInstanceOf[js.Any])
    if (total_price_usd != null) __obj.updateDynamic("total_price_usd")(total_price_usd.asInstanceOf[js.Any])
    if (total_tax != null) __obj.updateDynamic("total_tax")(total_tax.asInstanceOf[js.Any])
    if (total_weight != null) __obj.updateDynamic("total_weight")(total_weight.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    __obj.asInstanceOf[Order]
  }
}

