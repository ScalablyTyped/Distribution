package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineData extends js.Object {
  var dataSets: js.UndefOr[js.Array[LineDataset]] = js.undefined
}

object LineData {
  @scala.inline
  def apply(dataSets: js.Array[LineDataset] = null): LineData = {
    val __obj = js.Dynamic.literal()
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineData]
  }
}

