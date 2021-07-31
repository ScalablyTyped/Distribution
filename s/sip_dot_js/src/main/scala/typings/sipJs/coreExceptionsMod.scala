package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreExceptionsMod {
  
  @JSImport("sip.js/lib/core/exceptions", "Exception")
  @js.native
  abstract class Exception protected ()
    extends typings.sipJs.exceptionMod.Exception {
    protected def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/core/exceptions", "TransactionStateError")
  @js.native
  class TransactionStateError ()
    extends typings.sipJs.transactionStateErrorMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/core/exceptions", "TransportError")
  @js.native
  class TransportError ()
    extends typings.sipJs.transportErrorMod.TransportError {
    def this(message: String) = this()
  }
}
