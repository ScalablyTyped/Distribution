package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Angle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineRadarConfig extends StObject {
  
  var drawFilled: js.UndefOr[Boolean] = js.undefined
  
  var fillAlpha: js.UndefOr[Double] = js.undefined
  
  var fillColor: js.UndefOr[Color] = js.undefined
  
  var fillGradient: js.UndefOr[Angle] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object LineRadarConfig {
  
  inline def apply(): LineRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineRadarConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineRadarConfig] (val x: Self) extends AnyVal {
    
    inline def setDrawFilled(value: Boolean): Self = StObject.set(x, "drawFilled", value.asInstanceOf[js.Any])
    
    inline def setDrawFilledUndefined: Self = StObject.set(x, "drawFilled", js.undefined)
    
    inline def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
    
    inline def setFillAlphaUndefined: Self = StObject.set(x, "fillAlpha", js.undefined)
    
    inline def setFillColor(value: Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillGradient(value: Angle): Self = StObject.set(x, "fillGradient", value.asInstanceOf[js.Any])
    
    inline def setFillGradientUndefined: Self = StObject.set(x, "fillGradient", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
