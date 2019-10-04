package typings.serializeDashError.serializeDashErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialize-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserializeError(errorObject: js.Any): Error = js.native
  def deserializeError(errorObject: ErrorObject): Error = js.native
  def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
}

