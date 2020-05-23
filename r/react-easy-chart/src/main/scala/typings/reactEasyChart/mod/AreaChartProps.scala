package typings.reactEasyChart.mod

import typings.reactEasyChart.anon.Bottom
import typings.reactEasyChart.anon.Y
import typings.reactEasyChart.reactEasyChartStrings.`basis-closed`
import typings.reactEasyChart.reactEasyChartStrings.`basis-open`
import typings.reactEasyChart.reactEasyChartStrings.`cardinal-closed`
import typings.reactEasyChart.reactEasyChartStrings.`cardinal-open`
import typings.reactEasyChart.reactEasyChartStrings.`linear-closed`
import typings.reactEasyChart.reactEasyChartStrings.`step-after`
import typings.reactEasyChart.reactEasyChartStrings.`step-before`
import typings.reactEasyChart.reactEasyChartStrings.basis
import typings.reactEasyChart.reactEasyChartStrings.bundle
import typings.reactEasyChart.reactEasyChartStrings.cardinal
import typings.reactEasyChart.reactEasyChartStrings.linear
import typings.reactEasyChart.reactEasyChartStrings.monotone
import typings.reactEasyChart.reactEasyChartStrings.step
import typings.reactEasyChart.reactEasyChartStrings.text
import typings.reactEasyChart.reactEasyChartStrings.time
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
    axisLabels: Y = null,
    clickHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    dataPoints: js.UndefOr[Boolean] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    interpolate: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone = null,
    lineColors: js.Array[String] = null,
    margin: Bottom = null,
    mouseMoveHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => _ = null,
    noAreaGradient: js.UndefOr[Boolean] = js.undefined,
    tickTimeDisplayFormat: String = null,
    verticalGrid: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    xDomainRange: js.Array[Date | Double | String] = null,
    xTicks: js.UndefOr[Double] = js.undefined,
    xType: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[Double | String] = null,
    yTicks: js.UndefOr[Double] = js.undefined,
    yType: time | text | linear = null
  ): AreaChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.get.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (!js.isUndefined(dataPoints)) __obj.updateDynamic("dataPoints")(dataPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (!js.isUndefined(noAreaGradient)) __obj.updateDynamic("noAreaGradient")(noAreaGradient.get.asInstanceOf[js.Any])
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalGrid)) __obj.updateDynamic("verticalGrid")(verticalGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (!js.isUndefined(xTicks)) __obj.updateDynamic("xTicks")(xTicks.get.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.get.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (!js.isUndefined(yTicks)) __obj.updateDynamic("yTicks")(yTicks.get.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps]
  }
}

