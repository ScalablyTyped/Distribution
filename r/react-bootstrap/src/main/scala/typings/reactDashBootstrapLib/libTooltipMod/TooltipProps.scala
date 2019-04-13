package typings
package reactDashBootstrapLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends reactLib.reactMod.HTMLProps[Tooltip] {
  // Optional
  var arrowOffsetLeft: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var arrowOffsetTop: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var positionLeft: js.UndefOr[scala.Double] = js.undefined
  var positionTop: js.UndefOr[scala.Double] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Tooltip] = null,
    arrowOffsetLeft: scala.Double | java.lang.String = null,
    arrowOffsetTop: scala.Double | java.lang.String = null,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    placement: java.lang.String = null,
    positionLeft: scala.Int | scala.Double = null,
    positionTop: scala.Int | scala.Double = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (arrowOffsetLeft != null) __obj.updateDynamic("arrowOffsetLeft")(arrowOffsetLeft.asInstanceOf[js.Any])
    if (arrowOffsetTop != null) __obj.updateDynamic("arrowOffsetTop")(arrowOffsetTop.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (positionLeft != null) __obj.updateDynamic("positionLeft")(positionLeft.asInstanceOf[js.Any])
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

