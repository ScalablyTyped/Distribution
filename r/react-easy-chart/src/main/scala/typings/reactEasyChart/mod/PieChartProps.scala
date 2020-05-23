package typings.reactEasyChart.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactEasyChart.anon.Color
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartProps extends js.Object {
  var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var data: js.Array[Color]
  /** Size in pixels of the inner hole (diameter) */
  var innerHoleSize: js.UndefOr[Double] = js.undefined
  /** Whether to add labels the to pie segments */
  var labels: js.UndefOr[Boolean] = js.undefined
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  /** Padding around the chart in pixels */
  var padding: js.UndefOr[Double] = js.undefined
  /** Size in pixels in each dimension */
  var size: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[StringDictionary[CSSProperties]] = js.undefined
}

object PieChartProps {
  @scala.inline
  def apply(
    data: js.Array[Color],
    clickHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    innerHoleSize: js.UndefOr[Double] = js.undefined,
    labels: js.UndefOr[Boolean] = js.undefined,
    mouseMoveHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ PieData, /* mouseEvent */ MouseEvent) => _ = null,
    padding: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    styles: StringDictionary[CSSProperties] = null
  ): PieChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (!js.isUndefined(innerHoleSize)) __obj.updateDynamic("innerHoleSize")(innerHoleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.get.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartProps]
  }
}

