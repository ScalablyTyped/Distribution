package typings.reactBootstrap.menuItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactBootstrap.mod.SelectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps
  extends AllHTMLAttributes[MenuItem]
     with ClassAttributes[MenuItem] {
  var active: js.UndefOr[Boolean] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var divider: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  @JSName("onClick")
  var onClick_MenuItemProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  @JSName("onSelect")
  var onSelect_MenuItemProps: js.UndefOr[SelectCallback] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[MenuItem] = null,
    ClassAttributes: ClassAttributes[MenuItem] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    divider: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    header: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onSelect: SelectCallback = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.get.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

