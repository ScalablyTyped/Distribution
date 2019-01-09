package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait PieProps
  extends EventAttributes
     with Animatable {
  var activeIndex: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var activeShape: js.UndefOr[js.Object | ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var blendStroke: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cornerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var cx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var dataKey: DataKey
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var label: js.UndefOr[
    rechartsLib.Anon_OffsetRadius | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | scala.Boolean
  ] = js.undefined
  var labelLine: js.UndefOr[
    js.Object | (ContentRenderer[LineProps with js.Any]) | reactLib.reactMod.ReactNs.ReactElement[_] | scala.Boolean
  ] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var maxRadius: js.UndefOr[scala.Double] = js.undefined
  var minAngle: js.UndefOr[scala.Double] = js.undefined
  var nameKey: js.UndefOr[
    java.lang.String | scala.Double | (js.Function1[/* dataObject */ js.Any, scala.Double])
  ] = js.undefined
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var paddingAngle: js.UndefOr[scala.Double] = js.undefined
  var sectors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  var valueKey: js.UndefOr[
    java.lang.String | scala.Double | (js.Function1[/* dataObject */ js.Any, scala.Double])
  ] = js.undefined
}

