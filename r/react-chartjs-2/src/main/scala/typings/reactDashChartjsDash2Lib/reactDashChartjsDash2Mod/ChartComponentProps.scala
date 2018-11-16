package typings
package reactDashChartjsDash2Lib.reactDashChartjsDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChartComponentProps extends js.Object {
  var data: ChartData[chartDotJsLib.chartDotJsMod.ChartNs.ChartData]
  var datasetKeyProvider: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.undefined
  var getDatasetAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var getElementAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var getElementsAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var legend: js.UndefOr[chartDotJsLib.chartDotJsMod.ChartNs.ChartLegendOptions] = js.undefined
  var onElementsClick: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
   // alias for getElementsAtEvent (backward compatibility)
  var options: js.UndefOr[chartDotJsLib.chartDotJsMod.ChartNs.ChartOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
  var redraw: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[chartDotJsLib.chartDotJsMod.ChartNs.ChartType] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

