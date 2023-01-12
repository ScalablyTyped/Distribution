package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvgCharts.anon.CornerRadius
import typings.reactNativeSvgCharts.anon.PartialPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartData extends StObject {
  
  var arc: js.UndefOr[CornerRadius] = js.undefined
  
  var key: String | Double
  
  var svg: js.UndefOr[PartialPathProps] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object PieChartData {
  
  inline def apply(key: String | Double): PieChartData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieChartData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieChartData] (val x: Self) extends AnyVal {
    
    inline def setArc(value: CornerRadius): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSvg(value: PartialPathProps): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
