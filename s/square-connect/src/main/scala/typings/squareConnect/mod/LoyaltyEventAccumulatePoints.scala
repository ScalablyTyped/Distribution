package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventAccumulatePoints")
@js.native
class LoyaltyEventAccumulatePoints () extends StObject {
  
  /**
    * The ID of the `loyalty program`.
    */
  var loyalty_program_id: js.UndefOr[String] = js.native
  
  /**
    * The ID of the `order` for which the buyer accumulated the points.
    * This field is returned only if the Orders API is used to process orders.
    */
  var order_id: js.UndefOr[String] = js.native
  
  /**
    * The number of points accumulated by the event.
    */
  var points: js.UndefOr[Double] = js.native
}
