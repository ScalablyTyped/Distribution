package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps extends js.Object {
  var align: js.UndefOr[
    rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.center | rechartsLib.rechartsLibStrings.right
  ] = js.undefined
  var chartHeight: js.UndefOr[scala.Double] = js.undefined
  var chartWidth: js.UndefOr[scala.Double] = js.undefined
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement | ContentRenderer[LegendProps]] = js.undefined
  var formatter: js.UndefOr[LegendValueFormatter] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var iconSize: js.UndefOr[scala.Double] = js.undefined
  var iconType: js.UndefOr[IconType] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var margin: js.UndefOr[stdLib.Partial[Margin]] = js.undefined
  var onBBoxUpdate: js.UndefOr[BBoxUpdateCallback] = js.undefined
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  var payload: js.UndefOr[js.Array[LegendPayload]] = js.undefined
  var verticalAlign: js.UndefOr[
    rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.middle | rechartsLib.rechartsLibStrings.bottom
  ] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}

