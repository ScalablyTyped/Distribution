package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/exceptions", JSImport.Namespace)
@js.native
object coreExceptionsMod extends js.Object {
  
  @js.native
  abstract class Exception protected ()
    extends typings.sipJs.exceptionMod.Exception {
    protected def this(message: String) = this()
  }
  
  @js.native
  class TransactionStateError ()
    extends typings.sipJs.transactionStateErrorMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @js.native
  class TransportError ()
    extends typings.sipJs.transportErrorMod.TransportError {
    def this(message: String) = this()
  }
}
