package typings.reactNativeSvgCharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartProps[T /* <: PieChartData */]
  extends StObject
     with ChartProps[T] {
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var innerRadius: js.UndefOr[Double | String] = js.undefined
  
  var labelRadius: js.UndefOr[Double | String] = js.undefined
  
  var outerRadius: js.UndefOr[Double | String] = js.undefined
  
  var padAngle: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[SortFunction[T]] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
  
  var valueAccessor: js.UndefOr[AccessorFunction[T, Double]] = js.undefined
}
object PieChartProps {
  
  @scala.inline
  def apply[T /* <: PieChartData */](data: js.Array[T]): PieChartProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartProps[T]]
  }
  
  @scala.inline
  implicit class PieChartPropsMutableBuilder[Self <: PieChartProps[?], T /* <: PieChartData */] (val x: Self & PieChartProps[T]) extends AnyVal {
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | String): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setLabelRadius(value: Double | String): Self = StObject.set(x, "labelRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelRadiusUndefined: Self = StObject.set(x, "labelRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | String): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    @scala.inline
    def setSort(value: (T, T) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setValueAccessor(value: /* props */ AccessorFunctionProps[T] => Double): Self = StObject.set(x, "valueAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueAccessorUndefined: Self = StObject.set(x, "valueAccessor", js.undefined)
  }
}
