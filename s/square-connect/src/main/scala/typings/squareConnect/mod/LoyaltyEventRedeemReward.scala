package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventRedeemReward")
@js.native
class LoyaltyEventRedeemReward () extends js.Object {
  
  /**
    * The ID of the `loyalty program`.
    */
  var loyalty_program_id: String = js.native
  
  /**
    * The ID of the `order` that redeemed the reward.
    * This field is returned only if the Orders API is used to process orders.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * The ID of the redeemed `loyalty reward`. This field is returned only if the event source is `LOYALTY_API`.
    */
  var reward_id: js.UndefOr[String] = js.native
}
