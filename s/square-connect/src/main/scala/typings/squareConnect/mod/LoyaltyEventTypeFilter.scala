package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "LoyaltyEventTypeFilter")
@js.native
open class LoyaltyEventTypeFilter () extends StObject {
  
  /**
    * The loyalty event types used to filter the result. If multiple values are specified, the endpoint uses a logical OR to combine them.
    * See [LoyaltyEventType](#type-loyaltyeventtype) for possible values.
    */
  var types: js.Array[String] = js.native
}
