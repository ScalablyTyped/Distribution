package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationPopActionPayload extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  // n: the number of routes to pop of the stack
  var n: js.UndefOr[Double] = js.native
  var prune: js.UndefOr[Boolean] = js.native
}

object NavigationPopActionPayload {
  @scala.inline
  def apply(): NavigationPopActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPopActionPayload]
  }
  @scala.inline
  implicit class NavigationPopActionPayloadOps[Self <: NavigationPopActionPayload] (val x: Self) extends AnyVal {
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
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setPrune(value: Boolean): Self = this.set("prune", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrune: Self = this.set("prune", js.undefined)
  }
  
}

