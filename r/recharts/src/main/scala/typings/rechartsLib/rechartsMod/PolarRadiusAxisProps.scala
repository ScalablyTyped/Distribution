package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait PolarRadiusAxisProps extends EventAttributes {
  var allowDataOverflow: js.UndefOr[scala.Boolean] = js.undefined
  var angle: js.UndefOr[scala.Double] = js.undefined
  var axisLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var cx: js.UndefOr[scala.Double] = js.undefined
  var cy: js.UndefOr[scala.Double] = js.undefined
  var domain: js.UndefOr[js.Tuple2[PolarRadiusAxisDomain, PolarRadiusAxisDomain]] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[
    rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.right | rechartsLib.rechartsLibStrings.middle
  ] = js.undefined
  var radiusAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var tick: js.UndefOr[
    scala.Boolean | js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_]
  ] = js.undefined
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var ticks: js.UndefOr[js.Array[PolarRadiusAxisTick]] = js.undefined
  var `type`: js.UndefOr[rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category] = js.undefined
}

object PolarRadiusAxisProps {
  @scala.inline
  def apply(
    allowDataOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    angle: scala.Int | scala.Double = null,
    axisLine: scala.Boolean | js.Object = null,
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    domain: js.Tuple2[PolarRadiusAxisDomain, PolarRadiusAxisDomain] = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
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
    orientation: rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.right | rechartsLib.rechartsLibStrings.middle = null,
    radiusAxisId: java.lang.String | scala.Double = null,
    scale: ScaleType | RechartsFunction = null,
    stroke: java.lang.String = null,
    tick: scala.Boolean | js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] = null,
    tickCount: scala.Int | scala.Double = null,
    tickFormatter: TickFormatterFunction = null,
    ticks: js.Array[PolarRadiusAxisTick] = null,
    `type`: rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category = null
  ): PolarRadiusAxisProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDataOverflow)) __obj.updateDynamic("allowDataOverflow")(allowDataOverflow)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
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
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (radiusAxisId != null) __obj.updateDynamic("radiusAxisId")(radiusAxisId.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(tickFormatter)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarRadiusAxisProps]
  }
}

