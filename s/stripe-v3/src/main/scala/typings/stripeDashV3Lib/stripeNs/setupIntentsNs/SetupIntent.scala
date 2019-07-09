package typings
package stripeDashV3Lib.stripeNs.setupIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupIntent extends js.Object {
  /**
    * ID of the Connect application that created the SetupIntent.
    */
  var application: java.lang.String | scala.Null
  /**
    * Reason for cancellation of this SetupIntent.
    */
  var cancelation_reason: SetupIntentCancelationReason | scala.Null
  /**
    * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
    * The client secret can be used to complete payment setup from your frontend.
    * It should not be stored, logged, embedded in URLs, or exposed to anyone other than the customer.
    * Make sure that you have TLS enabled on any page that includes the client secret.
    */
  var client_secret: java.lang.String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: scala.Double
  /**
    * ID of the Customer this SetupIntent belongs to, if one exists.
    * If present, payment methods used with this SetupIntent can only be attached
    * to this Customer, and payment methods attached to other Customers cannot be
    * used with this SetupIntent.
    */
  var customer: java.lang.String | scala.Null
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique identifier for the object.
    */
  var id: java.lang.String
  /**
    * The error encountered in the previous SetupIntent confirmation.
    */
  var last_payment_error: stripeDashV3Lib.stripeNs.Error | scala.Null
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: scala.Boolean
  /**
    * Set of key-value pairs that you can attach to an object. This can be
    * useful for storing additional information about the object in a structured format.
    */
  var metadata: stripeDashV3Lib.stripeNs.Metadata
  /**
    * If present, this property tells you what actions you need to take in
    * order for your customer to continue payment setup.
    */
  var next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl
  /**
    * Value is "setup_intent".
    */
  var `object`: stripeDashV3Lib.stripeDashV3LibStrings.setup_intent
  /**
    * The account (if any) for which the setup is intended.
    */
  var on_behalf_of: java.lang.String | scala.Null
  /**
    * ID of the payment method used with this SetupIntent.
    */
  var payment_method: java.lang.String | scala.Null
  /**
    * The list of payment method types (e.g. card) that this SetupIntent is allowed to set up.
    */
  var payment_method_types: js.Array[java.lang.String]
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
  var usage: stripeDashV3Lib.stripeDashV3LibStrings.on_session | stripeDashV3Lib.stripeDashV3LibStrings.off_session
}

object SetupIntent {
  @scala.inline
  def apply(
    client_secret: java.lang.String,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeDashV3Lib.stripeNs.Metadata,
    next_action: SetupIntentNextActionUseStripeSdk | SetupIntentNextActionRedirectToUrl,
    `object`: stripeDashV3Lib.stripeDashV3LibStrings.setup_intent,
    payment_method_types: js.Array[java.lang.String],
    status: SetupIntentStatus,
    usage: stripeDashV3Lib.stripeDashV3LibStrings.on_session | stripeDashV3Lib.stripeDashV3LibStrings.off_session,
    application: java.lang.String = null,
    cancelation_reason: SetupIntentCancelationReason = null,
    customer: java.lang.String = null,
    description: java.lang.String = null,
    last_payment_error: stripeDashV3Lib.stripeNs.Error = null,
    on_behalf_of: java.lang.String = null,
    payment_method: java.lang.String = null
  ): SetupIntent = {
    val __obj = js.Dynamic.literal(client_secret = client_secret, created = created, id = id, livemode = livemode, metadata = metadata, next_action = next_action.asInstanceOf[js.Any], payment_method_types = payment_method_types, status = status, usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (application != null) __obj.updateDynamic("application")(application)
    if (cancelation_reason != null) __obj.updateDynamic("cancelation_reason")(cancelation_reason)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (last_payment_error != null) __obj.updateDynamic("last_payment_error")(last_payment_error)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    __obj.asInstanceOf[SetupIntent]
  }
}

