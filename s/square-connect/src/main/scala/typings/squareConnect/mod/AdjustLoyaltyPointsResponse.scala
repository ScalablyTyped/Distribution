package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "AdjustLoyaltyPointsResponse")
@js.native
open class AdjustLoyaltyPointsResponse () extends StObject {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
  
  /**
    * The resulting event data for adjusting points.
    */
  var event: js.UndefOr[LoyaltyEvent] = js.native
}
