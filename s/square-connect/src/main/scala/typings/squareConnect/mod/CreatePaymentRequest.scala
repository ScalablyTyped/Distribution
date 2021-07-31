package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreatePaymentRequest")
@js.native
class CreatePaymentRequest () extends StObject {
  
  /**
    * If set to `true` and charging a Square Gift Card, a payment might be returned with `amount_money` equal to less than what was requested.
    * For example, a request for $20 when charging a Square Gift Card with a balance of $5 results in an APPROVED payment of $5.
    * You might choose to prompt the buyer for an additional payment to cover the remainder or cancel the Gift Card payment.
    * This field cannot be `true` when `autocomplete = true`.
    * For more information, see [Partial amount with Square Gift Cards](https://developer.squareup.com/docs/payments-api/take-payments#partial-payment-gift-card).
    * Default: false.
    */
  var accept_partial_authorization: js.UndefOr[Boolean] = js.native
  
  /**
    * The amount of money to accept for this payment, not including `tip_money`.
    * The amount must be specified in the smallest denomination of the applicable currency (for example, US dollar amounts are specified in cents).
    * For more information, see [Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts).
    * The currency code must match the currency associated with the business that is accepting the payment.
    */
  var amount_money: Money = js.native
  
  /**
    * The amount of money that the developer is taking as a fee for facilitating the payment on behalf of the seller.
    * The amount cannot be more than 90% of the total amount of the payment.
    * The amount must be specified in the smallest denomination of the applicable currency (for example, US dollar amounts are specified in cents).
    * For more information, see [Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts).
    * The fee currency code must match the currency associated with the seller that is accepting the payment.
    * The application must be from a developer account in the same country and using the same currency code as the seller.
    * For more information about the application fee scenario, see [Take Payments and Collect Fees](https://developer.squareup.com/docs/payments-api/take-payments-and-collect-fees).
    */
  var app_fee_money: js.UndefOr[Money] = js.native
  
  /**
    * If set to `true`, this payment will be completed when possible.
    * If set to `false`, this payment is held in an approved state until either explicitly completed (captured) or canceled (voided).
    * For more information, see [Delayed capture](https://developer.squareup.com/docs/payments-api/take-payments#delayed-payments).
    * Default: true.
    */
  var autocomplete: js.UndefOr[Boolean] = js.native
  
  /**
    * The buyer's billing address.
    */
  var billing_address: js.UndefOr[Address] = js.native
  
  /**
    * The buyer's email address.
    */
  var buyer_email_address: js.UndefOr[String] = js.native
  
  /**
    * The `Customer` ID of the customer associated with the payment.
    * This is required if the `source_id` refers to a card on file created using the Customers API.
    */
  var customer_id: js.UndefOr[String] = js.native
  
  /**
    * The duration of time after the payment's creation when Square automatically cancels the payment.
    * This automatic cancellation applies only to payments that do not reach a terminal state (COMPLETED, CANCELED, or FAILED)
    * before the `delay_duration` time period. This parameter should be specified as a time duration, in RFC 3339 format,
    * with a minimum value of 1 minute.
    * @note This feature is only supported for card payments. This parameter can only be set for a delayed capture payment (`autocomplete=false`). Default:
    *  - Card-present payments: \"PT36H\" (36 hours) from the creation time.
    *  - Card-not-present payments: \"P7D\" (7 days) from the creation time.
    */
  var delay_duration: js.UndefOr[String] = js.native
  
  /**
    * A unique string that identifies this `CreatePayment` request.
    * Keys can be any valid string but must be unique for every `CreatePayment` request.
    * Max: 45 characters  Note: The number of allowed characters might be less than the stated maximum, if multi-byte characters are used.
    * For more information, see [Idempotency](https://developer.squareup.com/docs/working-with-apis/idempotency).
    */
  var idempotency_key: String = js.native
  
  /**
    * The location ID to associate with the payment. If not specified, the default location is used.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * An optional note to be entered by the developer when creating a payment. Limit 500 characters.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * Associates a previously created order with this payment.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * A user-defined ID to associate with the payment.
    * You can use this field to associate the payment to an entity in an external system
    * (for example, you might specify an order ID that is generated by a third-party shopping cart). Limit 40 characters.
    */
  var reference_id: js.UndefOr[String] = js.native
  
  /**
    * The buyer's shipping address.
    */
  var shipping_address: js.UndefOr[Address] = js.native
  
  /**
    * The ID for the source of funds for this payment.
    * This can be a nonce generated by the Square payment form or a card on file made with the Customers API.
    */
  var source_id: String = js.native
  
  /**
    * Optional additional payment information to include on the customer's card statement as part of the statement description.
    * This can be, for example, an invoice number, ticket number, or short description that uniquely identifies the purchase.
    * Note that the `statement_description_identifier` might get truncated on the statement description to fit the required
    * information including the Square identifier (SQ *) and name of the seller taking the payment.
    */
  var statement_description_identifier: js.UndefOr[String] = js.native
  
  /**
    * The amount designated as a tip, in addition to `amount_money`.
    * The amount must be specified in the smallest denomination of the applicable currency (for example, US dollar amounts are specified in cents).
    * For more information, see [Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts).
    * The currency code must match the currency associated with the business that is accepting the payment.
    */
  var tip_money: js.UndefOr[Money] = js.native
  
  /**
    * An identifying token generated by `SqPaymentForm.verifyBuyer()`.
    * Verification tokens encapsulate customer device information and 3-D Secure challenge results to indicate
    * that Square has verified the buyer identity. For more information, see [SCA Overview](https://developer.squareup.com/docs/sca-overview).
    */
  var verification_token: js.UndefOr[String] = js.native
}
