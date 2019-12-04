package typings.sipDotJs

import typings.sipDotJs.libCoreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/session-description-handler", JSImport.Namespace)
@js.native
object libApiExceptionsSessionDashDescriptionDashHandlerMod extends js.Object {
  @js.native
  class SessionDescriptionHandlerError () extends Exception {
    def this(message: String) = this()
  }
  
}

