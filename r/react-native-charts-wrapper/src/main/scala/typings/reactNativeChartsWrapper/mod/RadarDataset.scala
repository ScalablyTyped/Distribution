package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarDataset extends Dataset {
  var config: js.UndefOr[RadarDatasetConfig] = js.undefined
  @JSName("label")
  var label_RadarDataset: String
  var values: js.UndefOr[js.Array[Value | Double]] = js.undefined
}

object RadarDataset {
  @scala.inline
  def apply(label: String, config: RadarDatasetConfig = null, values: js.Array[Value | Double] = null): RadarDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarDataset]
  }
}

