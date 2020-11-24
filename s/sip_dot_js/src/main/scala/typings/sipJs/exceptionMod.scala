package typings.sipJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/exceptions/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  
  @js.native
  abstract class Exception protected () extends Error {
    protected def this(message: String) = this()
  }
}
