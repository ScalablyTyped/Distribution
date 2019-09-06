package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "GetPaymentResponse")
@js.native
class GetPaymentResponse () extends js.Object {
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * The requested `Payment`.
    */
  var payment: js.UndefOr[Payment] = js.native
}

