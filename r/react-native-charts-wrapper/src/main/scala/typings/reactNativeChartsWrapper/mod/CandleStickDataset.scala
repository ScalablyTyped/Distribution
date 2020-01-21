package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandleStickDataset extends Dataset {
  var config: js.UndefOr[CandleStickDatasetConfig] = js.undefined
  @JSName("label")
  var label_CandleStickDataset: String
  var values: js.UndefOr[js.Array[CandleStickValue]] = js.undefined
}

object CandleStickDataset {
  @scala.inline
  def apply(label: String, config: CandleStickDatasetConfig = null, values: js.Array[CandleStickValue] = null): CandleStickDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickDataset]
  }
}

