package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CancelSubscriptionResponse")
@js.native
class CancelSubscriptionResponse () extends StObject {
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The canceled subscription.
    */
  var subscription: js.UndefOr[Subscription] = js.native
}
