package typings
package reactDashChartjsDash2Lib.reactDashChartjsDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearComponentProps extends ChartComponentProps

object LinearComponentProps {
  @scala.inline
  def apply(
    data: ChartData[chartDotJsLib.chartDotJsMod.ChartData],
    datasetKeyProvider: /* any */ js.Any => _ = null,
    getDatasetAtEvent: /* e */ js.Any => scala.Unit = null,
    getElementAtEvent: /* e */ js.Any => scala.Unit = null,
    getElementsAtEvent: /* e */ js.Any => scala.Unit = null,
    height: scala.Int | scala.Double = null,
    legend: chartDotJsLib.chartDotJsMod.ChartLegendOptions = null,
    onElementsClick: /* e */ js.Any => scala.Unit = null,
    options: chartDotJsLib.chartDotJsMod.ChartOptions = null,
    plugins: js.Array[js.Object] = null,
    redraw: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: chartDotJsLib.chartDotJsMod.ChartType = null,
    width: scala.Int | scala.Double = null
  ): LinearComponentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (datasetKeyProvider != null) __obj.updateDynamic("datasetKeyProvider")(js.Any.fromFunction1(datasetKeyProvider))
    if (getDatasetAtEvent != null) __obj.updateDynamic("getDatasetAtEvent")(js.Any.fromFunction1(getDatasetAtEvent))
    if (getElementAtEvent != null) __obj.updateDynamic("getElementAtEvent")(js.Any.fromFunction1(getElementAtEvent))
    if (getElementsAtEvent != null) __obj.updateDynamic("getElementsAtEvent")(js.Any.fromFunction1(getElementsAtEvent))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (onElementsClick != null) __obj.updateDynamic("onElementsClick")(js.Any.fromFunction1(onElementsClick))
    if (options != null) __obj.updateDynamic("options")(options)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearComponentProps]
  }
}

