package typings.sipJs

import typings.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/exceptions/state-transition", JSImport.Namespace)
@js.native
object stateTransitionMod extends js.Object {
  
  @js.native
  class StateTransitionError () extends Exception {
    def this(message: String) = this()
  }
}
