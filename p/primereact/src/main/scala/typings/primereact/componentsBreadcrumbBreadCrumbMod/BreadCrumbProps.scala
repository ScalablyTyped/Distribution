package typings.primereact.componentsBreadcrumbBreadCrumbMod

import typings.primereact.componentsMenuitemMenuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadCrumbProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var home: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object BreadCrumbProps {
  @scala.inline
  def apply(
    className: String = null,
    home: js.Any = null,
    id: String = null,
    model: js.Array[MenuItem] = null,
    style: js.Object = null
  ): BreadCrumbProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadCrumbProps]
  }
}

