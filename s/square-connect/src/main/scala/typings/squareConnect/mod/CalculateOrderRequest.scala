package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CalculateOrderRequest")
@js.native
open class CalculateOrderRequest () extends StObject {
  
  /**
    * The order to be calculated. Expects the entire order, not a sparse update.
    */
  var order: Order = js.native
  
  /**
    * Identifies one or more loyalty reward tiers to apply during order calculation.
    * The discounts defined by the reward tiers are added to the order only to preview the effect of applying the specified reward(s).
    * The reward(s) do not correspond to actual redemptions, that is, no `reward`s are created.
    * Therefore, the reward `id`s are random strings used only to reference the reward tier.
    */
  var proposed_rewards: js.UndefOr[js.Array[OrderReward]] = js.native
}
