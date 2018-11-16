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

