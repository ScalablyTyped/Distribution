package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveOrdersResponse")
@js.native
class BatchRetrieveOrdersResponse () extends js.Object {
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The requested orders. This will omit any requested orders that do not exist.
    */
  var orders: js.UndefOr[js.Array[Order]] = js.native
}

