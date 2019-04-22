package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Payment")
@js.native
class V1Payment () extends js.Object {
  /**
    * All of the additive taxes associated with the payment.
    */
  var additive_tax: js.UndefOr[js.Array[V1PaymentTax]] = js.native
  /**
    * The sum of all additive taxes associated with the payment.
    */
  var additive_tax_money: js.UndefOr[V1Money] = js.native
  /**
    * The time when the payment was created, in ISO 8601 format. Reflects the time of the first payment if the object
    * represents an incomplete partial payment, and the time of the last or complete payment otherwise.
    */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
    * The unique identifier of the Square account that took the payment.
    */
  var creator_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The device that took the payment.
    */
  var device: js.UndefOr[Device] = js.native
  /**
    * The total of all discounts applied to the payment.
    */
  var discount_money: js.UndefOr[V1Money] = js.native
  /**
    * The total of all sales, including any applicable taxes.
    */
  var gross_sales_money: js.UndefOr[V1Money] = js.native
  /**
    * The payment's unique identifier.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * All of the inclusive taxes associated with the payment.
    */
  var inclusive_tax: js.UndefOr[js.Array[V1PaymentTax]] = js.native
  /**
    * The sum of all inclusive taxes associated with the payment.
    */
  var inclusive_tax_money: js.UndefOr[V1Money] = js.native
  /**
    * Indicates whether or not the payment is only partially paid for. If true, this payment will have the tenders
    * collected so far, but the itemizations will be empty until the payment is completed.
    */
  var is_partial: js.UndefOr[scala.Boolean] = js.native
  /**
    * The items purchased in the payment.
    */
  var itemizations: js.UndefOr[js.Array[V1PaymentItemization]] = js.native
  /**
    * The unique identifier of the merchant that took the payment.
    */
  var merchant_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The total of all sales, minus any applicable taxes.
    */
  var net_sales_money: js.UndefOr[V1Money] = js.native
  /**
    * The amount to be deposited into the merchant's bank account for the payment.
    */
  var net_total_money: js.UndefOr[V1Money] = js.native
  /**
    * The URL of the payment's detail page in the merchant dashboard. The merchant must be signed in to the merchant
    * dashboard to view this page.
    */
  var payment_url: js.UndefOr[java.lang.String] = js.native
  /**
    * The total of all processing fees collected by Square for the payment.
    */
  var processing_fee_money: js.UndefOr[V1Money] = js.native
  /**
    * The URL of the receipt for the payment. Note that for split tender payments, this URL corresponds to the receipt
    * for the first tender listed in the payment's tender field. Each Tender object has its own receipt_url field you
    * can use to get the other receipts associated with a split tender payment.
    */
  var receipt_url: js.UndefOr[java.lang.String] = js.native
  /**
    * The total of all refunds applied to the payment.
    */
  var refunded_money: js.UndefOr[V1Money] = js.native
  /**
    * All of the refunds applied to the payment. Note that the value of all refunds on a payment can exceed the value of all
    * tenders if a merchant chooses to refund money to a tender after previously accepting returned goods as part of an exchange.
    */
  var refunds: js.UndefOr[js.Array[V1Refund]] = js.native
  /**
    * The total of all surcharges applied to the payment.
    */
  var surcharge_money: js.UndefOr[V1Money] = js.native
  /**
    * A list of all surcharges associated with the payment.
    */
  var surcharges: js.UndefOr[js.Array[V1PaymentSurcharge]] = js.native
  /**
    * The total of all sales, including any applicable taxes, rounded to the smallest legal unit of currency (e.g., the
    * nearest penny in USD, the nearest nickel in CAD)
    */
  var swedish_rounding_money: js.UndefOr[V1Money] = js.native
  /**
    * The total of all taxes applied to the payment. This is always the sum of inclusive_tax_money and
    * additive_tax_money.
    */
  var tax_money: js.UndefOr[V1Money] = js.native
  /**
    * All of the tenders associated with the payment.
    */
  var tender: js.UndefOr[js.Array[V1Tender]] = js.native
  /**
    * The total of all tips applied to the payment.
    */
  var tip_money: js.UndefOr[V1Money] = js.native
  /**
    * The total of all discounts applied to the payment.
    */
  var total_collected_money: js.UndefOr[V1Money] = js.native
}

