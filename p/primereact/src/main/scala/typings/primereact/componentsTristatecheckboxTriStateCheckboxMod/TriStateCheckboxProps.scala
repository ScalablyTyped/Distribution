package typings.primereact.componentsTristatecheckboxTriStateCheckboxMod

import typings.primereact.Anon_OriginalEventValueBoolean
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriStateCheckboxProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValueBoolean, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[Boolean | Null] = js.undefined
}

object TriStateCheckboxProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    inputId: String = null,
    name: String = null,
    onChange: /* e */ Anon_OriginalEventValueBoolean => Unit = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: js.UndefOr[Boolean] = js.undefined
  ): TriStateCheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TriStateCheckboxProps]
  }
}

