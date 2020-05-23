package typings.reactChartjs2.mod

import typings.chartJs.mod.ChartLegendOptions
import typings.chartJs.mod.ChartOptions
import typings.chartJs.mod.ChartType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearComponentProps extends ChartComponentProps

object LinearComponentProps {
  @scala.inline
  def apply(
    data: ChartData[typings.chartJs.mod.ChartData],
    datasetKeyProvider: /* any */ js.Any => _ = null,
    getDatasetAtEvent: /* e */ js.Any => Unit = null,
    getElementAtEvent: /* e */ js.Any => Unit = null,
    getElementsAtEvent: /* e */ js.Any => Unit = null,
    height: js.UndefOr[Double] = js.undefined,
    legend: ChartLegendOptions = null,
    onElementsClick: /* e */ js.Any => Unit = null,
    options: ChartOptions = null,
    plugins: js.Array[js.Object] = null,
    redraw: js.UndefOr[Boolean] = js.undefined,
    `type`: ChartType = null,
    width: js.UndefOr[Double] = js.undefined
  ): LinearComponentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (datasetKeyProvider != null) __obj.updateDynamic("datasetKeyProvider")(js.Any.fromFunction1(datasetKeyProvider))
    if (getDatasetAtEvent != null) __obj.updateDynamic("getDatasetAtEvent")(js.Any.fromFunction1(getDatasetAtEvent))
    if (getElementAtEvent != null) __obj.updateDynamic("getElementAtEvent")(js.Any.fromFunction1(getElementAtEvent))
    if (getElementsAtEvent != null) __obj.updateDynamic("getElementsAtEvent")(js.Any.fromFunction1(getElementsAtEvent))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (onElementsClick != null) __obj.updateDynamic("onElementsClick")(js.Any.fromFunction1(onElementsClick))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearComponentProps]
  }
}

