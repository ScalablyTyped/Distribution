package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinedData extends js.Object {
  var barData: js.UndefOr[BarData] = js.undefined
  var bubbleData: js.UndefOr[BubbleData] = js.undefined
  var candleData: js.UndefOr[CandleStickData] = js.undefined
  var lineData: js.UndefOr[LineData] = js.undefined
  var scatterData: js.UndefOr[ScatterData] = js.undefined
}

object CombinedData {
  @scala.inline
  def apply(
    barData: BarData = null,
    bubbleData: BubbleData = null,
    candleData: CandleStickData = null,
    lineData: LineData = null,
    scatterData: ScatterData = null
  ): CombinedData = {
    val __obj = js.Dynamic.literal()
    if (barData != null) __obj.updateDynamic("barData")(barData.asInstanceOf[js.Any])
    if (bubbleData != null) __obj.updateDynamic("bubbleData")(bubbleData.asInstanceOf[js.Any])
    if (candleData != null) __obj.updateDynamic("candleData")(candleData.asInstanceOf[js.Any])
    if (lineData != null) __obj.updateDynamic("lineData")(lineData.asInstanceOf[js.Any])
    if (scatterData != null) __obj.updateDynamic("scatterData")(scatterData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedData]
  }
}

