package typings.shopifyPrime.transactionMod

import typings.shopifyPrime.baseMod.ShopifyObject
import typings.shopifyPrime.paymentDetailsMod.PaymentDetails
import typings.shopifyPrime.transactionKindMod.TransactionKind
import typings.shopifyPrime.transactionStatusMod.TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends ShopifyObject {
  /**
    * The amount of money that the transaction was for. Note: Shopify may return this property as a string.
    */
  var amount: js.UndefOr[String | Double] = js.native
  /**
    * The authorization code associated with the transaction.
    */
  var authorization: js.UndefOr[String] = js.native
  /**
    * The date and time when the transaction was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The three letter code (ISO 4217) for the currency used for the payment.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the device.
    */
  var device_id: js.UndefOr[String] = js.native
  /**
    * A standardized error code, e.g. 'incorrect_number', independent of the payment provider. Value can be null. A full list of known values can be found at https://help.shopify.com/api/reference/transaction.
    */
  var error_code: js.UndefOr[String] = js.native
  /**
    * The name of the gateway the transaction was issued through.
    */
  var gateway: js.UndefOr[String] = js.native
  /**
    * The kind of transaction. Known values are 'authorization', 'capture', 'sale', 'void' and 'refund'.
    */
  var kind: js.UndefOr[TransactionKind] = js.native
  /**
    * A unique numeric identifier for the order.
    */
  var order_id: js.UndefOr[Double] = js.native
  /**
    * An object containing information about the credit card used for this transaction.
    */
  var payment_details: js.UndefOr[PaymentDetails] = js.native
  /**
    * Shopify does not currently offer documentation for this object.
    */
  var receipt: js.UndefOr[js.Any] = js.native
  /**
    * The origin of the transaction. This is set by Shopify and cannot be overridden. Example values include: 'web', 'pos', 'iphone', 'android'.
    */
  var source_name: js.UndefOr[String] = js.native
  /**
    * The status of the transaction. Known values are: pending, failure, success or error.
    */
  var status: js.UndefOr[TransactionStatus] = js.native
  /**
    * Whether the transaction is for testing purposes.
    */
  var test: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier for the user.
    */
  var user_id: js.UndefOr[Double] = js.native
}

object Transaction {
  @scala.inline
  def apply(): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: String | Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice_id: Self = this.set("device_id", js.undefined)
    @scala.inline
    def setError_code(value: String): Self = this.set("error_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_code: Self = this.set("error_code", js.undefined)
    @scala.inline
    def setGateway(value: String): Self = this.set("gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGateway: Self = this.set("gateway", js.undefined)
    @scala.inline
    def setKind(value: TransactionKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrder_id(value: Double): Self = this.set("order_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_id: Self = this.set("order_id", js.undefined)
    @scala.inline
    def setPayment_details(value: PaymentDetails): Self = this.set("payment_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_details: Self = this.set("payment_details", js.undefined)
    @scala.inline
    def setReceipt(value: js.Any): Self = this.set("receipt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceipt: Self = this.set("receipt", js.undefined)
    @scala.inline
    def setSource_name(value: String): Self = this.set("source_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_name: Self = this.set("source_name", js.undefined)
    @scala.inline
    def setStatus(value: TransactionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTest(value: Boolean): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    @scala.inline
    def setUser_id(value: Double): Self = this.set("user_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
  
}

