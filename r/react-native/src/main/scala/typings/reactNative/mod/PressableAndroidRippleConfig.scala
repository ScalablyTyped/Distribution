package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressableAndroidRippleConfig extends StObject {
  
  var borderless: js.UndefOr[Null | Boolean] = js.undefined
  
  var color: js.UndefOr[Null | ColorValue] = js.undefined
  
  var foreground: js.UndefOr[Null | Boolean] = js.undefined
  
  var radius: js.UndefOr[Null | Double] = js.undefined
}
object PressableAndroidRippleConfig {
  
  inline def apply(): PressableAndroidRippleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressableAndroidRippleConfig]
  }
  
  extension [Self <: PressableAndroidRippleConfig](x: Self) {
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessNull: Self = StObject.set(x, "borderless", null)
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setForegroundNull: Self = StObject.set(x, "foreground", null)
    
    inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusNull: Self = StObject.set(x, "radius", null)
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
