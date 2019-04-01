package typings
package primereactLib.componentsMultiselectMultiSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectProps extends js.Object {
  var appendTo: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dataKey: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var fixedPlaceholder: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemTemplate: js.UndefOr[
    js.Function1[/* item */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var optionLabel: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var scrollHeight: js.UndefOr[java.lang.String] = js.undefined
  var selectedItemTemplate: js.UndefOr[
    js.Function1[/* value */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[scala.Boolean] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object MultiSelectProps {
  @scala.inline
  def apply(
    appendTo: stdLib.HTMLElement = null,
    className: java.lang.String = null,
    dataKey: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    fixedPlaceholder: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    onBlur: /* event */ stdLib.Event => scala.Unit = null,
    onChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onFocus: /* event */ stdLib.Event => scala.Unit = null,
    optionLabel: java.lang.String = null,
    options: js.Array[_] = null,
    placeholder: java.lang.String = null,
    scrollHeight: java.lang.String = null,
    selectedItemTemplate: /* value */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    style: js.Object = null,
    tabIndex: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    value: js.Any = null
  ): MultiSelectProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(fixedPlaceholder)) __obj.updateDynamic("fixedPlaceholder")(fixedPlaceholder)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel)
    if (options != null) __obj.updateDynamic("options")(options)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight)
    if (selectedItemTemplate != null) __obj.updateDynamic("selectedItemTemplate")(js.Any.fromFunction1(selectedItemTemplate))
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MultiSelectProps]
  }
}

