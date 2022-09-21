package typings.steamUser.anon

import typings.steamUser.mod.Device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devices extends StObject {
  
  var devices: js.Array[Device]
}
object Devices {
  
  inline def apply(devices: js.Array[Device]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  extension [Self <: Devices](x: Self) {
    
    inline def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
