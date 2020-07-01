package typings.rcTabs.addButtonMod

import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.TabsLocale
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddButtonProps extends js.Object {
  var editable: js.UndefOr[EditableConfig] = js.undefined
  var locale: js.UndefOr[TabsLocale] = js.undefined
  var prefixCls: String
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AddButtonProps {
  @scala.inline
  def apply(
    prefixCls: String,
    editable: EditableConfig = null,
    locale: TabsLocale = null,
    style: CSSProperties = null
  ): AddButtonProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddButtonProps]
  }
}

