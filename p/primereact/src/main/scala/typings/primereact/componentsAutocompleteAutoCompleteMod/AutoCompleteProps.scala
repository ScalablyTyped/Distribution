package typings.primereact.componentsAutocompleteAutoCompleteMod

import typings.primereact.Anon_OriginalEvent
import typings.primereact.Anon_OriginalEventValue
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.react.reactMod.Global.JSXNs.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var completeMethod: js.UndefOr[js.Function1[/* e */ Anon_OriginalEvent, Unit]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdown: js.UndefOr[Boolean] = js.undefined
  var dropdownMode: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var inputStyle: js.UndefOr[js.Object] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.undefined
  var maxlength: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onDropdownClick: js.UndefOr[js.Function1[/* e */ Anon_OriginalEvent, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onKeyUp: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var onUnselect: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var scrollHeight: js.UndefOr[String] = js.undefined
  var selectedItemTemplate: js.UndefOr[js.Function1[/* data */ js.Any, js.UndefOr[Element]]] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var suggestions: js.UndefOr[js.Array[_]] = js.undefined
  var tabindex: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AutoCompleteProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    completeMethod: /* e */ Anon_OriginalEvent => Unit = null,
    delay: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdown: js.UndefOr[Boolean] = js.undefined,
    dropdownMode: String = null,
    field: String = null,
    id: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputStyle: js.Object = null,
    itemTemplate: /* data */ js.Any => js.UndefOr[Element] = null,
    maxlength: Int | Double = null,
    minLength: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onBlur: /* event */ Event => Unit = null,
    onChange: /* e */ Anon_OriginalEventValue => Unit = null,
    onClear: /* event */ Event => Unit = null,
    onClick: /* event */ Event => Unit = null,
    onContextMenu: /* event */ Event => Unit = null,
    onDblClick: /* event */ Event => Unit = null,
    onDropdownClick: /* e */ Anon_OriginalEvent => Unit = null,
    onFocus: /* event */ Event => Unit = null,
    onKeyPress: /* event */ Event => Unit = null,
    onKeyUp: /* event */ Event => Unit = null,
    onMouseDown: /* event */ Event => Unit = null,
    onSelect: /* e */ Anon_OriginalEventValue => Unit = null,
    onUnselect: /* e */ Anon_OriginalEventValue => Unit = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    scrollHeight: String = null,
    selectedItemTemplate: /* data */ js.Any => js.UndefOr[Element] = null,
    size: Int | Double = null,
    style: js.Object = null,
    suggestions: js.Array[_] = null,
    tabindex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    `type`: String = null,
    value: js.Any = null
  ): AutoCompleteProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (completeMethod != null) __obj.updateDynamic("completeMethod")(js.Any.fromFunction1(completeMethod))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dropdown)) __obj.updateDynamic("dropdown")(dropdown)
    if (dropdownMode != null) __obj.updateDynamic("dropdownMode")(dropdownMode)
    if (field != null) __obj.updateDynamic("field")(field)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDropdownClick != null) __obj.updateDynamic("onDropdownClick")(js.Any.fromFunction1(onDropdownClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1(onUnselect))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (scrollHeight != null) __obj.updateDynamic("scrollHeight")(scrollHeight)
    if (selectedItemTemplate != null) __obj.updateDynamic("selectedItemTemplate")(js.Any.fromFunction1(selectedItemTemplate))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[AutoCompleteProps]
  }
}

