package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Payment")
@js.native
class Payment () extends js.Object {
  /**
    * The amount of money processed for this payment, not including `tip_money`.
    * Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
    * For more information, see [Working with monetary amounts](/build-basics/working-with-monetary-amounts).
    */
  var amount_money: Money = js.native
  /**
    * The amount of money the developer is taking as a fee for facilitating the payment on behalf of the seller.
    * Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
    * For more information, see [Take Payments and Collect Fees](/payments-api/take-payments-and-collect-fees).
    * Cannot be more than 90% of the `total_money` value.
    */
  var app_fee_money: js.UndefOr[Money] = js.native
  /**
    * The buyer's billing address.
    */
  var billing_address: js.UndefOr[Address] = js.native
  /**
    * The buyer's e-mail address.
    */
  var buyer_email_address: js.UndefOr[String] = js.native
  /**
    * Non-confidential details about the source. Only populated if the `source_type` is `CARD`.
    */
  var card_details: js.UndefOr[CardPaymentDetails] = js.native
  /**
    * Timestamp of when the payment was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * An optional customer_id to be entered by the developer when creating a payment.
    */
  var customer_id: js.UndefOr[String] = js.native
  /**
    * Unique ID for the payment.
    */
  var id: String = js.native
  /**
    * ID of the location associated with the payment.
    */
  var location_id: js.UndefOr[String] = js.native
  /**
    * An optional note to include when creating a payment.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * ID of the order associated with this payment.
    */
  var order_id: js.UndefOr[String] = js.native
  /**
    * Processing fees and fee adjustments assessed by Square on this payment.
    */
  var processing_fee: js.UndefOr[js.Array[ProcessingFee]] = js.native
  /**
    * An optional ID that associates this payment with an entity in another system.
    */
  var reference_id: js.UndefOr[String] = js.native
  /**
    * List of `refund_id`s identifying refunds for this payment.
    */
  var refund_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Total amount of the payment refunded to-date. Specified in the smallest denomination of the applicable currency.
    * For example, US dollar amounts are specified in cents.
    */
  var refunded_money: js.UndefOr[Money] = js.native
  /**
    * The buyer's shipping address.
    */
  var shipping_address: js.UndefOr[Address] = js.native
  /**
    * The source type for this payment.
    */
  var source_type: js.UndefOr[String] = js.native
  /**
    * Indicates whether the payment is `APPROVED`, `COMPLETED`, `CANCELED`, or `FAILED`.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The amount designated as a tip. Specified in the smallest denomination of the applicable currency.
    * For example, US dollar amounts are specified in cents.
    */
  var tip_money: js.UndefOr[Money] = js.native
  /**
    * The total money for the payment, including `amount_money` and `tip_money`.
    * Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
    */
  var total_money: js.UndefOr[Money] = js.native
  /**
    * Timestamp of when the payment was last updated, in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}

