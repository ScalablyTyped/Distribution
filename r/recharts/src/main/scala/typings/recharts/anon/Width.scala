package typings.recharts.anon

import typings.recharts.mod.ChartOffset
import typings.recharts.mod.XAxisProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[ChartOffset] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var xAxis: js.UndefOr[XAxisProps] = js.undefined
}
object Width {
  
  inline def apply(): Width = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOffset(value: ChartOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXAxis(value: XAxisProps): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
  }
}
