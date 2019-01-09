package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartProps extends js.Object {
  var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  var data: js.Array[reactDashEasyDashChartLib.Anon_Color]
  /** Size in pixels of the inner hole (diameter) */
  var innerHoleSize: js.UndefOr[scala.Double] = js.undefined
  /** Whether to add labels the to pie segments */
  var labels: js.UndefOr[scala.Boolean] = js.undefined
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ reactLib.MouseEvent, _]] = js.undefined
  /** Padding around the chart in pixels */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** Size in pixels in each dimension */
  var size: js.UndefOr[scala.Double] = js.undefined
  var styles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.CSSProperties]
  ] = js.undefined
}

