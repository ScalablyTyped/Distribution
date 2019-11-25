package typings.primereact.componentsMenuitemMenuItemMod

import typings.primereact.Anon_Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var command: js.UndefOr[js.Function1[/* e */ Anon_Item, Unit]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[js.Array[MenuItem] | MenuItem]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(
    className: String = null,
    command: /* e */ Anon_Item => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    items: js.Array[js.Array[MenuItem] | MenuItem] = null,
    label: String = null,
    separator: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    target: String = null,
    url: String = null
  ): MenuItem = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(js.Any.fromFunction1(command))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
}

