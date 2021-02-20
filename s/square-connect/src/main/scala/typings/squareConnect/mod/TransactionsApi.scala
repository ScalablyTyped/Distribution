package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TransactionsApi")
@js.native
/**
  * Constructs a new TransactionsApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class TransactionsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Captures a transaction that was created with the [Charge](#endpoint-transactions-charge) endpoint with a `delay_capture` value of `true`.
    * See the [Delay Capture of Funds](/transactions-api/cookbook/delay-capture) recipe for more information.
    */
  def captureTransaction(locationId: String, transactionId: String): js.Promise[CaptureTransactionResponse] = js.native
  
  /**
    * Charges a card represented by a card nonce or a customer's card on file.
    * @deprecated recommend using [CreatePayment](#endpoint-payments-createpayment) Your request to this endpoint must
    * include _either_: - A value for the `card_nonce` parameter (to charge a card nonce generated with the `SqPaymentForm`)
    * - Values for the `customer_card_id` and `customer_id` parameters (to charge a customer's card on file)  When this
    * response is returned, the amount of Square's processing fee might not yet be calculated. To obtain the processing fee,
    * wait about ten seconds and call [RetrieveTransaction](#endpoint-transactions-retrievetransaction).
    * See the `processing_fee_money` field of each [Tender included](#type-tender) in the transaction.
    */
  def charge(locationId: String, body: ChargeRequest): js.Promise[ChargeResponse] = js.native
  
  /**
    * Initiates a refund for a previously charged tender.
    * @deprecated recommend using [RefundPayment](#endpoint-refunds-refundpayment) You must issue a refund within 120
    * days of the associated payment. See [this article](https://squareup.com/help/us/en/article/5060) for more
    * information on refund behavior.
    * @note: Card-present transactions with Interac credit cards **cannot be refunded using the Connect API**.
    * Interac transactions must refunded in-person (e.g., dipping the card using POS app).
    */
  def createRefund(locationId: String, transactionId: String, body: CreateRefundRequest): js.Promise[CreateRefundResponse] = js.native
  
  /**
    * Lists refunds for one of a business's locations.
    * @deprecated recommend using [SearchOrders](#endpoint-orders-searchorders) In addition to full or partial tender
    * refunds processed through Square APIs, refunds may result from itemized returns or exchanges through Square's
    * Point of Sale applications. Refunds with a `status` of `PENDING` are not currently included in this endpoint's response.
    * Max results per [page](#paginatingresults): 50.
    */
  def listRefunds(locationId: String, params: ListRefundsRequest): js.Promise[ListRefundsResponse] = js.native
  
  /**
    * Lists transactions for a particular location.
    * @deprecated recommend using [SearchOrders](#endpoint-orders-searchorders) Transactions include payment information
    * from sales and exchanges and refund information from returns and exchanges.
    * Max results per [page](#paginatingresults): 50.
    */
  def listTransactions(locationId: String, params: ListTransactionsRequest): js.Promise[ListTransactionsResponse] = js.native
  
  /**
    * Retrieves details for a single transaction.
    * @deprecated recommend using [BatchRetrieveOrders](#endpoint-batchretrieveorders).
    */
  def retrieveTransaction(locationId: String, transactionId: String): js.Promise[RetrieveTransactionResponse] = js.native
  
  /**
    * Cancels a transaction that was created with the [Charge](#endpoint-transactions-charge) endpoint with a
    * `delay_capture` value of `true`. See the [Delay Capture of Funds](/transactions-api/cookbook/delay-capture) recipe
    * for more information.
    */
  def voidTransaction(locationId: String, transactionId: String): js.Promise[VoidTransactionResponse] = js.native
}
