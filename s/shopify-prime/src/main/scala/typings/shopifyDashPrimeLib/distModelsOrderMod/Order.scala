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

