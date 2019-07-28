package typings.rcDashProgress.rcDashProgressMod

import typings.rcDashProgress.rcDashProgressStrings.butt
import typings.rcDashProgress.rcDashProgressStrings.round
import typings.rcDashProgress.rcDashProgressStrings.square
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends CommonProps {
  var prevTimeStamp: js.UndefOr[Double] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    className: String = null,
    percent: Double | String = null,
    prefixCls: String = null,
    prevTimeStamp: Int | Double = null,
    strokeColor: String = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Double | String = null,
    style: js.Array[CSSProperties] | CSSProperties = null,
    trailColor: String = null,
    trailWidth: Double | String = null
  ): LineProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (prevTimeStamp != null) __obj.updateDynamic("prevTimeStamp")(prevTimeStamp.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor)
    if (trailWidth != null) __obj.updateDynamic("trailWidth")(trailWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
}

