package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListDisputesRequest")
@js.native
class ListDisputesRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * For more information, see [Paginating](https://developer.squareup.com/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The ID of the location for which to return a list of disputes. If not specified, the endpoint returns all open
    * disputes (dispute status is not `INQUIRY_CLOSED`, `WON`, or  `LOST`) associated with all locations.
    */
  var location_id: js.UndefOr[String] = js.native
  
  /**
    * The dispute states to filter the result. If not specified, the endpoint returns all open disputes (dispute status
    * is not `INQUIRY_CLOSED`, `WON`, or `LOST`). See [DisputeState](#type-disputestate) for possible values.
    */
  var states: js.UndefOr[js.Array[String]] = js.native
}
