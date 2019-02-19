package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisProps extends EventAttributes {
  var allowDataOverflow: js.UndefOr[scala.Boolean] = js.undefined
  var allowDecimals: js.UndefOr[scala.Boolean] = js.undefined
  var allowDuplicatedCategory: js.UndefOr[scala.Boolean] = js.undefined
  var axisLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var domain: js.UndefOr[js.Tuple2[AxisDomain, AxisDomain]] = js.undefined
  // The height of axis, which need to be set by user
  var height: js.UndefOr[scala.Double] = js.undefined
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[AxisInterval] = js.undefined
  // see label section at http://recharts.org/#/en-US/api/XAxis
  var label: js.UndefOr[java.lang.String | scala.Double | Label | LabelProps] = js.undefined
  var minTickGap: js.UndefOr[scala.Double] = js.undefined
  var mirror: js.UndefOr[scala.Boolean] = js.undefined
  // The name of data displayed in the axis
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The orientation of axis
  var orientation: js.UndefOr[rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.bottom] = js.undefined
  var padding: js.UndefOr[XPadding] = js.undefined
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var textAnchor: js.UndefOr[java.lang.String] = js.undefined
  var tick: js.UndefOr[
    scala.Boolean | ContentRenderer[_] | js.Object | reactLib.reactMod.ReactNs.ReactElement[_]
  ] = js.undefined
  // The count of ticks
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  // The formatter function of tick
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var tickLine: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  // The margin between tick line and the label
  var tickMargin: js.UndefOr[scala.Double] = js.undefined
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  // Ticks can be any type when the axis is the type of category
  // Ticks must be numbers when the axis is the type of number
  var ticks: js.UndefOr[js.Array[_]] = js.undefined
  var `type`: js.UndefOr[rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category] = js.undefined
  // The unit of data displayed in the axis
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The width of axis which is usually calculated internally
  var width: js.UndefOr[scala.Double] = js.undefined
  // The unique id of x-axis
  var xAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

