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
    ]) | reactLib.reactMod.ReactNs.ReactElement
  ] = js.undefined
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var xAxis: js.UndefOr[ReferenceDotAxisConfiguration] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var yAxis: js.UndefOr[ReferenceDotAxisConfiguration] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

