package typings
package primereactLib.componentsChipsChipsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipsProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemTemplate: js.UndefOr[
    js.Function1[/* item */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onAdd: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onRemove: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object ChipsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    max: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onAdd: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onBlur: /* event */ stdLib.Event => scala.Unit = null,
    onChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onFocus: /* event */ stdLib.Event => scala.Unit = null,
    onRemove: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    placeholder: java.lang.String = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    value: js.Array[_] = null
  ): ChipsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChipsProps]
  }
}

