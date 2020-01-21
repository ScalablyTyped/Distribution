package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ListPaymentRefundsResponse")
@js.native
class ListPaymentRefundsResponse () extends js.Object {
  /**
    * The pagination cursor to be used in a subsequent request. If empty, this is the final response.
    * See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The list of requested refunds.
    */
  var refunds: js.UndefOr[js.Array[PaymentRefund]] = js.native
}

