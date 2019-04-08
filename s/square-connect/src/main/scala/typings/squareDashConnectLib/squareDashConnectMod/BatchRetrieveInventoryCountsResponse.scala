package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "BatchRetrieveInventoryCountsResponse")
@js.native
class BatchRetrieveInventoryCountsResponse () extends js.Object {
  /**
    * The current calculated inventory counts for the requested objects and locations.
    */
  var counts: js.UndefOr[js.Array[InventoryCount]] = js.native
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.  See
    * [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[java.lang.String] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[stdLib.Error]] = js.native
}

