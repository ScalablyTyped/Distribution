package typings.reactNativeMauron85BackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundGeolocationError extends StObject {
  
  var code: Double
  
  var message: String
}
object BackgroundGeolocationError {
  
  inline def apply(code: Double, message: String): BackgroundGeolocationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundGeolocationError]
  }
  
  extension [Self <: BackgroundGeolocationError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
