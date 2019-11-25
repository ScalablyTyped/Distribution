package typings.stripeDashV3.stripe.setupIntents

import typings.stripeDashV3.stripe.Error
import typings.stripeDashV3.stripe.Metadata
import typings.stripeDashV3.stripeDashV3Strings.off_session
import typings.stripeDashV3.stripeDashV3Strings.on_session
import typings.stripeDashV3.stripeDashV3Strings.setup_intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupIntent extends js.Object {
  /**
    * ID of the Connect application that created the SetupIntent.
    */
  var application: String | Null
  /**
    * Reason for cancellation of this SetupIntent.
    */
  var cancelation_reason: SetupIntentCancelationReason | Null
  /**
    * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
    * The client secret can be used to complete payment setup from your frontend.
    * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the customer.
    * Make sure that you have TLS enabled on any page that includes the client secret.
    */
  var client_secret: String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  /**
    * ID of the Customer this SetupIntent belongs to, if one exists.
    * If present, payment methods used with this SetupIntent can only be attached
    * to this Customer, and payment methods attached to other Customers cannot be
    * used with this SetupIntent.
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
    * The error encountered in the previous SetupIntent confirmation.
    */
  var last_payment_error: Error | Null
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be
    * useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  /**
    * If present, this property tells you what actions you need to take in
    * order for your customer to continue payment setup.
    */
  var next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl
  /**
    * Value is "setup_intent".
    */
  var `object`: setup_intent
  /**
    * The account (if any) for which the setup is intended.
    */
  var on_behalf_of: String | Null
  /**
    * ID of the payment method used with this SetupIntent.
    */
  var payment_method: String | Null
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to set up.
    */
  var payment_method_types: js.Array[String]
  /**
    * Status of this SetupIntent
    */
  var status: SetupIntentStatus
  /**
    * Indicates how the payment method is intended to be used in the future.
    * Use on_session if you intend to only reuse the payment method
    * when the customer is in your checkout flow. Use off_session if your
    * customer may or may not be in your checkout flow. If not provided,
    * this value defaults to off_session.
    */
  var usage: on_session | off_session
}

object SetupIntent {
  @scala.inline
  def apply(
    client_secret: String,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: Metadata,
    next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl,
    `object`: setup_intent,
    payment_method_types: js.Array[String],
    status: SetupIntentStatus,
    usage: on_session | off_session,
    application: String = null,
    cancelation_reason: SetupIntentCancelationReason = null,
    customer: String = null,
    description: String = null,
    last_payment_error: Error = null,
    on_behalf_of: String = null,
    payment_method: String = null
  ): SetupIntent = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (cancelation_reason != null) __obj.updateDynamic("cancelation_reason")(cancelation_reason.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (last_payment_error != null) __obj.updateDynamic("last_payment_error")(last_payment_error.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupIntent]
  }
}

