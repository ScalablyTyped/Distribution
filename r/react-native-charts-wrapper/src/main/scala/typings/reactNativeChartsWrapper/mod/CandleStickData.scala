package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandleStickData extends js.Object {
  var dataSets: js.UndefOr[js.Array[CandleStickDataset]] = js.undefined
}

object CandleStickData {
  @scala.inline
  def apply(dataSets: js.Array[CandleStickDataset] = null): CandleStickData = {
    val __obj = js.Dynamic.literal()
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickData]
  }
}

