package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CancelPaymentByIdempotencyKeyRequest")
@js.native
class CancelPaymentByIdempotencyKeyRequest () extends js.Object {
  
  /**
    * The `idempotency_key` identifying the payment to be canceled.
    */
  var idempotency_key: String = js.native
}
