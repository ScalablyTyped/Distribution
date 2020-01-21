package typings.react

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnType extends js.Object {
  def apply[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
}

