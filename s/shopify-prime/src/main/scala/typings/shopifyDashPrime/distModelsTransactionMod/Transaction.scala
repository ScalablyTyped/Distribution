package typings.shopifyDashPrime.distModelsTransactionMod

import typings.shopifyDashPrime.distEnumsTransactionUnderscoreKindMod.TransactionKind
import typings.shopifyDashPrime.distEnumsTransactionUnderscoreStatusMod.TransactionStatus
import typings.shopifyDashPrime.distModelsBaseMod.ShopifyObject
import typings.shopifyDashPrime.distModelsPaymentUnderscoreDetailsMod.PaymentDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends ShopifyObject {
  /**
    * The amount of money that the transaction was for. Note: Shopify may return this property as a string.
    */
  var amount: js.UndefOr[String | Double] = js.undefined
  /**
    * The authorization code associated with the transaction.
    */
  var authorization: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the transaction was created.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier for the device.
    */
  var device_id: js.UndefOr[String] = js.undefined
  /**
    * A standardized error code, e.g. 'incorrect_number', independent of the payment provider. Value can be null. A full list of known values can be found at https://help.shopify.com/api/reference/transaction.
    */
  var error_code: js.UndefOr[String] = js.undefined
  /**
    * The name of the gateway the transaction was issued through.
    */
  var gateway: js.UndefOr[String] = js.undefined
  /**
    * The kind of transaction. Known values are 'authorization', 'capture', 'sale', 'void' and 'refund'.
    */
  var kind: js.UndefOr[TransactionKind] = js.undefined
  /**
    * A unique numeric identifier for the order.
    */
  var order_id: js.UndefOr[Double] = js.undefined
  /**
    * An object containing information about the credit card used for this transaction.
    */
  var payment_details: js.UndefOr[PaymentDetails] = js.undefined
  /**
    * Shopify does not currently offer documentation for this object.
    */
  var receipt: js.UndefOr[js.Any] = js.undefined
  /**
    * The origin of the transaction. This is set by Shopify and cannot be overridden. Example values include: 'web', 'pos', 'iphone', 'android'.
    */
  var source_name: js.UndefOr[String] = js.undefined
  /**
    * The status of the transaction. Known values are: pending, failure, success or error.
    */
  var status: js.UndefOr[TransactionStatus] = js.undefined
  /**
    * Whether the transaction is for testing purposes.
    */
  var test: js.UndefOr[Boolean] = js.undefined
  /**
    * The unique identifier for the user.
    */
  var user_id: js.UndefOr[Double] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    amount: String | Double = null,
    authorization: String = null,
    created_at: String = null,
    currency: String = null,
    device_id: String = null,
    error_code: String = null,
    gateway: String = null,
    id: Int | Double = null,
    kind: TransactionKind = null,
    order_id: Int | Double = null,
    payment_details: PaymentDetails = null,
    receipt: js.Any = null,
    source_name: String = null,
    status: TransactionStatus = null,
    test: js.UndefOr[Boolean] = js.undefined,
    user_id: Int | Double = null
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (device_id != null) __obj.updateDynamic("device_id")(device_id)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code)
    if (gateway != null) __obj.updateDynamic("gateway")(gateway)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (order_id != null) __obj.updateDynamic("order_id")(order_id.asInstanceOf[js.Any])
    if (payment_details != null) __obj.updateDynamic("payment_details")(payment_details)
    if (receipt != null) __obj.updateDynamic("receipt")(receipt)
    if (source_name != null) __obj.updateDynamic("source_name")(source_name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

