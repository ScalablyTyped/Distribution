package typings.sipJs

import typings.sipJs.coreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/exceptions/request-pending", JSImport.Namespace)
@js.native
object requestPendingMod extends js.Object {
  
  @js.native
  /** @internal */
  class RequestPendingError () extends Exception {
    def this(message: String) = this()
  }
}
