package typings.rcMenu.domwrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMWrapState extends js.Object {
  var lastVisibleIndex: Double = js.native
}

object DOMWrapState {
  @scala.inline
  def apply(lastVisibleIndex: Double): DOMWrapState = {
    val __obj = js.Dynamic.literal(lastVisibleIndex = lastVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMWrapState]
  }
  @scala.inline
  implicit class DOMWrapStateOps[Self <: DOMWrapState] (val x: Self) extends AnyVal {
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
    def setLastVisibleIndex(value: Double): Self = this.set("lastVisibleIndex", value.asInstanceOf[js.Any])
  }
  
}

