package typings
package primereactLib.componentsDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dataKey: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterBy: js.UndefOr[java.lang.String] = js.undefined
  var filterPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* option */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var optionLabel: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var panelClassName: js.UndefOr[java.lang.String] = js.undefined
  var panelStyle: js.UndefOr[js.Object] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var scrollHeight: js.UndefOr[java.lang.String] = js.undefined
  var showClear: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    ariaLabel: java.lang.String = null,
    ariaLabelledBy: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    autoWidth: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    dataKey: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterBy: java.lang.String = null,
    filterPlaceholder: java.lang.String = null,
    id: java.lang.String = null,
    inputId: java.lang.String = null,
    itemTemplate: /* option */ js.Any => reactLib.reactMod.ReactNode = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onContextMenu: /* event */ stdLib.Event => scala.Unit = null,
    onMouseDown: /* event */ stdLib.Event => scala.Unit = null,
    optionLabel: java.lang.String = null,
    options: js.Array[_] = null,
    panelClassName: java.lang.String = null,
    panelStyle: js.Object = null,
    placeholder: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    scrollHeight: java.lang.String = null,
    showClear: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: scala.Int | scala.Double = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    value: js.Any = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel)
    if (options != null) __obj.updateDynamic("options")(options)
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName)
    if (panelStyle != null) __obj.updateDynamic("panelStyle")(panelStyle)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight)
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DropdownProps]
  }
}

