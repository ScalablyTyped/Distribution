package typings.react

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.ValidationMap
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnTypeAnyInferPropsP extends js.Object {
  def apply[P /* <: ValidationMap[_] */](`type`: P): Requireable[Required[InferProps[P]]] = js.native
}

