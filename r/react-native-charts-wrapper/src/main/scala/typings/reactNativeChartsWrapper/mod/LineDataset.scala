package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineDataset extends Dataset {
  var config: js.UndefOr[LineDatasetConfig] = js.undefined
  var values: js.UndefOr[js.Array[Double | LineValue]] = js.undefined
}

object LineDataset {
  @scala.inline
  def apply(
    config: LineDatasetConfig = null,
    label: String = null,
    values: js.Array[Double | LineValue] = null
  ): LineDataset = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDataset]
  }
}

