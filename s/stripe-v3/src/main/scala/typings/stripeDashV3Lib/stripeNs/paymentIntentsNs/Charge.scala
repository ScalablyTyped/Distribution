package typings
package stripeDashV3Lib.stripeNs.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charge extends js.Object {
  /**
    * Amount charged in cents/pence, positive integer or zero.
    */
  var amount: scala.Double
  /**
    * Amount in cents/pence refunded (can be less than the amount attribute on the
    * charge if a partial refund was issued), positive integer or zero.
    */
  var amount_refunded: scala.Double
  /**
    * ID of the Connect application that created the charge.
    */
  var application: java.lang.String | scala.Null
  /**
    * The application fee (if any) for the charge. See the Connect documentation
    * for details.
    */
  var application_fee: java.lang.String | scala.Null
  /**
    * The amount of the application fee (if any) for the charge. See the Connect
    * documentation for details.
    */
  var application_fee_amount: scala.Double | scala.Null
  /**
    * ID of the balance transaction that describes the impact of this charge on
    * your account balance (not including refunds or disputes).
    */
  var balance_transaction: java.lang.String
  /**
    * Billing information associated with the payment method at the time of the transaction.
    */
  var billing_details: stripeDashV3Lib.stripeNs.BillingDetails
  /**
    * If the charge was created without capturing, this boolean represents whether or not it is
    * still uncaptured or has since been captured.
    */
  var captured: scala.Boolean
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency in which the
    * charge was made.
    */
  var currency: java.lang.String
  /**
    * ID of the customer this charge is for if one exists.
    */
  var customer: java.lang.String | scala.Null
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: java.lang.String | scala.Null
  /**
    * Details about the dispute if the charge has been disputed.
    */
  var dispute: java.lang.String | scala.Null
  /**
    * Error code explaining reason for charge failure if available (see the errors section for a list of
    * codes: https://stripe.com/docs/api#errors).
    */
  var failure_code: java.lang.String | scala.Null
  /**
    * Message to user further explaining reason for charge failure if available.
    */
  var failure_message: java.lang.String | scala.Null
  /**
    * Hash with information on fraud assessments for the charge.
    */
  var fraud_details: stripeDashV3Lib.Anon_Fraudulent
  /**
    * Unique identifier for the object.
    */
  var id: java.lang.String
  /**
    * ID of the invoice this charge is for if one exists. [Expandable]
    */
  var invoice: java.lang.String | scala.Null
  /**
    * Has the value true if the object exists in live mode or the value false if
    * the object exists in test mode.
    */
  var livemode: scala.Boolean
  var metadata: stripeDashV3Lib.stripeNs.Metadata
  /**
    * Value is 'charge'
    */
  var `object`: stripeDashV3Lib.stripeDashV3LibStrings.charge
  /**
    * The Stripe account ID for which these funds are intended. Automatically
    * set if you use the destination parameter. For details, see [Creating
    * Separate Charges and Transfers]
    * <https://stripe.com/docs/connect/charges-transfers#on-behalf-of>.
    */
  var on_behalf_of: java.lang.String | scala.Null
  /**
    * ID of the order this charge is for if one exists.
    */
  var order: java.lang.String | scala.Null
  /**
    * Details about whether the payment was accepted, and why. See
    * understanding declines for details.
    */
  var outcome: stripeDashV3Lib.Anon_Approvedbynetwork | scala.Null
  /**
    * true if the charge succeeded, or was successfully authorized for later capture.
    */
  var paid: scala.Boolean
  /**
    * ID of the PaymentIntent associated with this charge, if one exists.
    */
  var payment_intent: java.lang.String
  /**
    * ID of the payment method used in this charge.
    */
  var payment_method: java.lang.String | scala.Null
  var payment_method_details: stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethodDetails
  /**
    * This is the email address that the receipt for this charge was sent to.
    */
  var receipt_email: java.lang.String | scala.Null
  /**
    * This is the transaction number that appears on email receipts sent for this charge.
    */
  var receipt_number: java.lang.String | scala.Null
  /**
    * This is the URL to view the receipt for this charge. The receipt is kept up-to-date to the
    * latest state of the charge, including any refunds. If the charge is for an Invoice, the
    * receipt will be stylized as an Invoice receipt.
    */
  var receipt_url: java.lang.String
  /**
    * Whether or not the charge has been fully refunded. If the charge is only partially refunded,
    * this attribute will still be false.
    */
  var refunded: scala.Boolean
  /**
    * A list of refunds that have been applied to the charge.
    */
  var refunds: stripeDashV3Lib.stripeNs.List[Refund]
  /**
    * ID of the review associated with this charge if one exists.
    */
  var review: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Shipping information for the charge.
    */
  var shipping: js.UndefOr[stripeDashV3Lib.stripeNs.ShippingDetails | scala.Null] = js.undefined
  /**
    * For most Stripe users, the source of every charge is a credit or debit card.
    * This hash is then the card object describing that card.
    */
  var source: js.UndefOr[stripeDashV3Lib.stripeNs.Source] = js.undefined
  /**
    * The transfer ID which created this charge. Only present if the charge came
    * from another Stripe account. See the Connect documentation for details.
    */
  var source_transfer: java.lang.String | scala.Null
  /**
    * Extra information about a charge. This will appear on your customer’s
    * credit card statement.
    */
  var statement_descriptor: java.lang.String | scala.Null
  /**
    * The status of the payment is either "succeeded", "pending", or "failed".
    */
  var status: stripeDashV3Lib.stripeDashV3LibStrings.succeeded | stripeDashV3Lib.stripeDashV3LibStrings.pending | stripeDashV3Lib.stripeDashV3LibStrings.failed
  /**
    * ID of the transfer to the destination account (only applicable if the
    * charge was created using the destination parameter).
    */
  var transfer: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    */
  var transfer_group: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Charge {
  @scala.inline
  def apply(
    amount: scala.Double,
    amount_refunded: scala.Double,
    balance_transaction: java.lang.String,
    billing_details: stripeDashV3Lib.stripeNs.BillingDetails,
    captured: scala.Boolean,
    created: scala.Double,
    currency: java.lang.String,
    fraud_details: stripeDashV3Lib.Anon_Fraudulent,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeDashV3Lib.stripeNs.Metadata,
    `object`: stripeDashV3Lib.stripeDashV3LibStrings.charge,
    paid: scala.Boolean,
    payment_intent: java.lang.String,
    payment_method_details: stripeDashV3Lib.stripeNs.paymentMethodNs.PaymentMethodDetails,
    receipt_url: java.lang.String,
    refunded: scala.Boolean,
    refunds: stripeDashV3Lib.stripeNs.List[Refund],
    status: stripeDashV3Lib.stripeDashV3LibStrings.succeeded | stripeDashV3Lib.stripeDashV3LibStrings.pending | stripeDashV3Lib.stripeDashV3LibStrings.failed,
    application: java.lang.String = null,
    application_fee: java.lang.String = null,
    application_fee_amount: scala.Int | scala.Double = null,
    customer: java.lang.String = null,
    description: java.lang.String = null,
    dispute: java.lang.String = null,
    failure_code: java.lang.String = null,
    failure_message: java.lang.String = null,
    invoice: java.lang.String = null,
    on_behalf_of: java.lang.String = null,
    order: java.lang.String = null,
    outcome: stripeDashV3Lib.Anon_Approvedbynetwork = null,
    payment_method: java.lang.String = null,
    receipt_email: java.lang.String = null,
    receipt_number: java.lang.String = null,
    review: java.lang.String = null,
    shipping: stripeDashV3Lib.stripeNs.ShippingDetails = null,
    source: stripeDashV3Lib.stripeNs.Source = null,
    source_transfer: java.lang.String = null,
    statement_descriptor: java.lang.String = null,
    transfer: java.lang.String = null,
    transfer_group: java.lang.String = null
  ): Charge = {
    val __obj = js.Dynamic.literal(amount = amount, amount_refunded = amount_refunded, balance_transaction = balance_transaction, billing_details = billing_details, captured = captured, created = created, currency = currency, fraud_details = fraud_details, id = id, livemode = livemode, metadata = metadata, paid = paid, payment_intent = payment_intent, payment_method_details = payment_method_details, receipt_url = receipt_url, refunded = refunded, refunds = refunds, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (application != null) __obj.updateDynamic("application")(application)
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee)
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dispute != null) __obj.updateDynamic("dispute")(dispute)
    if (failure_code != null) __obj.updateDynamic("failure_code")(failure_code)
    if (failure_message != null) __obj.updateDynamic("failure_message")(failure_message)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (order != null) __obj.updateDynamic("order")(order)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (receipt_number != null) __obj.updateDynamic("receipt_number")(receipt_number)
    if (review != null) __obj.updateDynamic("review")(review)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source)
    if (source_transfer != null) __obj.updateDynamic("source_transfer")(source_transfer)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer != null) __obj.updateDynamic("transfer")(transfer)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[Charge]
  }
}

