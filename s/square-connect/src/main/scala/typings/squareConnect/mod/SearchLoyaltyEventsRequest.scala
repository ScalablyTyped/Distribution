package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyEventsRequest")
@js.native
class SearchLoyaltyEventsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for your original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to include in the response. The last page might contain fewer events. The default is 30 events.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * A set of one or more predefined query filters to apply when  searching for loyalty events.
    * The endpoint performs a logical AND to evaluate multiple filters and performs a logical OR on arrays that specifies multiple field values.
    */
  var query: js.UndefOr[LoyaltyEventQuery] = js.native
}
