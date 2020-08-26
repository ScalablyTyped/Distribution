package typings.reactNativeSvgCharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChartProps[T] extends ChartProps[T] {
  var spacingInner: js.UndefOr[Double] = js.native
  var spacingOuter: js.UndefOr[Double] = js.native
}

object BarChartProps {
  @scala.inline
  def apply[T](data: js.Array[T]): BarChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarChartProps[T]]
  }
  @scala.inline
  implicit class BarChartPropsOps[Self <: BarChartProps[_], T] (val x: Self with BarChartProps[T]) extends AnyVal {
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
    def setSpacingInner(value: Double): Self = this.set("spacingInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacingInner: Self = this.set("spacingInner", js.undefined)
    @scala.inline
    def setSpacingOuter(value: Double): Self = this.set("spacingOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacingOuter: Self = this.set("spacingOuter", js.undefined)
  }
  
}

