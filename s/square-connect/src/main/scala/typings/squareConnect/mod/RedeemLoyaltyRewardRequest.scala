package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RedeemLoyaltyRewardRequest")
@js.native
class RedeemLoyaltyRewardRequest () extends js.Object {
  
  /**
    * A unique string that identifies this `RedeemLoyaltyReward` request. Keys can be any valid string, but must be unique for every request.
    */
  var idempotency_key: String = js.native
  
  /**
    * The ID of the `location` where the reward is redeemed.
    */
  var location_id: String = js.native
}
