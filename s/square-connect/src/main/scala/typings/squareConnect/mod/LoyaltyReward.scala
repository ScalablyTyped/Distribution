package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyReward")
@js.native
class LoyaltyReward () extends js.Object {
  
  /**
    * The timestamp when the reward was created, in RFC 3339 format.
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the loyalty reward.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the `loyalty account` to which the reward belongs.
    */
  var loyalty_account_id: String = js.native
  
  /**
    * The Square-assigned ID of the `order` to which the reward is attached.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * The number of loyalty points used for the reward.
    */
  var points: js.UndefOr[Double] = js.native
  
  /**
    * The timestamp when the reward was redeemed, in RFC 3339 format.
    */
  var redeemed_at: js.UndefOr[String] = js.native
  
  /**
    * The Square-assigned ID of the `reward tier` used to create the reward.
    */
  var reward_tier_id: String = js.native
  
  /**
    * The status of a loyalty reward. See [LoyaltyRewardStatus](#type-loyaltyrewardstatus) for possible values.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the reward was last updated, in RFC 3339 format.
    */
  var updated_at: js.UndefOr[String] = js.native
}
