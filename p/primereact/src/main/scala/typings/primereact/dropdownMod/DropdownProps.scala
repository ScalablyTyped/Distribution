package typings.primereact.dropdownMod

import typings.primereact.anon.Target
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataKey: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterBy: js.UndefOr[String] = js.undefined
  var filterInputAutoFocus: js.UndefOr[Boolean] = js.undefined
  var filterLocale: js.UndefOr[String] = js.undefined
  var filterMatchMode: js.UndefOr[String] = js.undefined
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* option */ js.Any, ReactNode]] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var optionLabel: js.UndefOr[String] = js.undefined
  var optionValue: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var panelClassName: js.UndefOr[String] = js.undefined
  var panelStyle: js.UndefOr[js.Object] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var scrollHeight: js.UndefOr[String] = js.undefined
  var showClear: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dataKey: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterBy: String = null,
    filterInputAutoFocus: js.UndefOr[Boolean] = js.undefined,
    filterLocale: String = null,
    filterMatchMode: String = null,
    filterPlaceholder: String = null,
    id: String = null,
    inputId: String = null,
    itemTemplate: /* option */ js.Any => ReactNode = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    name: String = null,
    onBlur: /* e */ Event => Unit = null,
    onChange: /* e */ Target => Unit = null,
    onContextMenu: /* event */ Event => Unit = null,
    onFocus: /* e */ Event => Unit = null,
    onMouseDown: /* event */ Event => Unit = null,
    optionLabel: String = null,
    optionValue: String = null,
    options: js.Array[_] = null,
    panelClassName: String = null,
    panelStyle: js.Object = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    scrollHeight: String = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Any = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.get.asInstanceOf[js.Any])
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy.asInstanceOf[js.Any])
    if (!js.isUndefined(filterInputAutoFocus)) __obj.updateDynamic("filterInputAutoFocus")(filterInputAutoFocus.get.asInstanceOf[js.Any])
    if (filterLocale != null) __obj.updateDynamic("filterLocale")(filterLocale.asInstanceOf[js.Any])
    if (filterMatchMode != null) __obj.updateDynamic("filterMatchMode")(filterMatchMode.asInstanceOf[js.Any])
    if (filterPlaceholder != null) __obj.updateDynamic("filterPlaceholder")(filterPlaceholder.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel.asInstanceOf[js.Any])
    if (optionValue != null) __obj.updateDynamic("optionValue")(optionValue.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName.asInstanceOf[js.Any])
    if (panelStyle != null) __obj.updateDynamic("panelStyle")(panelStyle.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownProps]
  }
}

