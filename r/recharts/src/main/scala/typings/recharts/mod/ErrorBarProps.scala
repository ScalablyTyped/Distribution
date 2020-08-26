package typings.recharts.mod

import typings.recharts.anon.ErrorVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBarProps extends js.Object {
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var data: js.UndefOr[js.Array[_]] = js.native
  var dataKey: DataKey = js.native
  var dataPointFormatter: js.UndefOr[DataPointFormatter] = js.native
  var layout: js.UndefOr[String] = js.native
  var offset: js.UndefOr[Double] = js.native
  var stroke: js.UndefOr[String] = js.native
  var strokeWidth: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var xAxis: js.UndefOr[js.Object] = js.native
  var yAxis: js.UndefOr[js.Object] = js.native
}

object ErrorBarProps {
  @scala.inline
  def apply(dataKey: DataKey): ErrorBarProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBarProps]
  }
  @scala.inline
  implicit class ErrorBarPropsOps[Self <: ErrorBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = this.set("dataKey", js.Any.fromFunction1(value))
    @scala.inline
    def setDataKey(value: DataKey): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataPointFormatter(value: (/* entry */ js.Any, /* dataKey */ DataKey) => ErrorVal): Self = this.set("dataPointFormatter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataPointFormatter: Self = this.set("dataPointFormatter", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXAxis(value: js.Object): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxis(value: js.Object): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
  }
  
}

