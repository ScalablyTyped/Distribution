package typings.reduxForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorOther[T] extends js.Object {
  var _error: js.UndefOr[T] = js.native
}

object ErrorOther {
  @scala.inline
  def apply[T](): ErrorOther[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorOther[T]]
  }
  @scala.inline
  implicit class ErrorOtherOps[Self <: ErrorOther[_], T] (val x: Self with ErrorOther[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_error(value: T): Self = this.set("_error", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_error: Self = this.set("_error", js.undefined)
  }
  
}

