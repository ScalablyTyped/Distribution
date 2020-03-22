package typings.serializeError.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialize-error", "deserializeError")
@js.native
object deserializeError extends js.Object {
  def apply(errorObject: js.Any): Error = js.native
  def apply(errorObject: ErrorObject): Error = js.native
}

