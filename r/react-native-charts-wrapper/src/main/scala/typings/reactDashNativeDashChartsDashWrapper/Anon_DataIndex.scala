package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIndex extends js.Object {
  var dataIndex: js.UndefOr[Double] = js.undefined
  var dataSetIndex: js.UndefOr[Double] = js.undefined
  var stackIndex: js.UndefOr[Double] = js.undefined
  var x: Double
  var y: js.UndefOr[Double] = js.undefined
}

object Anon_DataIndex {
  @scala.inline
  def apply(
    x: Double,
    dataIndex: Int | Double = null,
    dataSetIndex: Int | Double = null,
    stackIndex: Int | Double = null,
    y: Int | Double = null
  ): Anon_DataIndex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (dataSetIndex != null) __obj.updateDynamic("dataSetIndex")(dataSetIndex.asInstanceOf[js.Any])
    if (stackIndex != null) __obj.updateDynamic("stackIndex")(stackIndex.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataIndex]
  }
}

