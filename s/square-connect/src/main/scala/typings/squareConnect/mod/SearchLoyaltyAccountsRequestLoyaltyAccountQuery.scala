package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyAccountsRequestLoyaltyAccountQuery")
@js.native
class SearchLoyaltyAccountsRequestLoyaltyAccountQuery () extends js.Object {
  
  /**
    * The set of customer IDs to use in the loyalty account search. This cannot be combined with `mappings`. Max: 30 customer IDs.
    */
  var customer_ids: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The set of mappings to use in the loyalty account search. This cannot be combined with `customer_ids`. Max: 30 mappings.
    */
  var mappings: js.UndefOr[js.Array[LoyaltyAccountMapping]] = js.native
}
