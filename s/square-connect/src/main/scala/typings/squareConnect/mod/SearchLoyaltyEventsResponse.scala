package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyEventsResponse")
@js.native
class SearchLoyaltyEventsResponse () extends js.Object {
  
  /**
    * The pagination cursor to be used in a subsequent request. If empty, this is the final response.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The loyalty events that satisfy the search criteria.
    */
  var events: js.UndefOr[js.Array[LoyaltyEvent]] = js.native
}
