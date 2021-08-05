package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phone extends StObject {
  
  var device: js.Any
  
  var phone: js.Any
  
  var tablet: js.Any
}
object Phone {
  
  inline def apply(device: js.Any, phone: js.Any, tablet: js.Any): Phone = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  
  extension [Self <: Phone](x: Self) {
    
    inline def setDevice(value: js.Any): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: js.Any): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setTablet(value: js.Any): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
  }
}
