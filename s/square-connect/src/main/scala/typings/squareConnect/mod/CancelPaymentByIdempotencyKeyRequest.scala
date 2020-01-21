package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CancelPaymentByIdempotencyKeyRequest")
@js.native
class CancelPaymentByIdempotencyKeyRequest () extends js.Object {
  /**
    * `idempotency_key` identifying the payment to be canceled.
    */
  var idempotency_key: String = js.native
}

