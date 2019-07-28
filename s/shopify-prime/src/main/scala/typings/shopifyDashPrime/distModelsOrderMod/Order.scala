package typings.shopifyDashPrime.distModelsOrderMod

import typings.shopifyDashPrime.Anon_Name
import typings.shopifyDashPrime.distEnumsFinancialUnderscoreStatusMod.FinancialStatus
import typings.shopifyDashPrime.distModelsAddressMod.Address
import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.distModelsClientUnderscoreDetailsMod.ClientDetails
import typings.shopifyDashPrime.distModelsCustomerMod.Customer
import typings.shopifyDashPrime.distModelsDiscountUnderscoreCodeMod.DiscountCode
import typings.shopifyDashPrime.distModelsFulfillmentMod.Fulfillment
import typings.shopifyDashPrime.distModelsLineUnderscoreItemMod.LineItem
import typings.shopifyDashPrime.distModelsPaymentUnderscoreDetailsMod.PaymentDetails
import typings.shopifyDashPrime.distModelsRefundMod.Refund
import typings.shopifyDashPrime.distModelsShippingUnderscoreLineMod.ShippingLine
import typings.shopifyDashPrime.distModelsTaxUnderscoreLineMod.TaxLine
import typings.shopifyDashPrime.shopifyDashPrimeStrings.fulfilled
import typings.shopifyDashPrime.shopifyDashPrimeStrings.partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends ShopifyObject {
  var billing_address: js.UndefOr[Address] = js.undefined
  var browser_ip: js.UndefOr[String] = js.undefined
  var buyer_accepts_marketing: js.UndefOr[Boolean] = js.undefined
  var cancel_reason: js.UndefOr[String] = js.undefined
  var cancelled_at: js.UndefOr[String] = js.undefined
  var cart_token: js.UndefOr[String] = js.undefined
  var client_details: js.UndefOr[ClientDetails] = js.undefined
  var closed_at: js.UndefOr[String] = js.undefined
  var contact_email: js.UndefOr[String] = js.undefined
  var created_at: js.UndefOr[String] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var customer: js.UndefOr[Customer] = js.undefined
  var discount_codes: js.UndefOr[js.Array[DiscountCode]] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var financial_status: js.UndefOr[FinancialStatus] = js.undefined
  var fulfillment_status: js.UndefOr[fulfilled | partial | String] = js.undefined
  var fulfillments: js.UndefOr[js.Array[Fulfillment]] = js.undefined
  var landing_site: js.UndefOr[String] = js.undefined
  var line_items: js.UndefOr[js.Array[LineItem]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[String] = js.undefined
  var note_attributes: js.UndefOr[Anon_Name] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var order_number: js.UndefOr[Double] = js.undefined
  var payment_details: js.UndefOr[PaymentDetails] = js.undefined
  var processed_at: js.UndefOr[String] = js.undefined
  var processing_method: js.UndefOr[String] = js.undefined
  var referring_site: js.UndefOr[String] = js.undefined
  var refunds: js.UndefOr[js.Array[Refund]] = js.undefined
  var shipping_address: js.UndefOr[Address] = js.undefined
  var shipping_lines: js.UndefOr[js.Array[ShippingLine]] = js.undefined
  var source_name: js.UndefOr[String] = js.undefined
  var subtotal_price: js.UndefOr[Double] = js.undefined
  var tags: js.UndefOr[String] = js.undefined
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.undefined
  var taxes_included: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var total_discounts: js.UndefOr[Double] = js.undefined
  var total_line_items_price: js.UndefOr[Double] = js.undefined
  var total_price: js.UndefOr[Double] = js.undefined
  var total_price_usd: js.UndefOr[Double] = js.undefined
  var total_tax: js.UndefOr[Double] = js.undefined
  var total_weight: js.UndefOr[Double] = js.undefined
  var updated_at: js.UndefOr[String] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    billing_address: Address = null,
    browser_ip: String = null,
    buyer_accepts_marketing: js.UndefOr[Boolean] = js.undefined,
    cancel_reason: String = null,
    cancelled_at: String = null,
    cart_token: String = null,
    client_details: ClientDetails = null,
    closed_at: String = null,
    contact_email: String = null,
    created_at: String = null,
    currency: String = null,
    customer: Customer = null,
    discount_codes: js.Array[DiscountCode] = null,
    email: String = null,
    financial_status: FinancialStatus = null,
    fulfillment_status: fulfilled | partial | String = null,
    fulfillments: js.Array[Fulfillment] = null,
    id: Int | Double = null,
    landing_site: String = null,
    line_items: js.Array[LineItem] = null,
    name: String = null,
    note: String = null,
    note_attributes: Anon_Name = null,
    number: Int | Double = null,
    order_number: Int | Double = null,
    payment_details: PaymentDetails = null,
    processed_at: String = null,
    processing_method: String = null,
    referring_site: String = null,
    refunds: js.Array[Refund] = null,
    shipping_address: Address = null,
    shipping_lines: js.Array[ShippingLine] = null,
    source_name: String = null,
    subtotal_price: Int | Double = null,
    tags: String = null,
    tax_lines: js.Array[TaxLine] = null,
    taxes_included: js.UndefOr[Boolean] = js.undefined,
    token: String = null,
    total_discounts: Int | Double = null,
    total_line_items_price: Int | Double = null,
    total_price: Int | Double = null,
    total_price_usd: Int | Double = null,
    total_tax: Int | Double = null,
    total_weight: Int | Double = null,
    updated_at: String = null
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

