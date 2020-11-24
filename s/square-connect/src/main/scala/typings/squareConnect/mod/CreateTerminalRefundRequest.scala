package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateTerminalRefundRequest")
@js.native
class CreateTerminalRefundRequest () extends js.Object {
  
  /**
    * A unique string that identifies this `CreateRefund` request.
    * Keys can be any valid string but must be unique for every `CreateRefund` request.
    * See [Idempotency keys](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
    */
  var idempotency_key: String = js.native
  
  /**
    * The refund to create.
    */
  var refund: js.UndefOr[TerminalRefund] = js.native
}
