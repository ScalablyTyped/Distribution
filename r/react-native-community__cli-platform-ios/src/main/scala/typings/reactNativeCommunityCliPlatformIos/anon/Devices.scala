package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeCommunityCliPlatformIos.buildTypesMod.Device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devices extends StObject {
  
  var devices: StringDictionary[js.Array[Device]]
}
object Devices {
  
  inline def apply(devices: StringDictionary[js.Array[Device]]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: StringDictionary[js.Array[Device]]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
