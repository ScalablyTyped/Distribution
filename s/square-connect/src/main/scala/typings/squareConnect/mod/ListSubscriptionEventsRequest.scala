package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListSubscriptionEventsRequest")
@js.native
class ListSubscriptionEventsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The upper limit on the number of subscription events to return in the response. Default: `200`
    */
  var limit: js.UndefOr[Double] = js.native
}
