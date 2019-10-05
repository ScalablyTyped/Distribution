package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/exceptions", JSImport.Namespace)
@js.native
object libCoreExceptionsMod extends js.Object {
  @js.native
  abstract class Exception protected ()
    extends typings.sipDotJs.libCoreExceptionsExceptionMod.Exception {
    protected def this(message: String) = this()
  }
  
  @js.native
  class TransactionStateError ()
    extends typings.sipDotJs.libCoreExceptionsTransactionDashStateDashErrorMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @js.native
  class TransportError ()
    extends typings.sipDotJs.libCoreExceptionsTransportDashErrorMod.TransportError {
    def this(message: String) = this()
  }
  
}

