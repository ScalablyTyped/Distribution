package typings.semanticUiReact.selectSelectMod

import typings.semanticUiReact.dropdownDropdownMod.StrictDropdownProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictSelectProps extends StrictDropdownProps {
  /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
  @JSName("options")
  var options_StrictSelectProps: js.Array[DropdownItemProps] = js.native
}

object StrictSelectProps {
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): StrictSelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictSelectProps]
  }
  @scala.inline
  implicit class StrictSelectPropsOps[Self <: StrictSelectProps] (val x: Self) extends AnyVal {
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
    def setOptionsVarargs(value: DropdownItemProps*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[DropdownItemProps]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

