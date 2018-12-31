package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial<recharts.recharts.PresentationAttributes<number, number>>) */ trait RadialBarProps
  extends EventAttributes
     with Animatable {
  var activeShape: js.UndefOr[js.Object | ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var angleAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var background: js.UndefOr[
    scala.Boolean | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | js.Object
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cornerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[RadialBarData]] = js.undefined
  var dataKey: DataKey
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[
    scala.Boolean | reactLib.reactMod.ReactNs.ReactElement[_] | ContentRenderer[_] | js.Object
  ] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var maxBarSize: js.UndefOr[scala.Double] = js.undefined
  var minPointSize: js.UndefOr[scala.Double] = js.undefined
  var radiusAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var shape: js.UndefOr[ContentRenderer[_] | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

