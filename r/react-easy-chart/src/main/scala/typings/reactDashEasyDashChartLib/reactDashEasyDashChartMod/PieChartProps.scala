package typings
package reactDashEasyDashChartLib.reactDashEasyDashChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartProps extends js.Object {
  var clickHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent, _]] = js.undefined
  var data: js.Array[reactDashEasyDashChartLib.Anon_Color]
  /** Size in pixels of the inner hole (diameter) */
  var innerHoleSize: js.UndefOr[scala.Double] = js.undefined
  /** Whether to add labels the to pie segments */
  var labels: js.UndefOr[scala.Boolean] = js.undefined
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent, _]] = js.undefined
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent, _]] = js.undefined
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent, _]] = js.undefined
  /** Padding around the chart in pixels */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** Size in pixels in each dimension */
  var size: js.UndefOr[scala.Double] = js.undefined
  var styles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.CSSProperties]
  ] = js.undefined
}

object PieChartProps {
  @scala.inline
  def apply(
    data: js.Array[reactDashEasyDashChartLib.Anon_Color],
    clickHandler: (/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    innerHoleSize: scala.Int | scala.Double = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    mouseMoveHandler: (/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    mouseOutHandler: (/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    mouseOverHandler: (/* data */ PieData, /* mouseEvent */ stdLib.MouseEvent) => _ = null,
    padding: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    styles: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.CSSProperties] = null
  ): PieChartProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2(clickHandler))
    if (innerHoleSize != null) __obj.updateDynamic("innerHoleSize")(innerHoleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2(mouseMoveHandler))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2(mouseOutHandler))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2(mouseOverHandler))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[PieChartProps]
  }
}

