package typings
package stripeDashV3Lib.stripeNs.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refund extends js.Object {
  /**
    * Refund amount, in cents.
    */
  var amount: scala.Double
  /**
    * Balance transaction that describes the impact on your account balance.
    */
  var balance_transaction: java.lang.String | scala.Null
  /**
    * ID of the charge that was refunded.
    */
  var charge: java.lang.String
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: scala.Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: java.lang.String
  /**
    * An arbitrary string attached to the object. Often useful for
    * displaying to users. (Available on non-card refunds only)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the refund failed, this balance transaction describes the
    * adjustment made on your account balance that reverses the
    * initial balance transaction.
    */
  var failure_balance_transaction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the refund failed, the reason for refund failure if known
    */
  var failure_reason: js.UndefOr[
    stripeDashV3Lib.stripeDashV3LibStrings.lost_or_stolen_card | stripeDashV3Lib.stripeDashV3LibStrings.expired_or_canceled_card | stripeDashV3Lib.stripeDashV3LibStrings.unknown
  ] = js.undefined
  /**
    * Unique identifier for the object.
    */
  var id: java.lang.String
  var metadata: stripeDashV3Lib.stripeNs.Metadata
  /**
    * Value is "refund"
    */
  var `object`: stripeDashV3Lib.stripeDashV3LibStrings.refund
  /**
    * Reason for the refund
    */
  var reason: stripeDashV3Lib.stripeDashV3LibStrings.duplicate | stripeDashV3Lib.stripeDashV3LibStrings.fraudulent | stripeDashV3Lib.stripeDashV3LibStrings.requested_by_customer | scala.Null
  /**
    * This is the transaction number that appears on email
    * receipts sent for this refund.
    */
  var receipt_number: java.lang.String | scala.Null
  /**
    * The transfer reversal that is associated with the refund.
    * Only present if the charge came from another Stripe account.
    * See the Connect documentation for details.
    */
  var source_transfer_reversal: java.lang.String | scala.Null
  /**
    * Status of the refund. For credit card refunds, this can be
    * pending, succeeded, or failed. For other types of refunds,
    * it can be pending, succeeded, failed, or canceled. Refer to
    * our refunds documentation for more details.
    */
  var status: stripeDashV3Lib.stripeDashV3LibStrings.pending | stripeDashV3Lib.stripeDashV3LibStrings.succeeded | stripeDashV3Lib.stripeDashV3LibStrings.failed | stripeDashV3Lib.stripeDashV3LibStrings.canceled
  /**
    * If the accompanying transfer was reversed, the transfer reversal object.
    * Only applicable if the charge was created using the destination parameter.
    */
  var transfer_reversal: java.lang.String | scala.Null
}

object Refund {
  @scala.inline
  def apply(
    amount: scala.Double,
    charge: java.lang.String,
    created: scala.Double,
    currency: java.lang.String,
    id: java.lang.String,
    metadata: stripeDashV3Lib.stripeNs.Metadata,
    `object`: stripeDashV3Lib.stripeDashV3LibStrings.refund,
    status: stripeDashV3Lib.stripeDashV3LibStrings.pending | stripeDashV3Lib.stripeDashV3LibStrings.succeeded | stripeDashV3Lib.stripeDashV3LibStrings.failed | stripeDashV3Lib.stripeDashV3LibStrings.canceled,
    balance_transaction: java.lang.String = null,
    description: java.lang.String = null,
    failure_balance_transaction: java.lang.String = null,
    failure_reason: stripeDashV3Lib.stripeDashV3LibStrings.lost_or_stolen_card | stripeDashV3Lib.stripeDashV3LibStrings.expired_or_canceled_card | stripeDashV3Lib.stripeDashV3LibStrings.unknown = null,
    reason: stripeDashV3Lib.stripeDashV3LibStrings.duplicate | stripeDashV3Lib.stripeDashV3LibStrings.fraudulent | stripeDashV3Lib.stripeDashV3LibStrings.requested_by_customer = null,
    receipt_number: java.lang.String = null,
    source_transfer_reversal: java.lang.String = null,
    transfer_reversal: java.lang.String = null
  ): Refund = {
    val __obj = js.Dynamic.literal(amount = amount, charge = charge, created = created, currency = currency, id = id, metadata = metadata, status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (balance_transaction != null) __obj.updateDynamic("balance_transaction")(balance_transaction)
    if (description != null) __obj.updateDynamic("description")(description)
    if (failure_balance_transaction != null) __obj.updateDynamic("failure_balance_transaction")(failure_balance_transaction)
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (receipt_number != null) __obj.updateDynamic("receipt_number")(receipt_number)
    if (source_transfer_reversal != null) __obj.updateDynamic("source_transfer_reversal")(source_transfer_reversal)
    if (transfer_reversal != null) __obj.updateDynamic("transfer_reversal")(transfer_reversal)
    __obj.asInstanceOf[Refund]
  }
}

