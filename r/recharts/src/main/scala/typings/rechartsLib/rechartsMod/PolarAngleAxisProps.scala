package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait PolarAngleAxisProps extends EventAttributes {
  var angleAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
   // this seems not being used by the lib.
  var axisLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var axisLineType: js.UndefOr[rechartsLib.rechartsLibStrings.polygon | rechartsLib.rechartsLibStrings.circle] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var cx: js.UndefOr[scala.Double] = js.undefined
  var cy: js.UndefOr[scala.Double] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[rechartsLib.rechartsLibStrings.inner | rechartsLib.rechartsLibStrings.outer] = js.undefined
  var radius: js.UndefOr[Percentage | scala.Double] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var tick: js.UndefOr[
    scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactElement[_]
  ] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var ticks: js.UndefOr[js.Array[PolarAngleAxisTick]] = js.undefined
  var `type`: js.UndefOr[rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category] = js.undefined
}

object PolarAngleAxisProps {
  @scala.inline
  def apply(
    angleAxisId: java.lang.String | scala.Double = null,
    axisLine: scala.Boolean | js.Object = null,
    axisLineType: rechartsLib.rechartsLibStrings.polygon | rechartsLib.rechartsLibStrings.circle = null,
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    dataKey: DataKey = null,
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
    orientation: rechartsLib.rechartsLibStrings.inner | rechartsLib.rechartsLibStrings.outer = null,
    radius: Percentage | scala.Double = null,
    scale: ScaleType | RechartsFunction = null,
    stroke: java.lang.String = null,
    tick: scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactElement[_] = null,
    tickFormatter: TickFormatterFunction = null,
    tickLine: scala.Boolean | js.Object = null,
    ticks: js.Array[PolarAngleAxisTick] = null,
    `type`: rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category = null
  ): PolarAngleAxisProps = {
    val __obj = js.Dynamic.literal()
    if (angleAxisId != null) __obj.updateDynamic("angleAxisId")(angleAxisId.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (axisLineType != null) __obj.updateDynamic("axisLineType")(axisLineType.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
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
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(tickFormatter)
    if (tickLine != null) __obj.updateDynamic("tickLine")(tickLine.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarAngleAxisProps]
  }
}

