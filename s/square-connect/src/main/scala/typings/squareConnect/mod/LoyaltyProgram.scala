package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyProgram")
@js.native
class LoyaltyProgram () extends js.Object {
  
  /**
    * Defines how buyers can earn loyalty points.
    */
  var accrual_rules: js.Array[LoyaltyProgramAccrualRule] = js.native
  
  /**
    * The timestamp when the program was created, in RFC 3339 format.
    */
  var created_at: String = js.native
  
  /**
    * If present, details for how points expire.
    */
  var expiration_policy: js.UndefOr[LoyaltyProgramExpirationPolicy] = js.native
  
  /**
    * The Square-assigned ID of the loyalty program. Updates to the loyalty program do not modify the identifier.
    */
  var id: String = js.native
  
  /**
    * The `locations` at which the program is active.
    */
  var location_ids: js.Array[String] = js.native
  
  /**
    * The list of rewards for buyers, sorted by ascending points.
    */
  var reward_tiers: js.Array[LoyaltyProgramRewardTier] = js.native
  
  /**
    * Whether the program is currently active. See [LoyaltyProgramStatus](#type-loyaltyprogramstatus) for possible values
    */
  var status: String = js.native
  
  /**
    * A cosmetic name for the “points” currency.
    */
  var terminology: LoyaltyProgramTerminology = js.native
  
  /**
    * The timestamp when the reward was last updated, in RFC 3339 format.
    */
  var updated_at: String = js.native
}
