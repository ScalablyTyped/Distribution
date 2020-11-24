package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class DeviceViewOps[Self <: DeviceView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataCenterId(value: Id): Self = this.set("dataCenterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCenterId: Self = this.set("dataCenterId", js.undefined)
    
    @scala.inline
    def setDeviceDescriptor(value: DeviceDescriptor): Self = this.set("deviceDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceDescriptor: Self = this.set("deviceDescriptor", js.undefined)
  }
}
