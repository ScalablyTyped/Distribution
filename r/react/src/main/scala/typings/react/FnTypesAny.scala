package typings.react

import typings.propTypes.mod.InferType
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnTypesAny extends js.Object {
  def apply[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
}

