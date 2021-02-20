package typings.sipJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  @JSImport("sip.js/lib/core/exceptions/exception", "Exception")
  @js.native
  abstract class Exception protected () extends Error {
    protected def this(message: String) = this()
  }
}
