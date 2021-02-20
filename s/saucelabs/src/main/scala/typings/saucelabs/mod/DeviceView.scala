package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceView
  extends /* key */ StringDictionary[js.Any] {
  
  var dataCenterId: js.UndefOr[Id] = js.native
  
  var deviceDescriptor: js.UndefOr[DeviceDescriptor] = js.native
}
object DeviceView {
  
  @scala.inline
  def apply(): DeviceView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceView]
  }
  
  @scala.inline
  implicit class DeviceViewMutableBuilder[Self <: DeviceView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataCenterId(value: Id): Self = StObject.set(x, "dataCenterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCenterIdUndefined: Self = StObject.set(x, "dataCenterId", js.undefined)
    
    @scala.inline
    def setDeviceDescriptor(value: DeviceDescriptor): Self = StObject.set(x, "deviceDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDescriptorUndefined: Self = StObject.set(x, "deviceDescriptor", js.undefined)
  }
}
