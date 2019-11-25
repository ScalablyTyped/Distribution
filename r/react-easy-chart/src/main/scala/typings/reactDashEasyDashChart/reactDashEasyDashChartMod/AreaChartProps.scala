package typings.reactDashEasyDashChart.reactDashEasyDashChartMod

import typings.reactDashEasyDashChart.Anon_Bottom
import typings.reactDashEasyDashChart.Anon_XY
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.`basis-closed`
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.`basis-open`
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.`cardinal-closed`
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.`cardinal-open`
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.`linear-closed`
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.`step-after`
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.`step-before`
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.basis
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.bundle
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.cardinal
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.linear
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.monotone
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.step
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.text
import typings.reactDashEasyDashChart.reactDashEasyDashChartStrings.time
import typings.std.Date
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaChartProps extends LineChartProps {
  /** Make the gradient area a solid fill rather than a gradient */
  var noAreaGradient: js.UndefOr[Boolean] = js.undefined
}

object AreaChartProps {
  @scala.inline
  def apply(
    data: js.Array[js.Array[LineData]],
    axes: js.UndefOr[Boolean] = js.undefined,
    axisLabels: Anon_XY = null,
    clickHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    dataPoints: js.UndefOr[Boolean] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    interpolate: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone = null,
    lineColors: js.Array[String] = null,
    margin: Anon_Bottom = null,
    mouseMoveHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    noAreaGradient: js.UndefOr[Boolean] = js.undefined,
    tickTimeDisplayFormat: String = null,
    verticalGrid: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    xDomainRange: js.Array[Date | Double | String] = null,
    xTicks: Int | Double = null,
    xType: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[Double | String] = null,
    yTicks: Int | Double = null,
    yType: time | text | linear = null
  ): AreaChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (!js.isUndefined(dataPoints)) __obj.updateDynamic("dataPoints")(dataPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (!js.isUndefined(noAreaGradient)) __obj.updateDynamic("noAreaGradient")(noAreaGradient.asInstanceOf[js.Any])
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalGrid)) __obj.updateDynamic("verticalGrid")(verticalGrid.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps]
  }
}

