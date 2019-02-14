package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait ScatterProps
  extends EventAttributes
     with Animatable {
  var activeIndex: js.UndefOr[scala.Double] = js.undefined
  var activeShape: js.UndefOr[js.Object | RechartsFunction | reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var legendType: js.UndefOr[LegendType] = js.undefined
  var line: js.UndefOr[
    scala.Boolean | js.Object | RechartsFunction | reactLib.reactMod.ReactNs.ReactElement
  ] = js.undefined
  var lineJointType: js.UndefOr[LineType] = js.undefined
  var lineType: js.UndefOr[rechartsLib.rechartsLibStrings.joint | rechartsLib.rechartsLibStrings.fitting] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var points: js.UndefOr[js.Array[ScatterPoint]] = js.undefined
  var shape: js.UndefOr[
    rechartsLib.rechartsLibStrings.circle | rechartsLib.rechartsLibStrings.cross | rechartsLib.rechartsLibStrings.diamond | rechartsLib.rechartsLibStrings.square | rechartsLib.rechartsLibStrings.star | rechartsLib.rechartsLibStrings.triangle | rechartsLib.rechartsLibStrings.wye | reactLib.reactMod.ReactNs.ReactElement | ContentRenderer[_]
  ] = js.undefined
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var yAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var zAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

