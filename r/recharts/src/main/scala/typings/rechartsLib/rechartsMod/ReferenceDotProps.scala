package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number | string, number | string> ]:? recharts.recharts.PresentationAttributes<number | string, number | string>[P]} */ trait ReferenceDotProps extends EventAttributes {
  var alwaysShow: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var ifOverflow: js.UndefOr[IfOverflowType] = js.undefined
  var isFront: js.UndefOr[scala.Boolean] = js.undefined
  var r: js.UndefOr[scala.Double] = js.undefined
  var shape: js.UndefOr[
    (ContentRenderer[
      EventAttributes with (stdLib.Partial[
        PresentationAttributes[scala.Double | java.lang.String, scala.Double | java.lang.String]
      ]) with rechartsLib.Anon_Cx
    ]) | reactLib.reactMod.ReactNs.ReactElement[_]
  ] = js.undefined
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var xAxis: js.UndefOr[ReferenceDotAxisConfiguration] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var yAxis: js.UndefOr[ReferenceDotAxisConfiguration] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ReferenceDotProps {
  @scala.inline
  def apply(
    alwaysShow: js.UndefOr[scala.Boolean] = js.undefined,
    className: scala.Double | java.lang.String = null,
    ifOverflow: IfOverflowType = null,
    isFront: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: RechartsFunction = null,
    onMouseDown: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    onMouseMove: RechartsFunction = null,
    onMouseOut: RechartsFunction = null,
    onMouseOver: RechartsFunction = null,
    onMouseUp: RechartsFunction = null,
    onTouchCancel: RechartsFunction = null,
    onTouchEnd: RechartsFunction = null,
    onTouchMove: RechartsFunction = null,
    onTouchStart: RechartsFunction = null,
    r: scala.Int | scala.Double = null,
    shape: (ContentRenderer[
      EventAttributes with (stdLib.Partial[
        PresentationAttributes[scala.Double | java.lang.String, scala.Double | java.lang.String]
      ]) with rechartsLib.Anon_Cx
    ]) | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    x: scala.Double | java.lang.String = null,
    xAxis: ReferenceDotAxisConfiguration = null,
    xAxisId: java.lang.String | scala.Double = null,
    y: scala.Double | java.lang.String = null,
    yAxis: ReferenceDotAxisConfiguration = null,
    yAxisId: java.lang.String | scala.Double = null
  ): ReferenceDotProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (ifOverflow != null) __obj.updateDynamic("ifOverflow")(ifOverflow)
    if (!js.isUndefined(isFront)) __obj.updateDynamic("isFront")(isFront)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (xAxisId != null) __obj.updateDynamic("xAxisId")(xAxisId.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    if (yAxisId != null) __obj.updateDynamic("yAxisId")(yAxisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDotProps]
  }
}

