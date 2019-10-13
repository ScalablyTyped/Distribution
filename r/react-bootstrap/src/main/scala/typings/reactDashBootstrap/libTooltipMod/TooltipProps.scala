package typings.reactDashBootstrap.libTooltipMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps
  extends AllHTMLAttributes[Tooltip]
     with ClassAttributes[Tooltip] {
  // Optional
  var arrowOffsetLeft: js.UndefOr[Double | String] = js.undefined
  var arrowOffsetTop: js.UndefOr[Double | String] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var positionLeft: js.UndefOr[Double] = js.undefined
  var positionTop: js.UndefOr[Double] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Tooltip] = null,
    ClassAttributes: ClassAttributes[Tooltip] = null,
    arrowOffsetLeft: Double | String = null,
    arrowOffsetTop: Double | String = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    placement: String = null,
    positionLeft: Int | Double = null,
    positionTop: Int | Double = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
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

