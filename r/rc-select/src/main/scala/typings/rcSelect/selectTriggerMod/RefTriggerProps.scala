package typings.rcSelect.selectTriggerMod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefTriggerProps extends js.Object {
  def getPopupElement(): HTMLDivElement = js.native
}

object RefTriggerProps {
  @scala.inline
  def apply(getPopupElement: () => HTMLDivElement): RefTriggerProps = {
    val __obj = js.Dynamic.literal(getPopupElement = js.Any.fromFunction0(getPopupElement))
    __obj.asInstanceOf[RefTriggerProps]
  }
  @scala.inline
  implicit class RefTriggerPropsOps[Self <: RefTriggerProps] (val x: Self) extends AnyVal {
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
    def setGetPopupElement(value: () => HTMLDivElement): Self = this.set("getPopupElement", js.Any.fromFunction0(value))
  }
  
}

