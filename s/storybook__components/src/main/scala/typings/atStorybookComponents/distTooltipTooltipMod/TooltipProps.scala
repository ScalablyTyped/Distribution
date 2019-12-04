package typings.atStorybookComponents.distTooltipTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var arrowProps: js.UndefOr[js.Any] = js.undefined
  var arrowRef: js.UndefOr[js.Any] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var hasChrome: js.UndefOr[Boolean] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var tooltipRef: js.UndefOr[js.Any] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    arrowProps: js.Any = null,
    arrowRef: js.Any = null,
    color: String = null,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    placement: String = null,
    tooltipRef: js.Any = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (arrowProps != null) __obj.updateDynamic("arrowProps")(arrowProps.asInstanceOf[js.Any])
    if (arrowRef != null) __obj.updateDynamic("arrowRef")(arrowRef.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (tooltipRef != null) __obj.updateDynamic("tooltipRef")(tooltipRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

