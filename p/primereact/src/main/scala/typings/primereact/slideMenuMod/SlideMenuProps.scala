package typings.primereact.slideMenuMod

import typings.primereact.menuItemMod.MenuItem
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideMenuProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoZIndex: js.UndefOr[Boolean] = js.undefined
  var backLabel: js.UndefOr[String] = js.undefined
  var baseZIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var effectDuration: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var menuWidth: js.UndefOr[Double] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var popup: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var viewportHeight: js.UndefOr[Double] = js.undefined
}

object SlideMenuProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[Boolean] = js.undefined,
    backLabel: String = null,
    baseZIndex: Int | Double = null,
    className: String = null,
    easing: String = null,
    effectDuration: Int | Double = null,
    id: String = null,
    menuWidth: Int | Double = null,
    model: js.Array[MenuItem] = null,
    onHide: /* e */ Event_ => Unit = null,
    onShow: /* e */ Event_ => Unit = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    viewportHeight: Int | Double = null
  ): SlideMenuProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex.asInstanceOf[js.Any])
    if (backLabel != null) __obj.updateDynamic("backLabel")(backLabel.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (effectDuration != null) __obj.updateDynamic("effectDuration")(effectDuration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (menuWidth != null) __obj.updateDynamic("menuWidth")(menuWidth.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewportHeight != null) __obj.updateDynamic("viewportHeight")(viewportHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideMenuProps]
  }
}

