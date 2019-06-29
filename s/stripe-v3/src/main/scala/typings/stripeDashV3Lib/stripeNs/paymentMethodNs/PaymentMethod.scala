package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethod extends js.Object {
  /**
    * Billing information associated with the PaymentMethod that may be
    * used or required by particular types of payment methods.
    */
  var billing_details: stripeDashV3Lib.stripeNs.BillingDetails
  /**
    * If this is a card PaymentMethod, this hash contains details about the card.
    */
  var card: js.UndefOr[PaymentMethodCard] = js.undefined
  /**
    * If this is an card_present PaymentMethod, this hash contains details
    * about the Card Present payment method.
    */
  var card_present: js.UndefOr[js.Any] = js.undefined
  /**
    * Time at which the object was created. Measured in seconds since the
    * Unix epoch.
    */
  var created: scala.Double
  /**
    * The ID of the Customer to which this PaymentMethod is saved.
    * This will not be set when the PaymentMethod has not been saved to a Customer.
    */
  var customer: java.lang.String | scala.Null
  /**
    * The unique identifier for the object
    */
  var id: java.lang.String
  /**
    * Has the value true if the object exists in live mode or the value
    * false if the object exists in test mode.
    */
  var livemode: scala.Boolean
  var metadata: stripeDashV3Lib.stripeNs.Metadata
  /**
    * Value is "payment_method"
    */
  var `object`: stripeDashV3Lib.stripeDashV3LibStrings.payment_method
  /**
    * The type of the PaymentMethod. An additional hash is included on the
    * PaymentMethod with a name matching this value. It contains additional
    * information specific to the PaymentMethod type.
    */
  var `type`: java.lang.String
}

object PaymentMethod {
  @scala.inline
  def apply(
    billing_details: stripeDashV3Lib.stripeNs.BillingDetails,
    created: scala.Double,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeDashV3Lib.stripeNs.Metadata,
    `object`: stripeDashV3Lib.stripeDashV3LibStrings.payment_method,
    `type`: java.lang.String,
    card: PaymentMethodCard = null,
    card_present: js.Any = null,
    customer: java.lang.String = null
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(billing_details = billing_details, created = created, id = id, livemode = livemode, metadata = metadata)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (card != null) __obj.updateDynamic("card")(card)
    if (card_present != null) __obj.updateDynamic("card_present")(card_present)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    __obj.asInstanceOf[PaymentMethod]
  }
}

