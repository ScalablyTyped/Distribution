package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var lineColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object Enabled {
  
  inline def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLineColor(value: typings.reactNativeChartsWrapper.mod.Color): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
