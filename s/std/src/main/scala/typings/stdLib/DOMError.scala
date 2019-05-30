package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error object that contains an error name. */
trait DOMError extends js.Object {
  val name: java.lang.String
}

@JSGlobal("DOMError")
@js.native
class DOMErrorCls () extends DOMError {
  /* CompleteClass */
  override val name: java.lang.String = js.native
}

@JSGlobal("DOMError")
@js.native
object DOMError
  extends org.scalablytyped.runtime.Instantiable0[DOMError]

