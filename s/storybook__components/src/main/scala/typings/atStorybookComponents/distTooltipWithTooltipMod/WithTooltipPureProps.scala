package typings.atStorybookComponents.distTooltipWithTooltipMod

import typings.atStorybookComponents.atStorybookComponentsStrings.`right-click`
import typings.atStorybookComponents.atStorybookComponentsStrings.click
import typings.atStorybookComponents.atStorybookComponentsStrings.hover
import typings.atStorybookComponents.atStorybookComponentsStrings.none
import typings.popperDotJs.popperDotJsMod.Modifiers
import typings.popperDotJs.popperDotJsMod.Placement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTooltipPureProps extends js.Object {
  var children: ReactNode
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  var hasChrome: js.UndefOr[Boolean] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ Boolean, Unit]] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var svg: js.UndefOr[Boolean] = js.undefined
  var tooltip: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode])
  var tooltipShown: js.UndefOr[Boolean] = js.undefined
  var trigger: js.UndefOr[none | hover | click | `right-click`] = js.undefined
}

object WithTooltipPureProps {
  @scala.inline
  def apply(
    children: ReactNode,
    tooltip: ReactNode | (js.Function1[/* p */ WithHideFn, ReactNode]),
    closeOnClick: js.UndefOr[Boolean] = js.undefined,
    hasChrome: js.UndefOr[Boolean] = js.undefined,
    modifiers: Modifiers = null,
    onDoubleClick: () => Unit = null,
    onVisibilityChange: /* visibility */ Boolean => Unit = null,
    placement: Placement = null,
    svg: js.UndefOr[Boolean] = js.undefined,
    tooltipShown: js.UndefOr[Boolean] = js.undefined,
    trigger: none | hover | click | `right-click` = null
  ): WithTooltipPureProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (!js.isUndefined(hasChrome)) __obj.updateDynamic("hasChrome")(hasChrome)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction0(onDoubleClick))
    if (onVisibilityChange != null) __obj.updateDynamic("onVisibilityChange")(js.Any.fromFunction1(onVisibilityChange))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(svg)) __obj.updateDynamic("svg")(svg)
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTooltipPureProps]
  }
}

