package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveOrdersResponse")
@js.native
class BatchRetrieveOrdersResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
  /**
    * The requested orders. This will omit any requested orders that do not exist or are not charged.
    */
  var orders: js.UndefOr[js.Array[Order]] = js.native
  /**
    * List of transaction ids within the requested set of ids that encountered transformation issues when being
    * converted to an Order.
    */
  var unconvertible_transaction_ids: js.UndefOr[js.Array[java.lang.String]] = js.native
}

