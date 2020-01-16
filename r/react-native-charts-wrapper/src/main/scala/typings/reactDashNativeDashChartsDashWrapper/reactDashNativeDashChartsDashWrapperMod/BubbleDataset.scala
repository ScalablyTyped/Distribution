package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleDataset extends Dataset {
  var config: js.UndefOr[BubbleDatasetConfig] = js.undefined
  @JSName("label")
  var label_BubbleDataset: String
  var values: js.UndefOr[js.Array[BubbleValue]] = js.undefined
}

object BubbleDataset {
  @scala.inline
  def apply(label: String, config: BubbleDatasetConfig = null, values: js.Array[BubbleValue] = null): BubbleDataset = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleDataset]
  }
}

