package typings.storybookComponents.tooltipMod

import typings.storybookComponents.storybookComponentsStrings.ancillary
import typings.storybookComponents.storybookComponentsStrings.border
import typings.storybookComponents.storybookComponentsStrings.critical
import typings.storybookComponents.storybookComponentsStrings.dark
import typings.storybookComponents.storybookComponentsStrings.darker
import typings.storybookComponents.storybookComponentsStrings.darkest
import typings.storybookComponents.storybookComponentsStrings.defaultText
import typings.storybookComponents.storybookComponentsStrings.gold
import typings.storybookComponents.storybookComponentsStrings.green
import typings.storybookComponents.storybookComponentsStrings.inverseText
import typings.storybookComponents.storybookComponentsStrings.light
import typings.storybookComponents.storybookComponentsStrings.lighter
import typings.storybookComponents.storybookComponentsStrings.lightest
import typings.storybookComponents.storybookComponentsStrings.medium
import typings.storybookComponents.storybookComponentsStrings.mediumdark
import typings.storybookComponents.storybookComponentsStrings.mediumlight
import typings.storybookComponents.storybookComponentsStrings.negative
import typings.storybookComponents.storybookComponentsStrings.orange
import typings.storybookComponents.storybookComponentsStrings.positive
import typings.storybookComponents.storybookComponentsStrings.primary
import typings.storybookComponents.storybookComponentsStrings.purple
import typings.storybookComponents.storybookComponentsStrings.seafoam
import typings.storybookComponents.storybookComponentsStrings.secondary
import typings.storybookComponents.storybookComponentsStrings.tertiary
import typings.storybookComponents.storybookComponentsStrings.ultraviolet
import typings.storybookComponents.storybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps extends js.Object {
  var arrowProps: js.UndefOr[js.Any] = js.native
  var arrowRef: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[
    primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText
  ] = js.native
  var hasChrome: js.UndefOr[Boolean] = js.native
  var placement: js.UndefOr[String] = js.native
  var tooltipRef: js.UndefOr[js.Any] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(
    arrowProps: js.Any = null,
    arrowRef: js.Any = null,
    color: primary | secondary | tertiary | ancillary | orange | gold | green | seafoam | purple | ultraviolet | lightest | lighter | light | mediumlight | medium | mediumdark | dark | darker | darkest | border | positive | negative | warning | critical | defaultText | inverseText = null,
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

