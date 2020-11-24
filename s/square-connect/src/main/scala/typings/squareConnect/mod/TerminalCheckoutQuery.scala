package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "TerminalCheckoutQuery")
@js.native
class TerminalCheckoutQuery () extends js.Object {
  
  /**
    * Options for filtering returned `TerminalCheckout`s
    */
  var filter: js.UndefOr[TerminalCheckoutQueryFilter] = js.native
  
  /**
    * Option for sorting returned `TerminalCheckout`s
    */
  var sort: js.UndefOr[TerminalCheckoutQuerySort] = js.native
}
