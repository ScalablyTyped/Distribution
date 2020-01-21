package typings.reduxForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorOther[T] extends js.Object {
  var _error: js.UndefOr[T] = js.undefined
}

object ErrorOther {
  @scala.inline
  def apply[T](_error: T = null): ErrorOther[T] = {
    val __obj = js.Dynamic.literal()
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorOther[T]]
  }
}

