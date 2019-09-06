package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RefundsApi")
@js.native
class RefundsApi () extends js.Object {
  /**
    * Retrieves a specific `Refund` using the `refund_id`.
    */
  def getPaymentRefund(refundId: String): js.Promise[GetPaymentRefundResponse] = js.native
  /**
    * Retrieves a list of refunds for the account making the request. Max results per page: 100.
    */
  def listPaymentRefunds(params: ListPaymentRefundsRequest): js.Promise[ListPaymentRefundsResponse] = js.native
  /**
    * Refunds a payment. You can refund the entire payment amount or a  portion of it.
    * For more information, see [Payments and Refunds Overview](/payments-api/overview).
    */
  def refundPayment(body: RefundPaymentRequest): js.Promise[RefundPaymentResponse] = js.native
}

