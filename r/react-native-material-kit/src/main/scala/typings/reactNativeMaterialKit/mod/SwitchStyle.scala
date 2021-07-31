package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchStyle extends StObject {
  
  var offColor: js.UndefOr[String] = js.undefined
  
  var onColor: js.UndefOr[String] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
  
  var thumbOffColor: js.UndefOr[String] = js.undefined
  
  var thumbOnColor: js.UndefOr[String] = js.undefined
}
object SwitchStyle {
  
  @scala.inline
  def apply(): SwitchStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchStyle]
  }
  
  @scala.inline
  implicit class SwitchStyleMutableBuilder[Self <: SwitchStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffColor(value: String): Self = StObject.set(x, "offColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffColorUndefined: Self = StObject.set(x, "offColor", js.undefined)
    
    @scala.inline
    def setOnColor(value: String): Self = StObject.set(x, "onColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColorUndefined: Self = StObject.set(x, "onColor", js.undefined)
    
    @scala.inline
    def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
    
    @scala.inline
    def setThumbOffColor(value: String): Self = StObject.set(x, "thumbOffColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbOffColorUndefined: Self = StObject.set(x, "thumbOffColor", js.undefined)
    
    @scala.inline
    def setThumbOnColor(value: String): Self = StObject.set(x, "thumbOnColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbOnColorUndefined: Self = StObject.set(x, "thumbOnColor", js.undefined)
  }
}
