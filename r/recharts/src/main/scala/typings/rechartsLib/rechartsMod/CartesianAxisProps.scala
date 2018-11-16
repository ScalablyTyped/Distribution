package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ 
trait CartesianAxisProps extends EventAttributes {
  var axisLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var interval: js.UndefOr[AxisInterval] = js.undefined
  var minTickGap: js.UndefOr[scala.Double] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[
    rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.bottom | rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.right
  ] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var tick: js.UndefOr[
    scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactNs.ReactElement[_]
  ] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var ticksGenerator: js.UndefOr[TickGeneratorFunction] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

