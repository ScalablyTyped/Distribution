package typings.sipJs

import typings.sipJs.coreMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDescriptionHandlerMod {
  
  @JSImport("sip.js/lib/api/exceptions/session-description-handler", "SessionDescriptionHandlerError")
  @js.native
  class SessionDescriptionHandlerError () extends Exception {
    def this(message: String) = this()
  }
}
