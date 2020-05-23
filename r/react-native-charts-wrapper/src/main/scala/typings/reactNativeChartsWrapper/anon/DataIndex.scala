package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataIndex extends js.Object {
  var dataIndex: js.UndefOr[Double] = js.undefined
  var dataSetIndex: js.UndefOr[Double] = js.undefined
  var stackIndex: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: js.UndefOr[Double] = js.undefined
}

object DataIndex {
  @scala.inline
  def apply(
    x: Double,
    dataIndex: js.UndefOr[Double] = js.undefined,
    dataSetIndex: js.UndefOr[Double] = js.undefined,
    stackIndex: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DataIndex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (!js.isUndefined(dataIndex)) __obj.updateDynamic("dataIndex")(dataIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dataSetIndex)) __obj.updateDynamic("dataSetIndex")(dataSetIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stackIndex)) __obj.updateDynamic("stackIndex")(stackIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
}

