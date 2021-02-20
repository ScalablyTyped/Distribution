package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateCheckoutResponse")
@js.native
class CreateCheckoutResponse () extends StObject {
  
  /**
    * The newly created checkout.
    * If the same request was made with the same idempotency_key, this will be the checkout created with the idempotency_key.
    */
  var checkout: js.UndefOr[Checkout] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
