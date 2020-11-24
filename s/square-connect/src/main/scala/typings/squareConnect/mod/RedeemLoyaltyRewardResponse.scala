package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RedeemLoyaltyRewardResponse")
@js.native
class RedeemLoyaltyRewardResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The `LoyaltyEvent` for redeeming the reward.
    */
  var event: js.UndefOr[LoyaltyEvent] = js.native
}
