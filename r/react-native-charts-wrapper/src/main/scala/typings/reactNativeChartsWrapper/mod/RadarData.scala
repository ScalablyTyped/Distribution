package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarData extends js.Object {
  var dataSets: js.UndefOr[js.Array[RadarDataset]] = js.undefined
  var labels: js.UndefOr[js.Array[String]] = js.undefined
}

object RadarData {
  @scala.inline
  def apply(dataSets: js.Array[RadarDataset] = null, labels: js.Array[String] = null): RadarData = {
    val __obj = js.Dynamic.literal()
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarData]
  }
}

