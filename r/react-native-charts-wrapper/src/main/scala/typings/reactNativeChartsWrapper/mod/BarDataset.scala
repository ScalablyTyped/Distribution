package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarDataset extends Dataset {
  var config: js.UndefOr[BarDatasetConfig] = js.undefined
  var values: js.UndefOr[js.Array[BarValue | Double | js.Array[Double]]] = js.undefined
}

object BarDataset {
  @scala.inline
  def apply(
    config: BarDatasetConfig = null,
    label: String = null,
    values: js.Array[BarValue | Double | js.Array[Double]] = null
  ): BarDataset = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarDataset]
  }
}

