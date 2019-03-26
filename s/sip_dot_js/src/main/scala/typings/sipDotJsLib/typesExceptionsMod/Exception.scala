package typings
package sipDotJsLib.typesExceptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/exceptions", "Exception")
@js.native
class Exception ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

