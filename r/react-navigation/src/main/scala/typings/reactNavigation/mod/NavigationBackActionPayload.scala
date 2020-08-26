package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBackActionPayload extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String | Null] = js.native
}

object NavigationBackActionPayload {
  @scala.inline
  def apply(): NavigationBackActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBackActionPayload]
  }
  @scala.inline
  implicit class NavigationBackActionPayloadOps[Self <: NavigationBackActionPayload] (val x: Self) extends AnyVal {
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
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
  
}

