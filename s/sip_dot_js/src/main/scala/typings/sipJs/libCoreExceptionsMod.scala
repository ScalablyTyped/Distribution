package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreExceptionsMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/exceptions", "Exception")
  @js.native
  /* protected */ open class Exception ()
    extends typings.sipJs.libCoreExceptionsExceptionMod.Exception {
    /* protected */ def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/core/exceptions", "TransactionStateError")
  @js.native
  open class TransactionStateError ()
    extends typings.sipJs.libCoreExceptionsTransactionStateErrorMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/core/exceptions", "TransportError")
  @js.native
  open class TransportError ()
    extends typings.sipJs.libCoreExceptionsTransportErrorMod.TransportError {
    def this(message: String) = this()
  }
}
