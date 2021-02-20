package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "SearchLoyaltyRewardsRequestLoyaltyRewardQuery")
@js.native
class SearchLoyaltyRewardsRequestLoyaltyRewardQuery () extends StObject {
  
  /**
    * The ID of the `loyalty account` to which the loyalty reward belongs.
    */
  var loyalty_account_id: String = js.native
  
  /**
    * The status of the loyalty reward. See [LoyaltyRewardStatus](#type-loyaltyrewardstatus) for possible values.
    */
  var status: js.UndefOr[String] = js.native
}
