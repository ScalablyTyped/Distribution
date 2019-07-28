package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersRequest")
@js.native
class SearchOrdersRequest () extends js.Object {
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for your original query.
    * See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Number of results to be returned in a single page. SearchOrders may use a smaller limit than specified depending
    * on server load. If the response includes a `cursor` field, you can use it to retrieve the next set of results.
    * Default: `500`.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The location IDs for the orders to query. The caller must have access to all provided locations.
    * Min: 1 `location_ids`. Max: 10 `location_ids`.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Query conditions used to filter or sort the results. Note that when fetching additional pages using a `cursor`,
    * the `query` must be equal to the `query` used to fetch the first page of results.
    */
  var query: js.UndefOr[SearchOrdersQuery] = js.native
  /**
    * If set to `true`, SearchOrders will return [`OrderEntry`](#type-orderentry) objects instead of `Order` objects.
    * `OrderEntry` objects are lightweight descriptions of orders that include `order_id`s.  Default: `false`.
    */
  var return_entries: js.UndefOr[Boolean] = js.native
}

