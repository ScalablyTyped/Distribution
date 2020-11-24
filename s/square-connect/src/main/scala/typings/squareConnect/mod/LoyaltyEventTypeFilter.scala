package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventTypeFilter")
@js.native
class LoyaltyEventTypeFilter () extends js.Object {
  
  /**
    * The loyalty event types used to filter the result. If multiple values are specified, the endpoint uses a logical OR to combine them.
    * See [LoyaltyEventType](#type-loyaltyeventtype) for possible values.
    */
  var types: js.Array[String] = js.native
}
