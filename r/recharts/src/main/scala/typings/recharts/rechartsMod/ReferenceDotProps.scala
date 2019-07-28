package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.recharts.Anon_Cx
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number | string, number | string> ]:? recharts.recharts.PresentationAttributes<number | string, number | string>[P]} */ trait ReferenceDotProps extends EventAttributes {
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[Double | String] = js.undefined
  var ifOverflow: js.UndefOr[IfOverflowType] = js.undefined
  var isFront: js.UndefOr[Boolean] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[
    (ContentRenderer[
      EventAttributes with (Partial[PresentationAttributes[Double | String, Double | String]]) with Anon_Cx
    ]) | ReactElement
  ] = js.undefined
  var x: js.UndefOr[Double | String] = js.undefined
  var xAxis: js.UndefOr[ReferenceDotAxisConfiguration] = js.undefined
  var xAxisId: js.UndefOr[String | Double] = js.undefined
  var y: js.UndefOr[Double | String] = js.undefined
  var yAxis: js.UndefOr[ReferenceDotAxisConfiguration] = js.undefined
  var yAxisId: js.UndefOr[String | Double] = js.undefined
}

object ReferenceDotProps {
  @scala.inline
  def apply(
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    className: Double | String = null,
    ifOverflow: IfOverflowType = null,
    isFront: js.UndefOr[Boolean] = js.undefined,
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
    r: Int | Double = null,
    shape: (ContentRenderer[
      EventAttributes with (Partial[PresentationAttributes[Double | String, Double | String]]) with Anon_Cx
    ]) | ReactElement = null,
    x: Double | String = null,
    xAxis: ReferenceDotAxisConfiguration = null,
    xAxisId: String | Double = null,
    y: Double | String = null,
    yAxis: ReferenceDotAxisConfiguration = null,
    yAxisId: String | Double = null
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

