package typings
package rcDashProgressLib.rcDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends CommonProps {
  var prevTimeStamp: js.UndefOr[scala.Double] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    percent: scala.Double | java.lang.String = null,
    prefixCls: java.lang.String = null,
    prevTimeStamp: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeLinecap: rcDashProgressLib.rcDashProgressLibStrings.butt | rcDashProgressLib.rcDashProgressLibStrings.square | rcDashProgressLib.rcDashProgressLibStrings.round = null,
    strokeWidth: scala.Double | java.lang.String = null,
    style: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties = null,
    trailColor: java.lang.String = null,
    trailWidth: scala.Double | java.lang.String = null
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

