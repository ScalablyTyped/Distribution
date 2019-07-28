package typings.primereact.componentsSplitbuttonSplitButtonMod

import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitButtonProps extends js.Object {
  var appendTo: js.UndefOr[HTMLElement] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var menuClassName: js.UndefOr[String] = js.undefined
  var menuStyle: js.UndefOr[js.Object] = js.undefined
  var model: js.UndefOr[js.Array[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
}

object SplitButtonProps {
  @scala.inline
  def apply(
    appendTo: HTMLElement = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    id: String = null,
    label: String = null,
    menuClassName: String = null,
    menuStyle: js.Object = null,
    model: js.Array[_] = null,
    onClick: /* event */ Event => Unit = null,
    style: js.Object = null,
    tabIndex: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null
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

