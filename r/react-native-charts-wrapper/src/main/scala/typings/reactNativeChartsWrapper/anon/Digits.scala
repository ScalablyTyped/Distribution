package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digits extends StObject {
  
  var digits: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var markerColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  
  var textColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  
  var textSize: js.UndefOr[Double] = js.undefined
}
object Digits {
  
  inline def apply(): Digits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Digits] (val x: Self) extends AnyVal {
    
    inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMarkerColor(value: typings.reactNativeChartsWrapper.mod.Color): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    inline def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    inline def setTextColor(value: typings.reactNativeChartsWrapper.mod.Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
  }
}
