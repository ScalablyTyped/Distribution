package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersRequest")
@js.native
class SearchOrdersRequest () extends js.Object {
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for your original query.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to be returned in a single page.
    * It is possible to receive fewer results than the specified limit on a given page. Default: `500`.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The location IDs for the orders to query. All locations must belong to the same merchant.
    * Min: 1 location IDs. Max: 10 location IDs.
    */
  var location_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Query conditions used to filter or sort the results. Note that when fetching additional pages using a cursor,
    * the query must be equal to the query used to fetch the first page of results.
    */
  var query: js.UndefOr[SearchOrdersQuery] = js.native
  /**
    * Boolean that controls the format of the search results.
    *  - If `true`, SearchOrders will return `OrderEntry` objects.
    *  - If `false`, SearchOrders will return complete Order objects.
    *  Default: `false`.
    */
  var return_entries: js.UndefOr[Boolean] = js.native
}

