package typings.stripeDashV3.stripeNs.paymentIntentsNs

import typings.stripeDashV3.Anon_Destination
import typings.stripeDashV3.stripeDashV3Strings.automatic
import typings.stripeDashV3.stripeDashV3Strings.manual
import typings.stripeDashV3.stripeDashV3Strings.payment_intent
import typings.stripeDashV3.stripeNs.Error
import typings.stripeDashV3.stripeNs.List
import typings.stripeDashV3.stripeNs.Metadata
import typings.stripeDashV3.stripeNs.ShippingDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntent extends js.Object {
  /**
    * The amount in cents that is to be collected from this PaymentIntent.
    */
  var amount: Double
  /**
    * The amount that can be captured with from this PaymentIntent (in cents).
    */
  var amount_capturable: Double
  /**
    * The amount that was collected from this PaymentIntent (in cents).
    */
  var amount_received: Double
  /**
    * ID of the Connect application that created the PaymentIntent.
    */
  var application: String | Null
  /**
    * A fee in cents that will be applied to the invoice and transferred to the application owner's Stripe account.
    */
  var application_fee_amount: Double | Null
  /**
    * User-given reason for cancellation of this PaymentIntent.
    */
  var cancelation_reason: PaymentIntentCancelationReason | Null
  /**
    * Populated when `status` is `canceled`, this is the time at which the PaymentIntent was canceled.
    * Measured in seconds since the Unix epoch.
    */
  var canceled_at: Double | Null
  /**
    * Capture method of this PaymentIntent.
    */
  var capture_method: automatic | manual
  /**
    * Charges that were created by this PaymentIntent, if any.
    */
  var charges: List[Charge]
  /**
    * The client secret of this PaymentIntent. Used for client-side retrieval using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: String
  /**
    * Confirmation method of this PaymentIntent.
    */
  var confirmation_method: automatic | manual
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * ID of the Customer this PaymentIntent is for if one exists.
    */
  var customer: String | Null
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier for the object.
    */
  var id: String
  /**
    * The payment error encountered in the previous PaymentIntent confirmation.
    */
  var last_payment_error: Error | Null
  /**
    * Has the value true if the object exists in live mode or the value false
    * if the object exists in test mode.
    */
  var livemode: Boolean
  var metadata: Metadata
  /**
    * If present, this property tells you what actions you need to take in order
    * for your customer to fulfill a payment using the provided source.
    */
  var next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl
  /**
    * Value is "payment_intent".
    */
  var `object`: payment_intent
  /**
    * The account (if any) for which the funds of the PaymentIntent are intended.
    * See the PaymentIntents Connect usage guide for details.
    */
  var on_behalf_of: String | Null
  /**
    * ID of the payment method used in this PaymentIntent.
    */
  var payment_method: String | Null
  /**
    * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
    */
  var payment_method_types: js.Array[String]
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: String | Null
  /**
    * ID of the review associated with this PaymentIntent, if any.
    */
  var review: String | Null
  /**
    * Shipping information for this PaymentIntent.
    */
  var shipping: ShippingDetails | Null
  /**
    * The ID of a Source (e.g. 'src_abc123' or 'card_abc123').
    * Will be null unless this PaymentIntent was created with a source
    * instead of a payment_method. (Undocumented as of August 2019)
    */
  var source: String | Null
  /**
    * Extra information about a PaymentIntent. This will appear on your
    * customer’s statement when this PaymentIntent succeeds in creating a charge.
    */
  var statement_descriptor: String | Null
  /**
    * The several states the PaymentIntent goes through until it it either canceled or succeeds.
    */
  var status: PaymentIntentStatus
  /**
    * The data with which to automatically create a Transfer when the payment is finalized.
    */
  var transfer_data: Anon_Destination | Null
  /**
    * A string that identifies the resulting payment as part of a group.
    */
  var transfer_group: String | Null
}

object PaymentIntent {
  @scala.inline
  def apply(
    amount: Double,
    amount_capturable: Double,
    amount_received: Double,
    capture_method: automatic | manual,
    charges: List[Charge],
    client_secret: String,
    confirmation_method: automatic | manual,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    next_action: PaymentIntentNextActionUseStripeSdk | PaymentIntentNextActionRedirectToUrl,
    `object`: payment_intent,
    payment_method_types: js.Array[String],
    status: PaymentIntentStatus,
    application: String = null,
    application_fee_amount: Int | Double = null,
    cancelation_reason: PaymentIntentCancelationReason = null,
    canceled_at: Int | Double = null,
    customer: String = null,
    description: String = null,
    last_payment_error: Error = null,
    on_behalf_of: String = null,
    payment_method: String = null,
    receipt_email: String = null,
    review: String = null,
    shipping: ShippingDetails = null,
    source: String = null,
    statement_descriptor: String = null,
    transfer_data: Anon_Destination = null,
    transfer_group: String = null
  ): PaymentIntent = {
    val __obj = js.Dynamic.literal(amount = amount, amount_capturable = amount_capturable, amount_received = amount_received, capture_method = capture_method.asInstanceOf[js.Any], charges = charges, client_secret = client_secret, confirmation_method = confirmation_method.asInstanceOf[js.Any], created = created, currency = currency, id = id, livemode = livemode, metadata = metadata, next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types, status = status)
    __obj.updateDynamic("object")(`object`)
    if (application != null) __obj.updateDynamic("application")(application)
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (cancelation_reason != null) __obj.updateDynamic("cancelation_reason")(cancelation_reason)
    if (canceled_at != null) __obj.updateDynamic("canceled_at")(canceled_at.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (last_payment_error != null) __obj.updateDynamic("last_payment_error")(last_payment_error)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (review != null) __obj.updateDynamic("review")(review)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[PaymentIntent]
  }
}

