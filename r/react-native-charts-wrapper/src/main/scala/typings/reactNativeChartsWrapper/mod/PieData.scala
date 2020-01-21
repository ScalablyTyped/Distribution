package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieData extends js.Object {
  var dataSets: js.UndefOr[js.Array[PieDataset]] = js.undefined
}

object PieData {
  @scala.inline
  def apply(dataSets: js.Array[PieDataset] = null): PieData = {
    val __obj = js.Dynamic.literal()
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieData]
  }
}

