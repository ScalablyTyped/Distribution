package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "PaymentsApi")
@js.native
/**
  * Constructs a new PaymentsApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
class PaymentsApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Cancels (voids) a payment. If you set `autocomplete` to false when creating a payment, you can cancel the payment
    * using this endpoint. For more information, see  [Delayed Payments](/payments-api/take-payments#delayed-payments).
    */
  def cancelPayment(paymentId: String): js.Promise[CancelPaymentResponse] = js.native
  
  /**
    * Cancels (voids) a payment identified by the idempotency key that is specified in the request.
    * Use this method when status of a CreatePayment request is unknown. For example, after you send a CreatePayment
    * request a network error occurs and you don't get a response. In this case, you can direct Square to cancel
    * the payment using this endpoint. In the request, you provide the same idempotency key that you provided in your
    * CreatePayment request you want  to cancel. After cancelling the payment, you can submit your CreatePayment request again.
    * Note that if no payment with the specified idempotency key is found, no action is taken, the end point returns successfully.
    */
  def cancelPaymentByIdempotencyKey(body: CancelPaymentByIdempotencyKeyRequest): js.Promise[CancelPaymentByIdempotencyKeyResponse] = js.native
  
  /**
    * Completes (captures) a payment. By default, payments are set to complete immediately after they are created.
    * If you set autocomplete to false when creating a payment, you can complete (capture) the payment using this endpoint.
    * For more information, see [Delayed Payments](/payments-api/take-payments#delayed-payments).
    */
  def completePayment(paymentId: String): js.Promise[CompletePaymentResponse] = js.native
  
  /**
    * Charges a payment source, for example, a card represented by customer's card on file or a card nonce.
    * In addition to the payment source, the request must also include the amount to accept for the payment.
    * There are several optional parameters that you can include in the request.
    * For example, tip money, whether to autocomplete the payment, or a reference ID to correlate this payment with
    * another system. For more information about these  payment options, see [Take Payments](/payments-api/take-payments).
    * The `PAYMENTS_WRITE_ADDITIONAL_RECIPIENTS` OAuth permission is required to enable application fees.
    */
  def createPayment(body: CreatePaymentRequest): js.Promise[CreatePaymentResponse] = js.native
  
  /**
    * Retrieves details for a specific Payment.
    */
  def getPayment(paymentId: String): js.Promise[GetPaymentResponse] = js.native
  
  /**
    * Retrieves a list of payments taken by the account making the request. Max results per page: 100.
    */
  def listPayments(params: ListPaymentsRequest): js.Promise[ListPaymentsResponse] = js.native
}
