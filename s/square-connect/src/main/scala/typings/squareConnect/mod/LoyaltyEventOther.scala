package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventOther")
@js.native
class LoyaltyEventOther () extends js.Object {
  
  /**
    * The Square-assigned ID of the `loyalty program`.
    */
  var loyalty_program_id: String = js.native
  
  /**
    * The number of points added or removed.
    */
  var points: Double = js.native
}
