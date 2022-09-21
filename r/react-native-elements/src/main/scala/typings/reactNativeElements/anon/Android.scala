package typings.reactNativeElements.anon

import typings.reactNativeElements.colorsMod.PlatformColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Android extends StObject {
  
  var default: PlatformColors
  
  var android: PlatformColors
  
  var ios: PlatformColors
  
  var web: PlatformColors
}
object Android {
  
  inline def apply(android: PlatformColors, default: PlatformColors, ios: PlatformColors, web: PlatformColors): Android = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
  
  extension [Self <: Android](x: Self) {
    
    inline def setAndroid(value: PlatformColors): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: PlatformColors): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setIos(value: PlatformColors): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setWeb(value: PlatformColors): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
  }
}
