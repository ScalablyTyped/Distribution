package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RedeemLoyaltyRewardResponse")
@js.native
open class RedeemLoyaltyRewardResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The `LoyaltyEvent` for redeeming the reward.
    */
  var event: js.UndefOr[LoyaltyEvent] = js.native
}
