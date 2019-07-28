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
    * Populated only if `order_entries` was set to `true` in the request.
    */
  var order_entries: js.UndefOr[js.Array[OrderEntry]] = js.native
  /**
    * List of [Orders](#type-order) that match query conditions.
    * Populated only if `return_entries` in the request is set to `false`.
    */
  var orders: js.UndefOr[js.Array[Order]] = js.native
  /**
    * List of transaction IDs identifying transactions that could not be converted to an `Order`.
    * Empty if `return_entries` is true, however, attempts to retrieve those orders may encounter subsequent
    * `unconvertible_transcation_ids` Note that this field will not be present after SearchOrders moves from BETA to GA.
    */
  var unconvertible_transaction_ids: js.UndefOr[js.Array[String]] = js.native
}

