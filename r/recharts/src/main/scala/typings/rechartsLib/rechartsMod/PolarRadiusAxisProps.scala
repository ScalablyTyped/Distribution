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

