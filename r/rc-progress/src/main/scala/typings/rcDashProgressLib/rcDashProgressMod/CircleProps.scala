package typings
package rcDashProgressLib.rcDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleProps extends CommonProps {
  var gapDegree: js.UndefOr[scala.Double] = js.undefined
  var gapPosition: js.UndefOr[
    rcDashProgressLib.rcDashProgressLibStrings.top | rcDashProgressLib.rcDashProgressLibStrings.bottom | rcDashProgressLib.rcDashProgressLibStrings.left | rcDashProgressLib.rcDashProgressLibStrings.right
  ] = js.undefined
}

object CircleProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    gapDegree: scala.Int | scala.Double = null,
    gapPosition: rcDashProgressLib.rcDashProgressLibStrings.top | rcDashProgressLib.rcDashProgressLibStrings.bottom | rcDashProgressLib.rcDashProgressLibStrings.left | rcDashProgressLib.rcDashProgressLibStrings.right = null,
    percent: scala.Double | java.lang.String = null,
    prefixCls: java.lang.String = null,
    strokeColor: java.lang.String = null,
    strokeLinecap: rcDashProgressLib.rcDashProgressLibStrings.butt | rcDashProgressLib.rcDashProgressLibStrings.square | rcDashProgressLib.rcDashProgressLibStrings.round = null,
    strokeWidth: scala.Double | java.lang.String = null,
    style: js.Array[reactLib.reactMod.ReactNs.CSSProperties] | reactLib.reactMod.ReactNs.CSSProperties = null,
    trailColor: java.lang.String = null,
    trailWidth: scala.Double | java.lang.String = null
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

