package typings.sipJs

import typings.sipJs.exceptionMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/exceptions/transaction-state-error", JSImport.Namespace)
@js.native
object transactionStateErrorMod extends js.Object {
  
  @js.native
  class TransactionStateError () extends Exception {
    def this(message: String) = this()
  }
}
