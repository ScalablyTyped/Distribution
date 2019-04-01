package typings
package primereactLib.componentsContextmenuContextMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoZIndex: js.UndefOr[scala.Boolean] = js.undefined
  var bazeZIndex: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ContextMenuProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    bazeZIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    model: js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem] = null,
    onHide: /* e */ stdLib.Event => scala.Unit = null,
    onShow: /* e */ stdLib.Event => scala.Unit = null,
    style: js.Object = null
  ): ContextMenuProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex)
    if (bazeZIndex != null) __obj.updateDynamic("bazeZIndex")(bazeZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ContextMenuProps]
  }
}

