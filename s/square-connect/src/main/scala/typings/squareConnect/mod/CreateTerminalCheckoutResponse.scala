package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateTerminalCheckoutResponse")
@js.native
open class CreateTerminalCheckoutResponse () extends StObject {
  
  /**
    * The created `TerminalCheckout`
    */
  var checkout: js.UndefOr[TerminalCheckout] = js.native
  
  /**
    * Information on errors encountered during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
