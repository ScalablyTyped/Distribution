package typings
package reactDashMdLib.libTooltipsInjectTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedTooltipProps extends js.Object {
  var tooltipClassName: js.UndefOr[java.lang.String] = js.undefined
  var tooltipContainerClassName: js.UndefOr[java.lang.String] = js.undefined
  var tooltipContainerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tooltipDelay: js.UndefOr[scala.Double] = js.undefined
  var tooltipLabel: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var tooltipPosition: js.UndefOr[Positions] = js.undefined
  var tooltipStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tooltipTransitionEnterTimeout: js.UndefOr[scala.Double] = js.undefined
  var tooltipTransitionLeaveTimeout: js.UndefOr[scala.Double] = js.undefined
}

object InjectedTooltipProps {
  @scala.inline
  def apply(
    tooltipClassName: java.lang.String = null,
    tooltipContainerClassName: java.lang.String = null,
    tooltipContainerStyle: reactLib.reactMod.CSSProperties = null,
    tooltipDelay: scala.Int | scala.Double = null,
    tooltipLabel: reactLib.reactMod.ReactNode = null,
    tooltipPosition: Positions = null,
    tooltipStyle: reactLib.reactMod.CSSProperties = null,
    tooltipTransitionEnterTimeout: scala.Int | scala.Double = null,
    tooltipTransitionLeaveTimeout: scala.Int | scala.Double = null
  ): InjectedTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (tooltipClassName != null) __obj.updateDynamic("tooltipClassName")(tooltipClassName)
    if (tooltipContainerClassName != null) __obj.updateDynamic("tooltipContainerClassName")(tooltipContainerClassName)
    if (tooltipContainerStyle != null) __obj.updateDynamic("tooltipContainerStyle")(tooltipContainerStyle)
    if (tooltipDelay != null) __obj.updateDynamic("tooltipDelay")(tooltipDelay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    if (tooltipPosition != null) __obj.updateDynamic("tooltipPosition")(tooltipPosition)
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle)
    if (tooltipTransitionEnterTimeout != null) __obj.updateDynamic("tooltipTransitionEnterTimeout")(tooltipTransitionEnterTimeout.asInstanceOf[js.Any])
    if (tooltipTransitionLeaveTimeout != null) __obj.updateDynamic("tooltipTransitionLeaveTimeout")(tooltipTransitionLeaveTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedTooltipProps]
  }
}

