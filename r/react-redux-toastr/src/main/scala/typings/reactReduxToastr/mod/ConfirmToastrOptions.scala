package typings.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmToastrOptions extends js.Object {
  var disableCancel: js.UndefOr[Boolean] = js.native
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onOk: js.UndefOr[js.Function0[Unit]] = js.native
}

object ConfirmToastrOptions {
  @scala.inline
  def apply(): ConfirmToastrOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmToastrOptions]
  }
  @scala.inline
  implicit class ConfirmToastrOptionsOps[Self <: ConfirmToastrOptions] (val x: Self) extends AnyVal {
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
    def setDisableCancel(value: Boolean): Self = this.set("disableCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCancel: Self = this.set("disableCancel", js.undefined)
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnOk(value: () => Unit): Self = this.set("onOk", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnOk: Self = this.set("onOk", js.undefined)
  }
  
}

