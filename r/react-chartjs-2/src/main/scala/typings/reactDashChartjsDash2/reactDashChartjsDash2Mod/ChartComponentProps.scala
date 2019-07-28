package typings.reactDashChartjsDash2.reactDashChartjsDash2Mod

import typings.chartDotJs.chartDotJsMod.ChartLegendOptions
import typings.chartDotJs.chartDotJsMod.ChartOptions
import typings.chartDotJs.chartDotJsMod.ChartType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartComponentProps extends js.Object {
  var data: ChartData[typings.chartDotJs.chartDotJsMod.ChartData]
  var datasetKeyProvider: js.UndefOr[js.Function1[/* any */ js.Any, _]] = js.undefined
  var getDatasetAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var getElementAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var getElementsAtEvent: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var legend: js.UndefOr[ChartLegendOptions] = js.undefined
  var onElementsClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
   // alias for getElementsAtEvent (backward compatibility)
  var options: js.UndefOr[ChartOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[js.Object]] = js.undefined
  var redraw: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[ChartType] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartComponentProps {
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
  ): ChartComponentProps = {
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
    __obj.asInstanceOf[ChartComponentProps]
  }
}

