package typings.reactHotLoader.anon

import typings.reactHotLoader.mod.HotError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[HotError]
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[HotError]): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

