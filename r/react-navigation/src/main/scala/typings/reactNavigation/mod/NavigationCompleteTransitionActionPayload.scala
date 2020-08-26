package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationCompleteTransitionActionPayload extends js.Object {
  var key: js.UndefOr[String] = js.native
  var toChildKey: js.UndefOr[String] = js.native
}

object NavigationCompleteTransitionActionPayload {
  @scala.inline
  def apply(): NavigationCompleteTransitionActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationCompleteTransitionActionPayload]
  }
  @scala.inline
  implicit class NavigationCompleteTransitionActionPayloadOps[Self <: NavigationCompleteTransitionActionPayload] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setToChildKey(value: String): Self = this.set("toChildKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToChildKey: Self = this.set("toChildKey", js.undefined)
  }
  
}

