package typings.sipJs

import typings.sipJs.coreMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateTransitionMod {
  
  @JSImport("sip.js/lib/api/exceptions/state-transition", "StateTransitionError")
  @js.native
  class StateTransitionError () extends Exception {
    def this(message: String) = this()
  }
}
