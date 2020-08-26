package typings.reactNativeShare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenReturn extends js.Object {
  var app: js.UndefOr[String] = js.native
  var dismissedAction: js.UndefOr[Boolean] = js.native
}

object OpenReturn {
  @scala.inline
  def apply(): OpenReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenReturn]
  }
  @scala.inline
  implicit class OpenReturnOps[Self <: OpenReturn] (val x: Self) extends AnyVal {
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
    @scala.inline
    def setDismissedAction(value: Boolean): Self = this.set("dismissedAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissedAction: Self = this.set("dismissedAction", js.undefined)
  }
  
}

