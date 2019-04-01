package typings
package primereactLib.componentsSplitbuttonSplitButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitButtonProps extends js.Object {
  var appendTo: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var menuClassName: js.UndefOr[java.lang.String] = js.undefined
  var menuStyle: js.UndefOr[js.Object] = js.undefined
  var model: js.UndefOr[js.Array[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
}

object SplitButtonProps {
  @scala.inline
  def apply(
    appendTo: stdLib.HTMLElement = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    id: java.lang.String = null,
    label: java.lang.String = null,
    menuClassName: java.lang.String = null,
    menuStyle: js.Object = null,
    model: js.Array[_] = null,
    onClick: /* event */ stdLib.Event => scala.Unit = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null
  ): SplitButtonProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (model != null) __obj.updateDynamic("model")(model)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    __obj.asInstanceOf[SplitButtonProps]
  }
}

