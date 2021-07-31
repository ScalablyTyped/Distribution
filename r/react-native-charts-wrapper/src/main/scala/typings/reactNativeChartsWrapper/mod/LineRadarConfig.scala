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
  
  @scala.inline
  def apply(): LineRadarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineRadarConfig]
  }
  
  @scala.inline
  implicit class LineRadarConfigMutableBuilder[Self <: LineRadarConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawFilled(value: Boolean): Self = StObject.set(x, "drawFilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawFilledUndefined: Self = StObject.set(x, "drawFilled", js.undefined)
    
    @scala.inline
    def setFillAlpha(value: Double): Self = StObject.set(x, "fillAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillAlphaUndefined: Self = StObject.set(x, "fillAlpha", js.undefined)
    
    @scala.inline
    def setFillColor(value: Color): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setFillGradient(value: Angle): Self = StObject.set(x, "fillGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillGradientUndefined: Self = StObject.set(x, "fillGradient", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
