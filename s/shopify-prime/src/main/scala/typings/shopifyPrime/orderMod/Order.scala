package typings.shopifyPrime.orderMod

import typings.shopifyPrime.addressMod.Address
import typings.shopifyPrime.anon.Name
import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.clientDetailsMod.ClientDetails
import typings.shopifyPrime.customerMod.Customer
import typings.shopifyPrime.discountCodeMod.DiscountCode
import typings.shopifyPrime.financialStatusMod.FinancialStatus
import typings.shopifyPrime.fulfillmentMod.Fulfillment
import typings.shopifyPrime.lineItemMod.LineItem
import typings.shopifyPrime.paymentDetailsMod.PaymentDetails
import typings.shopifyPrime.refundMod.Refund
import typings.shopifyPrime.shippingLineMod.ShippingLine
import typings.shopifyPrime.shopifyPrimeStrings.fulfilled
import typings.shopifyPrime.shopifyPrimeStrings.partial
import typings.shopifyPrime.taxLineMod.TaxLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Order extends ShopifyObject {
  var billing_address: js.UndefOr[Address] = js.native
  var browser_ip: js.UndefOr[String] = js.native
  var buyer_accepts_marketing: js.UndefOr[Boolean] = js.native
  var cancel_reason: js.UndefOr[String] = js.native
  var cancelled_at: js.UndefOr[String] = js.native
  var cart_token: js.UndefOr[String] = js.native
  var client_details: js.UndefOr[ClientDetails] = js.native
  var closed_at: js.UndefOr[String] = js.native
  var contact_email: js.UndefOr[String] = js.native
  var created_at: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var customer: js.UndefOr[Customer] = js.native
  var discount_codes: js.UndefOr[js.Array[DiscountCode]] = js.native
  var email: js.UndefOr[String] = js.native
  var financial_status: js.UndefOr[FinancialStatus] = js.native
  var fulfillment_status: js.UndefOr[fulfilled | partial | String] = js.native
  var fulfillments: js.UndefOr[js.Array[Fulfillment]] = js.native
  var landing_site: js.UndefOr[String] = js.native
  var line_items: js.UndefOr[js.Array[LineItem]] = js.native
  var name: js.UndefOr[String] = js.native
  var note: js.UndefOr[String] = js.native
  var note_attributes: js.UndefOr[Name] = js.native
  var number: js.UndefOr[Double] = js.native
  var order_number: js.UndefOr[Double] = js.native
  var payment_details: js.UndefOr[PaymentDetails] = js.native
  var processed_at: js.UndefOr[String] = js.native
  var processing_method: js.UndefOr[String] = js.native
  var referring_site: js.UndefOr[String] = js.native
  var refunds: js.UndefOr[js.Array[Refund]] = js.native
  var shipping_address: js.UndefOr[Address] = js.native
  var shipping_lines: js.UndefOr[js.Array[ShippingLine]] = js.native
  var source_name: js.UndefOr[String] = js.native
  var subtotal_price: js.UndefOr[Double] = js.native
  var tags: js.UndefOr[String] = js.native
  var tax_lines: js.UndefOr[js.Array[TaxLine]] = js.native
  var taxes_included: js.UndefOr[Boolean] = js.native
  var token: js.UndefOr[String] = js.native
  var total_discounts: js.UndefOr[Double] = js.native
  var total_line_items_price: js.UndefOr[Double] = js.native
  var total_price: js.UndefOr[Double] = js.native
  var total_price_usd: js.UndefOr[Double] = js.native
  var total_tax: js.UndefOr[Double] = js.native
  var total_weight: js.UndefOr[Double] = js.native
  var updated_at: js.UndefOr[String] = js.native
}

