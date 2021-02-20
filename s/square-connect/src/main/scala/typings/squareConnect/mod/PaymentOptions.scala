package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "PaymentOptions")
@js.native
class PaymentOptions () extends StObject {
  
  /**
    * Indicates whether the Payment objects created from this `TerminalCheckout` will automatically be `COMPLETED`
    * or left in an `APPROVED` state for later modification.
    */
  var autocomplete: js.UndefOr[Boolean] = js.native
}
