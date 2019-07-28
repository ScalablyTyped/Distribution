package typings.react

import typings.propDashTypes.propDashTypesMod.InferType
import typings.propDashTypes.propDashTypesMod.Requireable
import typings.propDashTypes.propDashTypesMod.Validator
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_TypesAny extends js.Object {
  def apply[T /* <: Validator[_] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
}

