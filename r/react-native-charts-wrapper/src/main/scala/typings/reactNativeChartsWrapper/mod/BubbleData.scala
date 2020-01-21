package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BubbleData extends js.Object {
  var dataSets: js.UndefOr[js.Array[BubbleDataset]] = js.undefined
}

object BubbleData {
  @scala.inline
  def apply(dataSets: js.Array[BubbleDataset] = null): BubbleData = {
    val __obj = js.Dynamic.literal()
    if (dataSets != null) __obj.updateDynamic("dataSets")(dataSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleData]
  }
}

