package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyAccountsRequest")
@js.native
open class SearchLoyaltyAccountsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to include in the response.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The search criteria for the request.
    */
  var query: js.UndefOr[SearchLoyaltyAccountsRequestLoyaltyAccountQuery] = js.native
}
