package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDescription extends StObject {
  
  var positionX: js.UndefOr[Double] = js.undefined
  
  var positionY: js.UndefOr[Double] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[Color] = js.undefined
  
  var textSize: js.UndefOr[Double] = js.undefined
}
object ChartDescription {
  
  inline def apply(): ChartDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDescription]
  }
  
  extension [Self <: ChartDescription](x: Self) {
    
    inline def setPositionX(value: Double): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
    
    inline def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
    
    inline def setPositionY(value: Double): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
    
    inline def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
