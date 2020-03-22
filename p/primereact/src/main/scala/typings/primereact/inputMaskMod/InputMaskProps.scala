package typings.primereact.inputMaskMod

import typings.primereact.AnonValue
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputMaskProps extends js.Object {
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  var autoClear: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var mask: js.UndefOr[String] = js.undefined
  var maxlength: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ AnonValue, Unit]] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var slotChar: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabindex: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var unmask: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object InputMaskProps {
  @scala.inline
  def apply(
    ariaLabelledBy: String = null,
    autoClear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    mask: String = null,
    maxlength: Int | Double = null,
    name: String = null,
    onChange: /* e */ AnonValue => Unit = null,
    onComplete: /* e */ Event_ => Unit = null,
    placeholder: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null,
    slotChar: String = null,
    style: js.Object = null,
    tabindex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    `type`: String = null,
    unmask: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): InputMaskProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClear)) __obj.updateDynamic("autoClear")(autoClear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (slotChar != null) __obj.updateDynamic("slotChar")(slotChar.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unmask)) __obj.updateDynamic("unmask")(unmask.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMaskProps]
  }
}

