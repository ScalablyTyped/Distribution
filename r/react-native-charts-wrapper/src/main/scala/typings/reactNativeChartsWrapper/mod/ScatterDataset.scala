package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterDataset extends Dataset {
  var config: js.UndefOr[ScatterDatasetConfig] = js.undefined
  @JSName("label")
  var label_ScatterDataset: String
  var values: js.UndefOr[js.Array[LineValue | Double]] = js.undefined
}

object ScatterDataset {
  @scala.inline
  def apply(label: String, config: ScatterDatasetConfig = null, values: js.Array[LineValue | Double] = null): ScatterDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterDataset]
  }
}

