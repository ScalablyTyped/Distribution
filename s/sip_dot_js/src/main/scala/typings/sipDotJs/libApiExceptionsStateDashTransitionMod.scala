package typings.sipDotJs

import typings.sipDotJs.libCoreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/state-transition", JSImport.Namespace)
@js.native
object libApiExceptionsStateDashTransitionMod extends js.Object {
  @js.native
  class StateTransitionError () extends Exception {
    def this(message: String) = this()
  }
  
}

