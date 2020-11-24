package typings.reactNativeSvgCharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartProps[T /* <: PieChartData */] extends ChartProps[T] {
  
  var endAngle: js.UndefOr[Double] = js.native
  
  var innerRadius: js.UndefOr[Double | String] = js.native
  
  var labelRadius: js.UndefOr[Double | String] = js.native
  
  var outerRadius: js.UndefOr[Double | String] = js.native
  
  var padAngle: js.UndefOr[Double] = js.native
  
  var sort: js.UndefOr[SortFunction[T]] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
  
  var valueAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.native
}
object PieChartProps {
  
  @scala.inline
  def apply[T /* <: PieChartData */](data: js.Array[T]): PieChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartProps[T]]
  }
  
  @scala.inline
  implicit class PieChartPropsOps[Self <: PieChartProps[_], T /* <: PieChartData */] (val x: Self with PieChartProps[T]) extends AnyVal {
    
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
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | String): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    
    @scala.inline
    def setLabelRadius(value: Double | String): Self = this.set("labelRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelRadius: Self = this.set("labelRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | String): Self = this.set("outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterRadius: Self = this.set("outerRadius", js.undefined)
    
    @scala.inline
    def setPadAngle(value: Double): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadAngle: Self = this.set("padAngle", js.undefined)
    
    @scala.inline
    def setSort(value: (T, T) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setValueAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = this.set("valueAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValueAccessor: Self = this.set("valueAccessor", js.undefined)
  }
}
