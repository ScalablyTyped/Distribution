package typings
package primereactLib.componentsRatingRatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingProps extends js.Object {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ primereactLib.Anon_OriginalEventValueEventNumber, scala.Unit]
  ] = js.undefined
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
  var stars: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object RatingProps {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    onChange: /* e */ primereactLib.Anon_OriginalEventValueEventNumber => scala.Unit = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    stars: scala.Int | scala.Double = null,
    style: js.Object = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    value: scala.Int | scala.Double = null
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

