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

trait CircleProps extends CommonProps {
  var gapDegree: js.UndefOr[Double] = js.undefined
  var gapPosition: js.UndefOr[top | bottom | left | right] = js.undefined
}

object CircleProps {
  @scala.inline
  def apply(
    className: String = null,
    gapDegree: Int | Double = null,
    gapPosition: top | bottom | left | right = null,
    percent: Double | String = null,
    prefixCls: String = null,
    strokeColor: String = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Double | String = null,
    style: js.Array[CSSProperties] | CSSProperties = null,
    trailColor: String = null,
    trailWidth: Double | String = null
  ): CircleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (gapDegree != null) __obj.updateDynamic("gapDegree")(gapDegree.asInstanceOf[js.Any])
    if (gapPosition != null) __obj.updateDynamic("gapPosition")(gapPosition.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor)
    if (trailWidth != null) __obj.updateDynamic("trailWidth")(trailWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
}

