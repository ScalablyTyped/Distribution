package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Digits extends StObject {
  
  var digits: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var markerColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.native
  
  var textColor: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.native
  
  var textSize: js.UndefOr[Double] = js.native
}
object Digits {
  
  @scala.inline
  def apply(): Digits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digits]
  }
  
  @scala.inline
  implicit class DigitsMutableBuilder[Self <: Digits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMarkerColor(value: typings.reactNativeChartsWrapper.mod.Color): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: typings.reactNativeChartsWrapper.mod.Color): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
  }
}
