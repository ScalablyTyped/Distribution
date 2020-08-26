package typings.recharts.mod

import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZAxisProps extends js.Object {
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.native
  // The name of data displayed in the axis
  var name: js.UndefOr[String | Double] = js.native
  // The range of axis
  var range: js.UndefOr[js.Array[Double]] = js.native
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.native
  var `type`: js.UndefOr[number | category] = js.native
  // The unit of data displayed in the axis
  var unit: js.UndefOr[String | Double] = js.native
  // The unique id of z-axis
  var zAxisId: js.UndefOr[String | Double] = js.native
}

object ZAxisProps {
  @scala.inline
  def apply(): ZAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisProps]
  }
  @scala.inline
  implicit class ZAxisPropsOps[Self <: ZAxisProps] (val x: Self) extends AnyVal {
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
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    @scala.inline
    def setName(value: String | Double): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setScaleFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("scale", js.Any.fromFunction1(value))
    @scala.inline
    def setScale(value: ScaleType | RechartsFunction): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setType(value: number | category): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnit(value: String | Double): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setZAxisId(value: String | Double): Self = this.set("zAxisId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZAxisId: Self = this.set("zAxisId", js.undefined)
  }
  
}

