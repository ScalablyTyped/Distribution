package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amazon extends StObject {
  
  var amazon: Phone
  
  var android: Phone
  
  var any: js.Any
  
  var apple: Device
  
  var other: Blackberry
  
  var phone: js.Any
  
  var tablet: js.Any
  
  var windows: Phone
}
object Amazon {
  
  inline def apply(
    amazon: Phone,
    android: Phone,
    any: js.Any,
    apple: Device,
    other: Blackberry,
    phone: js.Any,
    tablet: js.Any,
    windows: Phone
  ): Amazon = {
    val __obj = js.Dynamic.literal(amazon = amazon.asInstanceOf[js.Any], android = android.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], apple = apple.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amazon]
  }
  
  extension [Self <: Amazon](x: Self) {
    
    inline def setAmazon(value: Phone): Self = StObject.set(x, "amazon", value.asInstanceOf[js.Any])
    
    inline def setAndroid(value: Phone): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setAny(value: js.Any): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    inline def setApple(value: Device): Self = StObject.set(x, "apple", value.asInstanceOf[js.Any])
    
    inline def setOther(value: Blackberry): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: js.Any): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setTablet(value: js.Any): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: Phone): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
  }
}
