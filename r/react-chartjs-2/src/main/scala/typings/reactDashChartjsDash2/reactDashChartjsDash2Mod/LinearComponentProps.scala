package typings.reactDashChartjsDash2.reactDashChartjsDash2Mod

import typings.chartDotJs.chartDotJsMod.ChartLegendOptions
import typings.chartDotJs.chartDotJsMod.ChartOptions
import typings.chartDotJs.chartDotJsMod.ChartType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearComponentProps extends ChartComponentProps

object LinearComponentProps {
  @scala.inline
  def apply(
    data: ChartData[typings.chartDotJs.chartDotJsMod.ChartData],
    datasetKeyProvider: /* any */ js.Any => _ = null,
    getDatasetAtEvent: /* e */ js.Any => Unit = null,
    getElementAtEvent: /* e */ js.Any => Unit = null,
    getElementsAtEvent: /* e */ js.Any => Unit = null,
    height: Int | Double = null,
    legend: ChartLegendOptions = null,
    onElementsClick: /* e */ js.Any => Unit = null,
    options: ChartOptions = null,
    plugins: js.Array[js.Object] = null,
    redraw: js.UndefOr[Boolean] = js.undefined,
    `type`: ChartType = null,
    width: Int | Double = null
  ): LinearComponentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (datasetKeyProvider != null) __obj.updateDynamic("datasetKeyProvider")(js.Any.fromFunction1(datasetKeyProvider))
    if (getDatasetAtEvent != null) __obj.updateDynamic("getDatasetAtEvent")(js.Any.fromFunction1(getDatasetAtEvent))
    if (getElementAtEvent != null) __obj.updateDynamic("getElementAtEvent")(js.Any.fromFunction1(getElementAtEvent))
    if (getElementsAtEvent != null) __obj.updateDynamic("getElementsAtEvent")(js.Any.fromFunction1(getElementsAtEvent))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onElementsClick != null) __obj.updateDynamic("onElementsClick")(js.Any.fromFunction1(onElementsClick))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearComponentProps]
  }
}

