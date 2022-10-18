package typings.sipJs

import typings.sipJs.libCoreMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiExceptionsStateTransitionMod {
  
  @JSImport("sip.js/lib/api/exceptions/state-transition", "StateTransitionError")
  @js.native
  open class StateTransitionError () extends Exception {
    def this(message: String) = this()
  }
}
