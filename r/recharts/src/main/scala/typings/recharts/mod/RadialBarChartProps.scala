package typings.recharts.mod

import typings.recharts.rechartsStrings.radial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialBarChartProps extends CategoricalChartWrapper[radial] {
  
  var cx: js.UndefOr[String | Double] = js.native
  
  var cy: js.UndefOr[String | Double] = js.native
  
  var endAngle: js.UndefOr[Double] = js.native
  
  var innerRadius: js.UndefOr[String | Double] = js.native
  
  var outerRadius: js.UndefOr[String | Double] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
}
object RadialBarChartProps {
  
  @scala.inline
  def apply(): RadialBarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialBarChartProps]
  }
  
  @scala.inline
  implicit class RadialBarChartPropsMutableBuilder[Self <: RadialBarChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCx(value: String | Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: String | Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: String | Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: String | Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
