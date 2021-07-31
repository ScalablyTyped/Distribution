package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchTerminalCheckoutsRequest")
@js.native
class SearchTerminalCheckoutsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Limit the number of results returned for a single request.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Queries terminal checkouts based on given conditions and sort order.
    * Leaving this unset will return all checkouts with the default sort order.
    */
  var query: js.UndefOr[TerminalCheckoutQuery] = js.native
}
