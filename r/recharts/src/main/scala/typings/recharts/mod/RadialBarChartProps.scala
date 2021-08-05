package typings.recharts.mod

import typings.recharts.rechartsStrings.radial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialBarChartProps
  extends StObject
     with CategoricalChartWrapper[radial] {
  
  var cx: js.UndefOr[String | Double] = js.undefined
  
  var cy: js.UndefOr[String | Double] = js.undefined
  
  var endAngle: js.UndefOr[Double] = js.undefined
  
  var innerRadius: js.UndefOr[String | Double] = js.undefined
  
  var outerRadius: js.UndefOr[String | Double] = js.undefined
  
  var startAngle: js.UndefOr[Double] = js.undefined
}
object RadialBarChartProps {
  
  inline def apply(): RadialBarChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialBarChartProps]
  }
  
  extension [Self <: RadialBarChartProps](x: Self) {
    
    inline def setCx(value: String | Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    inline def setCy(value: String | Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    inline def setInnerRadius(value: String | Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setOuterRadius(value: String | Double): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
  }
}
