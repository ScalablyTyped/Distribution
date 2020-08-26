package typings.reduxForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WarningOther[T] extends js.Object {
  var _warning: js.UndefOr[T] = js.native
}

object WarningOther {
  @scala.inline
  def apply[T](): WarningOther[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarningOther[T]]
  }
  @scala.inline
  implicit class WarningOtherOps[Self <: WarningOther[_], T] (val x: Self with WarningOther[T]) extends AnyVal {
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
    def set_warning(value: T): Self = this.set("_warning", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_warning: Self = this.set("_warning", js.undefined)
  }
  
}

