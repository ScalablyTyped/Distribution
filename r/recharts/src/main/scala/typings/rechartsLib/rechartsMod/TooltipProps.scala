package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends Animatable {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | reactLib.reactMod.ReactNs.StatelessComponent[_] | ContentRenderer[TooltipProps]
  ] = js.undefined
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  var cursor: js.UndefOr[
    scala.Boolean | js.Object | reactLib.reactMod.ReactNs.ReactElement[_] | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  var filterNull: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  var itemSorter: js.UndefOr[ItemSorter[TooltipPayload]] = js.undefined
  var itemStyle: js.UndefOr[js.Object] = js.undefined
  var label: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var labelFormatter: js.UndefOr[LabelFormatter] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var payload: js.UndefOr[js.Array[TooltipPayload]] = js.undefined
  var position: js.UndefOr[Coordinate] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var useTranslate3d: js.UndefOr[scala.Boolean] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}

