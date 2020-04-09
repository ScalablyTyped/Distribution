package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveInventoryChangesRequest")
@js.native
class RetrieveInventoryChangesRequest () extends js.Object {
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * See the [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination) guide for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * The `Location` IDs to look up as a comma-separated list. An empty list queries all locations.
    */
  var location_ids: js.UndefOr[String] = js.native
}

