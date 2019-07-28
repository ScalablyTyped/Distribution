package typings.primereact.componentsMenuMenuMod

import typings.primereact.componentsMenuitemMenuItemMod.MenuItem
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  var bazeZIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var popup: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    bazeZIndex: Int | Double = null,
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    onHide: /* e */ Event => Unit = null,
    onShow: /* e */ Event => Unit = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex)
    if (bazeZIndex != null) __obj.updateDynamic("bazeZIndex")(bazeZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MenuProps]
  }
}

