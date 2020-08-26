package typings.reactWidgets.anon

import typings.reactWidgets.reactWidgetsStrings.clear
import typings.reactWidgets.reactWidgetsStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastSearchTerm extends js.Object {
  var action: clear | input = js.native
  var lastSearchTerm: js.UndefOr[String] = js.native
  var originalEvent: js.UndefOr[js.Any] = js.native
}

object LastSearchTerm {
  @scala.inline
  def apply(action: clear | input): LastSearchTerm = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSearchTerm]
  }
  @scala.inline
  implicit class LastSearchTermOps[Self <: LastSearchTerm] (val x: Self) extends AnyVal {
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
    def setAction(value: clear | input): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastSearchTerm(value: String): Self = this.set("lastSearchTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSearchTerm: Self = this.set("lastSearchTerm", js.undefined)
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
  }
  
}

