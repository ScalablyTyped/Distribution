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

object ChartComponentProps {
  @scala.inline
  def apply(
    data: ChartData[chartDotJsLib.chartDotJsMod.ChartNs.ChartData],
    datasetKeyProvider: js.Function1[/* any */ js.Any, _] = null,
    getDatasetAtEvent: js.Function1[/* e */ js.Any, scala.Unit] = null,
    getElementAtEvent: js.Function1[/* e */ js.Any, scala.Unit] = null,
    getElementsAtEvent: js.Function1[/* e */ js.Any, scala.Unit] = null,
    height: scala.Int | scala.Double = null,
    legend: chartDotJsLib.chartDotJsMod.ChartNs.ChartLegendOptions = null,
    onElementsClick: js.Function1[/* e */ js.Any, scala.Unit] = null,
    options: chartDotJsLib.chartDotJsMod.ChartNs.ChartOptions = null,
    plugins: js.Array[js.Object] = null,
    redraw: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: chartDotJsLib.chartDotJsMod.ChartNs.ChartType = null,
    width: scala.Int | scala.Double = null
  ): ChartComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datasetKeyProvider != null) __obj.updateDynamic("datasetKeyProvider")(datasetKeyProvider)
    if (getDatasetAtEvent != null) __obj.updateDynamic("getDatasetAtEvent")(getDatasetAtEvent)
    if (getElementAtEvent != null) __obj.updateDynamic("getElementAtEvent")(getElementAtEvent)
    if (getElementsAtEvent != null) __obj.updateDynamic("getElementsAtEvent")(getElementsAtEvent)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (onElementsClick != null) __obj.updateDynamic("onElementsClick")(onElementsClick)
    if (options != null) __obj.updateDynamic("options")(options)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartComponentProps]
  }
}

