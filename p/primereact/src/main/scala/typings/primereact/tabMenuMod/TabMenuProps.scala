package typings.primereact.tabMenuMod

import typings.primereact.AnonOriginalEventValue
import typings.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabMenuProps extends js.Object {
  var activeItem: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* e */ AnonOriginalEventValue, Unit]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object TabMenuProps {
  @scala.inline
  def apply(
    activeItem: js.Any = null,
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    onTabChange: /* e */ AnonOriginalEventValue => Unit = null,
    style: js.Any = null
  ): TabMenuProps = {
    val __obj = js.Dynamic.literal()
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabMenuProps]
  }
}

