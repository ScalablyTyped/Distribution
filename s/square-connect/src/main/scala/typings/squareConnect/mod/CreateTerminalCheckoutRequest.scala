package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateTerminalCheckoutRequest")
@js.native
class CreateTerminalCheckoutRequest () extends StObject {
  
  /**
    * The checkout to create.
    */
  var checkout: TerminalCheckout = js.native
  
  /**
    * A unique string that identifies this `CreateCheckout` request.
    * Keys can be any valid string but must be unique for every `CreateCheckout` request.
    * See [Idempotency keys](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    */
  var idempotency_key: String = js.native
}
