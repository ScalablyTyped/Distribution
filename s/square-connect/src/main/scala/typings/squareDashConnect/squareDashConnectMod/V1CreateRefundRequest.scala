package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1CreateRefundRequestNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1CreateRefundRequest")
@js.native
class V1CreateRefundRequest () extends js.Object {
  /**
    * The ID of the payment to refund. If you are creating a `PARTIAL` refund for a split tender payment, instead
    * provide the id of the particular tender you want to refund.
    */
  var payment_id: String = js.native
  /**
    * The reason for the refund.
    */
  var reason: String = js.native
  /**
    * The amount of money to refund. Required only for PARTIAL refunds.
    */
  var refunded_money: js.UndefOr[V1Money] = js.native
  /**
    * An optional key to ensure idempotence if you issue the same PARTIAL refund request more than once.
    */
  var request_idempotence_key: js.UndefOr[String] = js.native
  /**
    * TThe type of refund (FULL or PARTIAL).
    * See [V1CreateRefundRequestType](#type-v1createrefundrequesttype) for possible values.
    */
  var `type`: TypeEnum = js.native
}

