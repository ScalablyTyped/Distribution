package typings.sipDotJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/exceptions/exception", JSImport.Namespace)
@js.native
object libCoreExceptionsExceptionMod extends js.Object {
  @js.native
  abstract class Exception protected () extends Error {
    protected def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

