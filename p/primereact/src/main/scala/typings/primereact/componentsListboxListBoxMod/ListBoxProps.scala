package typings.primereact.componentsListboxListBoxMod

import typings.primereact.Anon_OriginalEventValue
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dataKey: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemTemplate: js.UndefOr[js.Function1[/* item */ js.Any, js.UndefOr[Element]]] = js.undefined
  var listStyle: js.UndefOr[js.Object] = js.undefined
  var metaKeySelection: js.UndefOr[Boolean] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValue, Unit]] = js.undefined
  var optionLabel: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ListBoxProps {
  @scala.inline
  def apply(
    className: String = null,
    dataKey: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[Element] = null,
    listStyle: js.Object = null,
    metaKeySelection: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ Anon_OriginalEventValue => Unit = null,
    optionLabel: String = null,
    options: js.Array[_] = null,
    style: js.Object = null,
    tabIndex: String = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
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

