package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchSubscriptionsRequest")
@js.native
class SearchSubscriptionsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The upper limit on the number of subscriptions to return in the response. Default: `200`.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Query subscriptions based on the given conditions and sort order.
    * Calling SearchSubscriptions without an explicit query parameter will return all subscriptions.
    */
  var query: js.UndefOr[SearchSubscriptionsQuery] = js.native
}
