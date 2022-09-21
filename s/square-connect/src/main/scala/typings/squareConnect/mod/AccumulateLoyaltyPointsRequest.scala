package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "AccumulateLoyaltyPointsRequest")
@js.native
open class AccumulateLoyaltyPointsRequest () extends StObject {
  
  /**
    * The points to add to the account. If you are using the Orders API to manage orders, you specify the order ID.
    * Otherwise, specify the  points to add.
    */
  var accumulate_points: LoyaltyEventAccumulatePoints = js.native
  
  /**
    * A unique string that identifies the `AccumulateLoyaltyPoints` request.
    * Keys can be any valid string but must be unique for every request.
    */
  var idempotency_key: String = js.native
  
  /**
    * The `location` where the purchase was made.
    */
  var location_id: String = js.native
}
