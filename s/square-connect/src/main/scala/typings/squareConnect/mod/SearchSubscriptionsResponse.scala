package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchSubscriptionsResponse")
@js.native
class SearchSubscriptionsResponse () extends StObject {
  
  /**
    * When a response is truncated, it includes a cursor that you can  use in a subsequent request to fetch the next
    * set of subscriptions. If empty, this is the final response.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The search result.
    */
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
}
