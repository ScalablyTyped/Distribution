package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateRefundRequest")
@js.native
class CreateRefundRequest () extends js.Object {
  /**
    * The amount of money to refund. Note that you specify the amount in the __smallest denomination of the applicable
    * currency__. For example, US dollar amounts are specified in cents. See [Working with monetary
    * amounts](#workingwithmonetaryamounts) for details. This amount cannot exceed the amount that was originally
    * charged to the tender that corresponds to `tender_id`.
    */
  var amount_money: Money = js.native
  /**
    * A value you specify that uniquely identifies this refund among refunds you've created for the tender.  If you're
    * unsure whether a particular refund succeeded, you can reattempt it with the same idempotency key without worrying
    * about duplicating the refund. See [Idempotency](/basics/api101/idempotency) for more information.
    */
  var idempotency_key: java.lang.String = js.native
  /**
    * A description of the reason for the refund. Default value: `Refund via API`
    */
  var reason: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of the tender to refund.  A [`Transaction`](#type-transaction) has one or more `tenders` (i.e., methods of
    * payment) associated with it, and you refund each tender separately with the Connect API.
    */
  var tender_id: java.lang.String = js.native
}

