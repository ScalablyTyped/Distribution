package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveInventoryCountRequest")
@js.native
class RetrieveInventoryCountRequest () extends js.Object {
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of
    * results for the original query. See [Pagination](/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * The [Location](#type-location) IDs to look up as a comma-separated list. An empty list queries all locations.
    */
  var location_ids: js.UndefOr[String] = js.native
}

