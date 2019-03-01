package typings
package shopifyDashPrimeLib.distModelsTransactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction
  extends shopifyDashPrimeLib.distModelsBaseMod.ShopifyObject {
  /**
    * The amount of money that the transaction was for. Note: Shopify may return this property as a string.
    */
  var amount: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The authorization code associated with the transaction.
    */
  var authorization: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date and time when the transaction was created.
    */
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier for the device.
    */
  var device_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A standardized error code, e.g. 'incorrect_number', independent of the payment provider. Value can be null. A full list of known values can be found at https://help.shopify.com/api/reference/transaction.
    */
  var error_code: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the gateway the transaction was issued through.
    */
  var gateway: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The kind of transaction. Known values are 'authorization', 'capture', 'sale', 'void' and 'refund'.
    */
  var kind: js.UndefOr[shopifyDashPrimeLib.distEnumsTransactionUnderscoreKindMod.TransactionKind] = js.undefined
  /**
    * A unique numeric identifier for the order.
    */
  var order_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * An object containing information about the credit card used for this transaction.
    */
  var payment_details: js.UndefOr[shopifyDashPrimeLib.distModelsPaymentUnderscoreDetailsMod.PaymentDetails] = js.undefined
  /**
    * Shopify does not currently offer documentation for this object.
    */
  var receipt: js.UndefOr[js.Any] = js.undefined
  /**
    * The origin of the transaction. This is set by Shopify and cannot be overridden. Example values include: 'web', 'pos', 'iphone', 'android'.
    */
  var source_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The status of the transaction. Known values are: pending, failure, success or error.
    */
  var status: js.UndefOr[shopifyDashPrimeLib.distEnumsTransactionUnderscoreStatusMod.TransactionStatus] = js.undefined
  /**
    * Whether the transaction is for testing purposes.
    */
  var test: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The unique identifier for the user.
    */
  var user_id: js.UndefOr[scala.Double] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    admin_graphql_api_id: java.lang.String = null,
    amount: java.lang.String | scala.Double = null,
    authorization: java.lang.String = null,
    created_at: java.lang.String = null,
    currency: java.lang.String = null,
    device_id: java.lang.String = null,
    error_code: java.lang.String = null,
    gateway: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    kind: shopifyDashPrimeLib.distEnumsTransactionUnderscoreKindMod.TransactionKind = null,
    order_id: scala.Int | scala.Double = null,
    payment_details: shopifyDashPrimeLib.distModelsPaymentUnderscoreDetailsMod.PaymentDetails = null,
    receipt: js.Any = null,
    source_name: java.lang.String = null,
    status: shopifyDashPrimeLib.distEnumsTransactionUnderscoreStatusMod.TransactionStatus = null,
    test: js.UndefOr[scala.Boolean] = js.undefined,
    user_id: scala.Int | scala.Double = null
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

