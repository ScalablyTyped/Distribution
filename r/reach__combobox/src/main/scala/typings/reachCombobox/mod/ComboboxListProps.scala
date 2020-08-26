package typings.reachCombobox.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComboboxListProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var persistSelection: js.UndefOr[Boolean] = js.native
}

object ComboboxListProps {
  @scala.inline
  def apply(): ComboboxListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboboxListProps]
  }
  @scala.inline
  implicit class ComboboxListPropsOps[Self <: ComboboxListProps] (val x: Self) extends AnyVal {
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
    def setPersistSelection(value: Boolean): Self = this.set("persistSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistSelection: Self = this.set("persistSelection", js.undefined)
  }
  
}

