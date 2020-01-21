package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CompletePaymentResponse")
@js.native
class CompletePaymentResponse () extends js.Object {
  /**
    * Information on errors encountered during the request
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The successfully completed `Payment`.
    */
  var payment: js.UndefOr[Payment] = js.native
}

