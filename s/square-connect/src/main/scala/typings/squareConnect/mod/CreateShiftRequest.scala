package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateShiftRequest")
@js.native
class CreateShiftRequest () extends js.Object {
  /**
    * Unique string value to insure the idempotency of the operation.
    */
  var idempotency_key: js.UndefOr[String] = js.native
  /**
    * The `Shift` to be created
    */
  var shift: Shift = js.native
}

