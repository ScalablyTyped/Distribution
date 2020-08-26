package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationJumpToActionPayload extends js.Object {
  var key: js.UndefOr[String] = js.native
  var preserveFocus: js.UndefOr[Boolean] = js.native
  var routeName: String = js.native
}

object NavigationJumpToActionPayload {
  @scala.inline
  def apply(routeName: String): NavigationJumpToActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationJumpToActionPayload]
  }
  @scala.inline
  implicit class NavigationJumpToActionPayloadOps[Self <: NavigationJumpToActionPayload] (val x: Self) extends AnyVal {
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
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = this.set("preserveFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveFocus: Self = this.set("preserveFocus", js.undefined)
  }
  
}

