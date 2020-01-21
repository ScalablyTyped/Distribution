package typings.propTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prop-types", "arrayOf")
@js.native
object arrayOf extends js.Object {
  def apply[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
}

