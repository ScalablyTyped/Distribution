package typings
package primereactLib.componentsListboxListBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dataKey: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemTemplate: js.UndefOr[
    js.Function1[/* item */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var listStyle: js.UndefOr[js.Object] = js.undefined
  var metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var optionLabel: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ListBoxProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    dataKey: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    listStyle: js.Object = null,
    metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    optionLabel: java.lang.String = null,
    options: js.Array[_] = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    value: js.Any = null
  ): ListBoxProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (optionLabel != null) __obj.updateDynamic("optionLabel")(optionLabel)
    if (options != null) __obj.updateDynamic("options")(options)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ListBoxProps]
  }
}

