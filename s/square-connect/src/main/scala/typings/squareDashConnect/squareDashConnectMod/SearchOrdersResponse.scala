package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersResponse")
@js.native
class SearchOrdersResponse () extends js.Object {
  /**
    * The pagination cursor to be used in a subsequent request. If unset, this is the final response.
    * See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * [Errors](#type-error) encountered during the search.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * List of [OrderEntries](#type-orderentry) that fit the query conditions.
    * Populated only if `return_entries` was set to `true` in the request.
    */
  var order_entries: js.UndefOr[js.Array[OrderEntry]] = js.native
  /**
    * List of [Order](#type-order) objects that match query conditions.
    * Populated only if `return_entries` in the request is set to `false`.
    */
  var orders: js.UndefOr[js.Array[Order]] = js.native
}