object Order {
  @scala.inline
  def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
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
    def setBilling_address(value: Address): Self = this.set("billing_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_address: Self = this.set("billing_address", js.undefined)
    @scala.inline
    def setBrowser_ip(value: String): Self = this.set("browser_ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser_ip: Self = this.set("browser_ip", js.undefined)
    @scala.inline
    def setBuyer_accepts_marketing(value: Boolean): Self = this.set("buyer_accepts_marketing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyer_accepts_marketing: Self = this.set("buyer_accepts_marketing", js.undefined)
    @scala.inline
    def setCancel_reason(value: String): Self = this.set("cancel_reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel_reason: Self = this.set("cancel_reason", js.undefined)
    @scala.inline
    def setCancelled_at(value: String): Self = this.set("cancelled_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelled_at: Self = this.set("cancelled_at", js.undefined)
    @scala.inline
    def setCart_token(value: String): Self = this.set("cart_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCart_token: Self = this.set("cart_token", js.undefined)
    @scala.inline
    def setClient_details(value: ClientDetails): Self = this.set("client_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_details: Self = this.set("client_details", js.undefined)
    @scala.inline
    def setClosed_at(value: String): Self = this.set("closed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosed_at: Self = this.set("closed_at", js.undefined)
    @scala.inline
    def setContact_email(value: String): Self = this.set("contact_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact_email: Self = this.set("contact_email", js.undefined)
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
    def setDiscount_codesVarargs(value: DiscountCode*): Self = this.set("discount_codes", js.Array(value :_*))
    @scala.inline
    def setDiscount_codes(value: js.Array[DiscountCode]): Self = this.set("discount_codes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscount_codes: Self = this.set("discount_codes", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFinancial_status(value: FinancialStatus): Self = this.set("financial_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinancial_status: Self = this.set("financial_status", js.undefined)
    @scala.inline
    def setFulfillment_status(value: fulfilled | partial | String): Self = this.set("fulfillment_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFulfillment_status: Self = this.set("fulfillment_status", js.undefined)
    @scala.inline
    def setFulfillmentsVarargs(value: Fulfillment*): Self = this.set("fulfillments", js.Array(value :_*))
    @scala.inline
    def setFulfillments(value: js.Array[Fulfillment]): Self = this.set("fulfillments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFulfillments: Self = this.set("fulfillments", js.undefined)
    @scala.inline
    def setLanding_site(value: String): Self = this.set("landing_site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanding_site: Self = this.set("landing_site", js.undefined)
    @scala.inline
    def setLine_itemsVarargs(value: LineItem*): Self = this.set("line_items", js.Array(value :_*))
    @scala.inline
    def setLine_items(value: js.Array[LineItem]): Self = this.set("line_items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine_items: Self = this.set("line_items", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setNote_attributes(value: Name): Self = this.set("note_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote_attributes: Self = this.set("note_attributes", js.undefined)
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOrder_number(value: Double): Self = this.set("order_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_number: Self = this.set("order_number", js.undefined)
    @scala.inline
    def setPayment_details(value: PaymentDetails): Self = this.set("payment_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_details: Self = this.set("payment_details", js.undefined)
    @scala.inline
    def setProcessed_at(value: String): Self = this.set("processed_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessed_at: Self = this.set("processed_at", js.undefined)
    @scala.inline
    def setProcessing_method(value: String): Self = this.set("processing_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessing_method: Self = this.set("processing_method", js.undefined)
    @scala.inline
    def setReferring_site(value: String): Self = this.set("referring_site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferring_site: Self = this.set("referring_site", js.undefined)
    @scala.inline
    def setRefundsVarargs(value: Refund*): Self = this.set("refunds", js.Array(value :_*))
    @scala.inline
    def setRefunds(value: js.Array[Refund]): Self = this.set("refunds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefunds: Self = this.set("refunds", js.undefined)
    @scala.inline
    def setShipping_address(value: Address): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_address: Self = this.set("shipping_address", js.undefined)
    @scala.inline
    def setShipping_linesVarargs(value: ShippingLine*): Self = this.set("shipping_lines", js.Array(value :_*))
    @scala.inline
    def setShipping_lines(value: js.Array[ShippingLine]): Self = this.set("shipping_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipping_lines: Self = this.set("shipping_lines", js.undefined)
    @scala.inline
    def setSource_name(value: String): Self = this.set("source_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_name: Self = this.set("source_name", js.undefined)
    @scala.inline
    def setSubtotal_price(value: Double): Self = this.set("subtotal_price", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtotal_price: Self = this.set("subtotal_price", js.undefined)
    @scala.inline
    def setTags(value: String): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setTotal_discounts(value: Double): Self = this.set("total_discounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_discounts: Self = this.set("total_discounts", js.undefined)
    @scala.inline
    def setTotal_line_items_price(value: Double): Self = this.set("total_line_items_price", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_line_items_price: Self = this.set("total_line_items_price", js.undefined)
    @scala.inline
    def setTotal_price(value: Double): Self = this.set("total_price", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_price: Self = this.set("total_price", js.undefined)
    @scala.inline
    def setTotal_price_usd(value: Double): Self = this.set("total_price_usd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_price_usd: Self = this.set("total_price_usd", js.undefined)
    @scala.inline
    def setTotal_tax(value: Double): Self = this.set("total_tax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_tax: Self = this.set("total_tax", js.undefined)
    @scala.inline
    def setTotal_weight(value: Double): Self = this.set("total_weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_weight: Self = this.set("total_weight", js.undefined)
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
  }
  
}

