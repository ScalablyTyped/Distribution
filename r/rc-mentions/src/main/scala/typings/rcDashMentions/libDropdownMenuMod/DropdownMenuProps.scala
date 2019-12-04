package typings.rcDashMentions.libDropdownMenuMod

import typings.rcDashMentions.libOptionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenuProps extends js.Object {
  var options: js.Array[OptionProps]
  var prefixCls: js.UndefOr[String] = js.undefined
}

object DropdownMenuProps {
  @scala.inline
  def apply(options: js.Array[OptionProps], prefixCls: String = null): DropdownMenuProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownMenuProps]
  }
}

