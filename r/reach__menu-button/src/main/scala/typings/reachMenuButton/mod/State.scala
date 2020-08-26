package typings.reachMenuButton.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var buttonId: String = js.native
  var buttonRect: js.UndefOr[ButtonRect] = js.native
  var closingWithClick: Boolean = js.native
  var isOpen: Boolean = js.native
  var selectionIndex: Double = js.native
}

object State {
  @scala.inline
  def apply(buttonId: String, closingWithClick: Boolean, isOpen: Boolean, selectionIndex: Double): State = {
    val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], closingWithClick = closingWithClick.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setButtonId(value: String): Self = this.set("buttonId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosingWithClick(value: Boolean): Self = this.set("closingWithClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionIndex(value: Double): Self = this.set("selectionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonRect(value: ButtonRect): Self = this.set("buttonRect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonRect: Self = this.set("buttonRect", js.undefined)
  }
  
}

