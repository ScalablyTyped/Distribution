package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconToggleStyle extends StObject {
  
  var offColor: js.UndefOr[String] = js.undefined
  
  var onColor: js.UndefOr[String] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
}
object IconToggleStyle {
  
  @scala.inline
  def apply(): IconToggleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconToggleStyle]
  }
  
  @scala.inline
  implicit class IconToggleStyleMutableBuilder[Self <: IconToggleStyle] (val x: Self) extends AnyVal {
    
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
  }
}
