package typings.sipJs

import typings.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/exceptions/session-description-handler", JSImport.Namespace)
@js.native
object sessionDescriptionHandlerMod extends js.Object {
  
  @js.native
  class SessionDescriptionHandlerError () extends Exception {
    def this(message: String) = this()
  }
}
