package typings.serializeError

import typings.std.Error
import typings.typeFest.mod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialize-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def deserializeError(errorObject: js.Any): Error = js.native
  def deserializeError(errorObject: ErrorObject): Error = js.native
  def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
  type ErrorObject = AnonCode with JsonObject
}

