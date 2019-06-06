package typings
package atStorybookComponentsLib.distTooltipWithTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTooltipPureProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var hasChrome: js.UndefOr[scala.Boolean] = js.undefined
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onVisibilityChange: js.UndefOr[js.Function1[/* visibility */ scala.Boolean, scala.Unit]] = js.undefined
  var placement: js.UndefOr[popperDotJsLib.popperDotJsMod.Placement] = js.undefined
  var svg: js.UndefOr[scala.Boolean] = js.undefined
  var tooltip: reactLib.reactMod.ReactNode
  var tooltipShown: js.UndefOr[scala.Boolean] = js.undefined
  var trigger: js.UndefOr[
    atStorybookComponentsLib.atStorybookComponentsLibStrings.none | atStorybookComponentsLib.atStorybookComponentsLibStrings.hover | atStorybookComponentsLib.atStorybookComponentsLibStrings.click | atStorybookComponentsLib.atStorybookComponentsLibStrings.`right-click`
  ] = js.undefined
}

object WithTooltipPureProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    tooltip: reactLib.reactMod.ReactNode,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    hasChrome: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    onDoubleClick: () => scala.Unit = null,
    onVisibilityChange: /* visibility */ scala.Boolean => scala.Unit = null,
    placement: popperDotJsLib.popperDotJsMod.Placement = null,
    svg: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipShown: js.UndefOr[scala.Boolean] = js.undefined,
    trigger: atStorybookComponentsLib.atStorybookComponentsLibStrings.none | atStorybookComponentsLib.atStorybookComponentsLibStrings.hover | atStorybookComponentsLib.atStorybookComponentsLibStrings.click | atStorybookComponentsLib.atStorybookComponentsLibStrings.`right-click` = null
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

