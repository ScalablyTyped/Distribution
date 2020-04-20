package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterData extends js.Object {
  var dataSets: js.Array[ScatterDataset]
}

object ScatterData {
  @scala.inline
  def apply(dataSets: js.Array[ScatterDataset]): ScatterData = {
    val __obj = js.Dynamic.literal(dataSets = dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterData]
  }
}

