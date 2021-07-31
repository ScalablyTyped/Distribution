package typings.sipJs

import typings.sipJs.exceptionMod.Exception
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportErrorMod {
  
  @JSImport("sip.js/lib/core/exceptions/transport-error", "TransportError")
  @js.native
  class TransportError () extends Exception {
    def this(message: String) = this()
  }
}
