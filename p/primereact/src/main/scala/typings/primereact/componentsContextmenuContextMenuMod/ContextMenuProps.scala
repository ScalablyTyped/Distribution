package typings.primereact.componentsContextmenuContextMenuMod

import typings.primereact.componentsMenuitemMenuItemMod.MenuItem
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  var bazeZIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ContextMenuProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    bazeZIndex: Int | Double = null,
    className: String = null,
    global: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    model: js.Array[MenuItem] = null,
    onHide: /* e */ Event => Unit = null,
    onShow: /* e */ Event => Unit = null,
    style: js.Object = null
  ): ContextMenuProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (bazeZIndex != null) __obj.updateDynamic("bazeZIndex")(bazeZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuProps]
  }
}

