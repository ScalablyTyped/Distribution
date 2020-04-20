package typings.primereact.chipsChipsMod

import typings.primereact.AnonTarget
import typings.primereact.AnonValue
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod._Global_.JSX.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipsProps extends js.Object {
  var allowDuplicate: js.UndefOr[Boolean] = js.undefined
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ AnonTarget, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object ChipsProps {
  @scala.inline
  def apply(
    allowDuplicate: js.UndefOr[Boolean] = js.undefined,
    ariaLabelledBy: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[Element] = null,
    max: Int | Double = null,
    name: String = null,
    onAdd: /* e */ AnonValue => Unit = null,
    onBlur: /* event */ Event_ => Unit = null,
    onChange: /* e */ AnonTarget => Unit = null,
    onFocus: /* event */ Event_ => Unit = null,
    onRemove: /* e */ AnonValue => Unit = null,
    placeholder: String = null,
    separator: String = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.Array[_] = null
  ): ChipsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicate)) __obj.updateDynamic("allowDuplicate")(allowDuplicate.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipsProps]
  }
}

