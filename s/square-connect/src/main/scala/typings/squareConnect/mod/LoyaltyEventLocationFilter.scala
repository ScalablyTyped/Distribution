package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventLocationFilter")
@js.native
class LoyaltyEventLocationFilter () extends js.Object {
  
  /**
    * The `location` IDs for loyalty events to query.
    * If multiple values are specified, the endpoint uses a logical OR to combine them.
    */
  var location_ids: js.Array[String] = js.native
}
