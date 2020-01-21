package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "AdditionalRecipientReceivableRefund")
@js.native
class AdditionalRecipientReceivableRefund () extends js.Object {
  /**
    * The amount of the refund. This will always be non-negative.
    */
  var amount_money: Money = js.native
  /**
    * The time when the refund was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * The receivable refund's unique ID, issued by Square payments servers.
    */
  var id: String = js.native
  /**
    * The ID of the receivable that the refund was applied to.
    */
  var receivable_id: String = js.native
  /**
    * The ID of the refund that is associated to this receivable refund.
    */
  var refund_id: String = js.native
  /**
    * The ID of the location that created the receivable. This is the location ID on the associated transaction.
    */
  var transaction_location_id: String = js.native
}

