package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDevicesResponse extends StObject {
  
  var devices: js.Array[UserDevice]
}
object UserDevicesResponse {
  
  inline def apply(devices: js.Array[UserDevice]): UserDevicesResponse = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDevicesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDevicesResponse] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: js.Array[UserDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: UserDevice*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
