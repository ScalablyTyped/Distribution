package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait BarProps
  extends EventAttributes
     with Animatable {
  var barSize: js.UndefOr[scala.Double] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[BarData]] = js.undefined
  var dataKey: DataKey
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  // see label section at http://recharts.org/#/en-US/api/Bar
  var label: js.UndefOr[
    scala.Boolean | Label | reactLib.reactMod.ReactNs.SFC[LabelProps] | reactLib.reactMod.ReactNs.ReactElement[LabelProps] | ContentRenderer[_]
  ] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var maxBarSize: js.UndefOr[scala.Double] = js.undefined
  var minPointSize: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var shape: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[RectangleProps]] = js.undefined
  var stackId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

