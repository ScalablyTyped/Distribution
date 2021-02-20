package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateSubscriptionResponse")
@js.native
class CreateSubscriptionResponse () extends StObject {
  
  /**
    * Information about errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * The newly created subscription.
    * For more information, see [Subscription object](https://developer.squareup.com/docs/docs/subscriptions-api/overview#subscription-object).
    */
  var subscription: js.UndefOr[Subscription] = js.native
}
