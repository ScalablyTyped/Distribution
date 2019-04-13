package typings
package rcDashProgressLib.rcDashProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var percent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  var strokeLinecap: js.UndefOr[
    rcDashProgressLib.rcDashProgressLibStrings.butt | rcDashProgressLib.rcDashProgressLibStrings.square | rcDashProgressLib.rcDashProgressLibStrings.round
  ] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties] = js.undefined
  var trailColor: js.UndefOr[java.lang.String] = js.undefined
  var trailWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    percent: scala.Double | java.lang.String = null,
    prefixCls: java.lang.String = null,
    strokeColor: java.lang.String = null,
    strokeLinecap: rcDashProgressLib.rcDashProgressLibStrings.butt | rcDashProgressLib.rcDashProgressLibStrings.square | rcDashProgressLib.rcDashProgressLibStrings.round = null,
    strokeWidth: scala.Double | java.lang.String = null,
    style: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties = null,
    trailColor: java.lang.String = null,
    trailWidth: scala.Double | java.lang.String = null
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

