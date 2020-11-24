package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListSubscriptionEventsResponse")
@js.native
class ListSubscriptionEventsResponse () extends js.Object {
  
  /**
    * When a response is truncated, it includes a cursor that you can use in a subsequent request to fetch the next set of events.
    * If empty, this is the final response.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The `SubscriptionEvents` retrieved.
    */
  var subscription_events: js.UndefOr[js.Array[SubscriptionEvent]] = js.native
}
