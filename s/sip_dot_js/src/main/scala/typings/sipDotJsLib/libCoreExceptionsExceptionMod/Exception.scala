package typings
package sipDotJsLib.libCoreExceptionsExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/exceptions/exception", "Exception")
@js.native
abstract class Exception protected ()
  extends stdLib.Error {
  protected def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

