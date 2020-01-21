package typings.sipJs

import typings.sipJs.exceptionMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/exceptions/transport-error", JSImport.Namespace)
@js.native
object transportErrorMod extends js.Object {
  @js.native
  class TransportError () extends Exception {
    def this(message: String) = this()
  }
  
}

