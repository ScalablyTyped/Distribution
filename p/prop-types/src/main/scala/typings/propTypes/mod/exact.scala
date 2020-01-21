package typings.propTypes.mod

import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prop-types", "exact")
@js.native
object exact extends js.Object {
  def apply[P /* <: ValidationMap[_] */](`type`: P): Requireable[Required[InferProps[P]]] = js.native
}

