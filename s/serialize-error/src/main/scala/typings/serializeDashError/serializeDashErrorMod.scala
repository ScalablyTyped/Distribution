package typings.serializeDashError

import typings.std.Error
import typings.typeDashFest.typeDashFestMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serialize-error", JSImport.Namespace)
@js.native
object serializeDashErrorMod extends js.Object {
  def deserializeError(errorObject: js.Any): Error = js.native
  def deserializeError(errorObject: ErrorObject): Error = js.native
  def serializeError[ErrorType](error: ErrorType): ErrorObject | ErrorType = js.native
  type ErrorObject = Anon_Code with JsonObject
}

