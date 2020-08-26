package typings.reactReduxToastr.mod

import typings.reactReduxToastr.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastrState extends js.Object {
  var confirm: js.UndefOr[Id] = js.native
  var toastrs: js.Array[Toastr_] = js.native
}

object ToastrState {
  @scala.inline
  def apply(toastrs: js.Array[Toastr_]): ToastrState = {
    val __obj = js.Dynamic.literal(toastrs = toastrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastrState]
  }
  @scala.inline
  implicit class ToastrStateOps[Self <: ToastrState] (val x: Self) extends AnyVal {
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
    def setToastrsVarargs(value: Toastr_ *): Self = this.set("toastrs", js.Array(value :_*))
    @scala.inline
    def setToastrs(value: js.Array[Toastr_]): Self = this.set("toastrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirm(value: Id): Self = this.set("confirm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
  }
  
}

