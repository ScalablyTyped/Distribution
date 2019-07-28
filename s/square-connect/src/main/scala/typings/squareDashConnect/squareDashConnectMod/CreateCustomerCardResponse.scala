package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateCustomerCardResponse")
@js.native
class CreateCustomerCardResponse () extends js.Object {
  /**
    * The created card on file.
    */
  var card: js.UndefOr[Card] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

