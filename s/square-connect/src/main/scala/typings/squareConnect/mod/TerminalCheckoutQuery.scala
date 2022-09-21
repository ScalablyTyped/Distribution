package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TerminalCheckoutQuery")
@js.native
open class TerminalCheckoutQuery () extends StObject {
  
  /**
    * Options for filtering returned `TerminalCheckout`s
    */
  var filter: js.UndefOr[TerminalCheckoutQueryFilter] = js.native
  
  /**
    * Option for sorting returned `TerminalCheckout`s
    */
  var sort: js.UndefOr[TerminalCheckoutQuerySort] = js.native
}
