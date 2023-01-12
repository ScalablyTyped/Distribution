package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceView
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dataCenterId: js.UndefOr[Id] = js.undefined
  
  var deviceDescriptor: js.UndefOr[DeviceDescriptor] = js.undefined
}
object DeviceView {
  
  inline def apply(): DeviceView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceView] (val x: Self) extends AnyVal {
    
    inline def setDataCenterId(value: Id): Self = StObject.set(x, "dataCenterId", value.asInstanceOf[js.Any])
    
    inline def setDataCenterIdUndefined: Self = StObject.set(x, "dataCenterId", js.undefined)
    
    inline def setDeviceDescriptor(value: DeviceDescriptor): Self = StObject.set(x, "deviceDescriptor", value.asInstanceOf[js.Any])
    
    inline def setDeviceDescriptorUndefined: Self = StObject.set(x, "deviceDescriptor", js.undefined)
  }
}
