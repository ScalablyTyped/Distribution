package typings
package primereactLib.componentsSelectitemSelectItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectItem extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var value: js.Any
}

object SelectItem {
  @scala.inline
  def apply(
    value: js.Any,
    className: java.lang.String = null,
    icon: java.lang.String = null,
    label: java.lang.String = null,
    title: java.lang.String = null
  ): SelectItem = {
    val __obj = js.Dynamic.literal(value = value)
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SelectItem]
  }
}

