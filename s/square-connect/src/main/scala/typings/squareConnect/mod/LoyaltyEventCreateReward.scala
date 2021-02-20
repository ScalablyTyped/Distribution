package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventCreateReward")
@js.native
class LoyaltyEventCreateReward () extends StObject {
  
  /**
    * The ID of the `loyalty program`.
    */
  var loyalty_program_id: String = js.native
  
  /**
    * The loyalty points used to create the reward.
    */
  var points: Double = js.native
  
  /**
    * The Square-assigned ID of the created `loyalty reward`. This field is returned only if the event source is `LOYALTY_API`.
    */
  var reward_id: js.UndefOr[String] = js.native
}
