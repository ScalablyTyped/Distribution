package typings.serializeError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialize-error", "serializeError")
@js.native
object serializeError extends js.Object {
  def apply[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
}

