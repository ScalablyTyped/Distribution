package typings
package primereactLib.componentsBreadcrumbBreadCrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadCrumbProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var home: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object BreadCrumbProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    home: js.Any = null,
    id: java.lang.String = null,
    model: js.Array[primereactLib.componentsMenuitemMenuItemMod.MenuItem] = null,
    style: js.Object = null
  ): BreadCrumbProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (home != null) __obj.updateDynamic("home")(home)
    if (id != null) __obj.updateDynamic("id")(id)
    if (model != null) __obj.updateDynamic("model")(model)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BreadCrumbProps]
  }
}

