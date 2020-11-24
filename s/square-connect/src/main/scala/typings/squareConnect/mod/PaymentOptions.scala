package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "PaymentOptions")
@js.native
class PaymentOptions () extends js.Object {
  
  /**
    * Indicates whether the Payment objects created from this `TerminalCheckout` will automatically be `COMPLETED`
    * or left in an `APPROVED` state for later modification.
    */
  var autocomplete: js.UndefOr[Boolean] = js.native
}
