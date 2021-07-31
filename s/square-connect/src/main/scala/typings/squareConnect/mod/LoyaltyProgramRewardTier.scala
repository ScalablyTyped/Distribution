package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyProgramRewardTier")
@js.native
class LoyaltyProgramRewardTier () extends StObject {
  
  /**
    * The timestamp when the reward tier was created, in RFC 3339 format.
    */
  var created_at: String = js.native
  
  /**
    * Provides details about the reward tier definition.
    */
  var definition: LoyaltyProgramRewardDefinition = js.native
  
  /**
    * The Square-assigned ID of the reward tier.
    */
  var id: String = js.native
  
  /**
    * The name of the reward tier.
    */
  var name: String = js.native
  
  /**
    * The points exchanged for the reward tier.
    */
  var points: Double = js.native
}
