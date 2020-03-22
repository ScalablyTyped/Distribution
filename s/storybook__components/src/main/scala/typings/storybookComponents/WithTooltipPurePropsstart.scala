package typings.storybookComponents

import typings.popperJs.mod.Modifiers
import typings.popperJs.mod.Placement
import typings.react.mod.ReactNode
import typings.storybookComponents.storybookComponentsStrings.`right-click`
import typings.storybookComponents.storybookComponentsStrings.click
import typings.storybookComponents.storybookComponentsStrings.hover
import typings.storybookComponents.storybookComponentsStrings.none
import typings.storybookComponents.withTooltipMod.WithHideFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/components.@storybook/components/dist/tooltip/WithTooltip.WithTooltipPureProps & {  startOpen ? :boolean} */
@js.native
trait WithTooltipPurePropsstart extends js.Object {
  var children: ReactNode = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var hasChrome: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
  var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var startOpen: js.UndefOr[Boolean] = js.native
  var svg: js.UndefOr[Boolean] = js.native
  var tooltip: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode]) = js.native
  var tooltipShown: js.UndefOr[Boolean] = js.native
  var trigger: js.UndefOr[none | hover | click | `right-click`] = js.native
}

object WithTooltipPurePropsstart {
  @scala.inline
  def apply(
    children: ReactNode = null,
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onDoubleClick: () => Unit = null,
    onVisibilityChange: /* visibility */ Boolean => Unit = null,
    placement: Placement = null,
    startOpen: js.UndefOr[Boolean] = js.undefined,
    svg: js.UndefOr[Boolean] = js.undefined,
    tooltip: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode]) = null,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    trigger: none | hover | click | `right-click` = null
  ): WithTooltipPurePropsstart = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction1(onVisibilityChange))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTooltipPurePropsstart]
  }
}

