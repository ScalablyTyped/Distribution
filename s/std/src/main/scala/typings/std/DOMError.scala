package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error object that contains an error name. */
trait DOMError extends js.Object {
  val name: java.lang.String
}

object DOMError {
  @scala.inline
  def apply(name: java.lang.String): DOMError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMError]
  }
}

