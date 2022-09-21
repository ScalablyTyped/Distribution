package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyRewardsRequest")
@js.native
open class SearchLoyaltyRewardsRequest () extends StObject {
  
  /**
    * A pagination cursor returned by a previous call to this endpoint.
    * Provide this to retrieve the next set of results for the original query.
    * For more information, see [Pagination](https://developer.squareup.com/docs/docs/basics/api101/pagination).
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of results to return in the response.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The search criteria for the request. If empty, the endpoint retrieves all loyalty rewards in the loyalty program.
    */
  var query: js.UndefOr[SearchLoyaltyRewardsRequestLoyaltyRewardQuery] = js.native
}
