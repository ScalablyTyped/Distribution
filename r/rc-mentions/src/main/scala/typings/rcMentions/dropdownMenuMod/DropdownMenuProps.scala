package typings.rcMentions.dropdownMenuMod

import typings.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownMenuProps extends js.Object {
  var options: js.Array[OptionProps] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object DropdownMenuProps {
  @scala.inline
  def apply(options: js.Array[OptionProps]): DropdownMenuProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuProps]
  }
  @scala.inline
  implicit class DropdownMenuPropsOps[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
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
    def setOptionsVarargs(value: OptionProps*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[OptionProps]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

