package typings.primereact.componentsMegamenuMegaMenuMod

import typings.primereact.componentsMenuitemMenuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MegaMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object MegaMenuProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    orientation: String = null,
    style: js.Object = null
  ): MegaMenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MegaMenuProps]
  }
}

