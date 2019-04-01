package typings
package primereactLib.componentsMenuitemMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var command: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_Item, scala.Unit]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[MenuItem] | js.Array[js.Array[MenuItem]]] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var separator: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object MenuItem {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    command: /* e */ primereactLib.Anon_Item => scala.Unit = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    items: js.Array[MenuItem] | js.Array[js.Array[MenuItem]] = null,
    label: java.lang.String = null,
    separator: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    target: java.lang.String = null,
    url: java.lang.String = null
  ): MenuItem = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (command != null) __obj.updateDynamic("command")(js.Any.fromFunction1(command))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(separator)) __obj.updateDynamic("separator")(separator)
    if (style != null) __obj.updateDynamic("style")(style)
    if (target != null) __obj.updateDynamic("target")(target)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MenuItem]
  }
}

