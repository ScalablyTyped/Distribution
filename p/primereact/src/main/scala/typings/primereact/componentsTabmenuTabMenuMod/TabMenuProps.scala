package typings.primereact.componentsTabmenuTabMenuMod

import typings.primereact.Anon_OriginalEventValue
import typings.primereact.componentsMenuitemMenuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabMenuProps extends js.Object {
  var activeItem: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object TabMenuProps {
  @scala.inline
  def apply(
    activeItem: js.Any = null,
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    onTabChange: /* e */ Anon_OriginalEventValue => Unit = null,
    style: js.Any = null
  ): TabMenuProps = {
    val __obj = js.Dynamic.literal()
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem)
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TabMenuProps]
  }
}

