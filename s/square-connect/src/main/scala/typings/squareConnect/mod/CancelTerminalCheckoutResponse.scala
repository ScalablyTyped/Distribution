package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CancelTerminalCheckoutResponse")
@js.native
class CancelTerminalCheckoutResponse () extends StObject {
  
  /**
    * The canceled `TerminalCheckout`
    */
  var checkout: js.UndefOr[TerminalCheckout] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
