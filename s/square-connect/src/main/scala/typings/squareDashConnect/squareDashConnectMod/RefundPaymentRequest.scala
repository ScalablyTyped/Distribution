package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RefundPaymentRequest")
@js.native
class RefundPaymentRequest () extends js.Object {
  /**
    * The amount of money to refund. Cannot be more than the `total_money` value of the payment minus the total amount
    * of all previously completed refunds for this payment. Must be specified in the smallest denomination of the
    * applicable currency. For example, US dollar amounts are specified in cents.
    * See [Working with monetary amounts](/build-basics/working-with-monetary-amounts) for details.
    * The currency code must match the currency associated with the business that is charging the card.
    */
  var amount_money: Money = js.native
  /**
    * Amount of money the developer will contribute to help cover the refunded amount.
    * Specified in the smallest denomination of the applicable currency. For example, US dollar amounts are specified in cents.
    * Value cannot be more than the `amount_money`. You can specify this parameter in a refund request only if the
    * same parameter was also included when taking the payment. This is part of the application fee scenario the API supports.
    * For more information, see [Collect Fees](/payments-api/take-payments-and-collect-fees).
    */
  var app_fee_money: js.UndefOr[Money] = js.native
  /**
    * A unique string that identifies this RefundPayment request. Key can be any valid string but must be unique
    * for every RefundPayment request. For more information, see [Idempotency keys](/basics/api101/idempotency).
    */
  var idempotency_key: String = js.native
  /**
    * Unique ID of the payment being refunded.
    */
  var payment_id: js.UndefOr[String] = js.native
  /**
    * A description of the reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
}

