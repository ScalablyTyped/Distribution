package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial<recharts.recharts.PresentationAttributes<number, number>>) */ trait AreaProps
  extends EventAttributes
     with Animatable {
  var activeDot: js.UndefOr[
    scala.Boolean | js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_]
  ] = js.undefined
  var baseLine: js.UndefOr[scala.Double | js.Array[_]] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var className: js.UndefOr[java.lang.String] = js.undefined
  var connectNulls: js.UndefOr[scala.Boolean] = js.undefined
  var dataKey: DataKey
  var dot: js.UndefOr[
    scala.Boolean | js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[DotProps]
  ] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var isRange: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[
    scala.Boolean | js.Object | ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_]
  ] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var points: js.UndefOr[js.Array[Point]] = js.undefined
  var stackId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var `type`: js.UndefOr[LineType] = js.undefined
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

