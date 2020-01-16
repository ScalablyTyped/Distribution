package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import typings.reactDashNativeDashChartsDashWrapper.Anon_BarWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarData extends js.Object {
  var config: js.UndefOr[Anon_BarWidth] = js.undefined
  var dataSets: js.UndefOr[js.Array[BarDataset]] = js.undefined
}

object BarData {
  @scala.inline
  def apply(config: Anon_BarWidth = null, dataSets: js.Array[BarDataset] = null): BarData = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarData]
  }
}

