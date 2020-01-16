package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieDataset extends Dataset {
  var config: js.UndefOr[PieDatasetConfig] = js.undefined
  @JSName("label")
  var label_PieDataset: String
  var values: js.UndefOr[js.Array[PieValue | Double]] = js.undefined
}

object PieDataset {
  @scala.inline
  def apply(label: String, config: PieDatasetConfig = null, values: js.Array[PieValue | Double] = null): PieDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieDataset]
  }
}

