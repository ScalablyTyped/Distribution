package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial<recharts.recharts.PresentationAttributes<number, number>>) */ trait PolarAngleAxisProps extends EventAttributes {
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
    scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactNs.ReactElement[_]
  ] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var ticks: js.UndefOr[js.Array[PolarAngleAxisTick]] = js.undefined
  var `type`: js.UndefOr[rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category] = js.undefined
}

