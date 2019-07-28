package typings.primereact.componentsSelectitemSelectItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectItem extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var value: js.Any
}

object SelectItem {
  @scala.inline
  def apply(
    value: js.Any,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    label: String = null,
    title: String = null
  ): SelectItem = {
    val __obj = js.Dynamic.literal(value = value)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SelectItem]
  }
}

