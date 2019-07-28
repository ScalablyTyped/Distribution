package typings.rcDashProgress.rcDashProgressMod

import typings.rcDashProgress.rcDashProgressStrings.butt
import typings.rcDashProgress.rcDashProgressStrings.round
import typings.rcDashProgress.rcDashProgressStrings.square
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var percent: js.UndefOr[Double | String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var strokeColor: js.UndefOr[String] = js.undefined
  var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
  var strokeWidth: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[js.Array[CSSProperties] | CSSProperties] = js.undefined
  var trailColor: js.UndefOr[String] = js.undefined
  var trailWidth: js.UndefOr[Double | String] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    className: String = null,
    percent: Double | String = null,
    prefixCls: String = null,
    strokeColor: String = null,
    strokeLinecap: butt | square | round = null,
    strokeWidth: Double | String = null,
    style: js.Array[CSSProperties] | CSSProperties = null,
    trailColor: String = null,
    trailWidth: Double | String = null
  ): CommonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor)
    if (trailWidth != null) __obj.updateDynamic("trailWidth")(trailWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
}

