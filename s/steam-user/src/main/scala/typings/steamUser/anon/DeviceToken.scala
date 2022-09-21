package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceToken extends StObject {
  
  var deviceToken: String
}
object DeviceToken {
  
  inline def apply(deviceToken: String): DeviceToken = {
    val __obj = js.Dynamic.literal(deviceToken = deviceToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceToken]
  }
  
  extension [Self <: DeviceToken](x: Self) {
    
    inline def setDeviceToken(value: String): Self = StObject.set(x, "deviceToken", value.asInstanceOf[js.Any])
  }
}
