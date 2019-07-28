package typings.primereact.componentsDropdownDropdownMod

import typings.primereact.Anon_OriginalEventValue
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.react.reactMod.ReactNode
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
  var filterPlaceholder: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* option */ js.Any, ReactNode]] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var optionLabel: js.UndefOr[String] = js.undefined
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
    filterPlaceholder: String = null,
    id: String = null,
    inputId: String = null,
    itemTemplate: /* option */ js.Any => ReactNode = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    onChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onContextMenu: /* event */ Event => Unit = null,
    onMouseDown: /* event */ Event => Unit = null,
    optionLabel: String = null,
    options: js.Array[_] = null,
    panelClassName: String = null,
    panelStyle: js.Object = null,
    placeholder: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    scrollHeight: String = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    tabIndex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
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
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
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

