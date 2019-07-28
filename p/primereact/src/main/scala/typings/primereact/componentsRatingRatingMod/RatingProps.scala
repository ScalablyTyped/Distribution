package typings.primereact.componentsRatingRatingMod

import typings.primereact.Anon_OriginalEventValueEventNumber
import typings.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingProps extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_OriginalEventValueEventNumber, Unit]] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var stars: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object RatingProps {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onChange: /* e */ Anon_OriginalEventValueEventNumber => Unit = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    stars: Int | Double = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    value: Int | Double = null
  ): RatingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (stars != null) __obj.updateDynamic("stars")(stars.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingProps]
  }
}

