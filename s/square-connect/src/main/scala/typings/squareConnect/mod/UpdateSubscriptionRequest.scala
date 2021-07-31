package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "UpdateSubscriptionRequest")
@js.native
class UpdateSubscriptionRequest () extends StObject {
  
  /**
    * The subscription object containing the current version, and fields to update. Unset fields will be left at their
    * current server values, and JSON `null` values will be treated as a request to clear the relevant data.
    */
  var subscription: js.UndefOr[Subscription] = js.native
}
