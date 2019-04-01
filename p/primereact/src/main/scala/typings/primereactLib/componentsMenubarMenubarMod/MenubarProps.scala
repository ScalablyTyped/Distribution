package typings
package primereactLib.componentsMenubarMenubarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenubarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object MenubarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    id: java.lang.String = null,
    model: js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem] = null,
    style: js.Object = null
  ): MenubarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MenubarProps]
  }
}

