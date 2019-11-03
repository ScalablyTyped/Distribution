package typings.rcDashProgress.rcDashProgressMod

import typings.rcDashProgress.rcDashProgressStrings.bottom
import typings.rcDashProgress.rcDashProgressStrings.butt
import typings.rcDashProgress.rcDashProgressStrings.left
import typings.rcDashProgress.rcDashProgressStrings.right
import typings.rcDashProgress.rcDashProgressStrings.round
import typings.rcDashProgress.rcDashProgressStrings.square
import typings.rcDashProgress.rcDashProgressStrings.top
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RCProgressProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var gapDegree: js.UndefOr[Double] = js.undefined
  var gapPosition: js.UndefOr[top | right | bottom | left] = js.undefined
  var percent: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var strokeColor: js.UndefOr[String | js.Array[String] | js.Object] = js.undefined
  var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var trailColor: js.UndefOr[String] = js.undefined
  var trailWidth: js.UndefOr[Double] = js.undefined
}

object RCProgressProps {
  @scala.inline
  def apply(
    className: String = null,
    gapDegree: Int | Double = null,
    gapPosition: top | right | bottom | left = null,
    percent: Double | js.Array[Double] = null,
    prefixCls: String = null,
    strokeColor: String | js.Array[String] | js.Object = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Int | Double = null,
    style: CSSProperties = null,
    trailColor: String = null,
    trailWidth: Int | Double = null
  ): RCProgressProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor)
    if (trailWidth != null) __obj.updateDynamic("trailWidth")(trailWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[RCProgressProps]
  }
}

