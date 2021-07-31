package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventAdjustPoints")
@js.native
class LoyaltyEventAdjustPoints () extends StObject {
  
  /**
    * The Square-assigned ID of the `loyalty program`.
    */
  var loyalty_program_id: js.UndefOr[String] = js.native
  
  /**
    * The number of points added or removed.
    */
  var points: Double = js.native
  
  /**
    * The reason for the adjustment of points.
    */
  var reason: js.UndefOr[String] = js.native
}
