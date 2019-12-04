package typings.sipDotJs

import typings.sipDotJs.libCoreMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/exceptions/request-pending", JSImport.Namespace)
@js.native
object libApiExceptionsRequestDashPendingMod extends js.Object {
  @js.native
  /** @internal */
  class RequestPendingError () extends Exception {
    def this(message: String) = this()
  }
  
}

