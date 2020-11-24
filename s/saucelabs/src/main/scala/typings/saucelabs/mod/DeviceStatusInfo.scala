package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.AVAILABLE
import typings.saucelabs.saucelabsStrings.BROKEN
import typings.saucelabs.saucelabsStrings.IN_USE
import typings.saucelabs.saucelabsStrings.OFFLINE
import typings.saucelabs.saucelabsStrings.REBOOTING
import typings.saucelabs.saucelabsStrings.UNPLUGGED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceStatusInfo
  extends /* key */ StringDictionary[js.Any] {
  
  var deviceId: js.UndefOr[Id] = js.native
  
  var poolId: js.UndefOr[Id] = js.native
  
  var status: js.UndefOr[AVAILABLE | IN_USE | REBOOTING | BROKEN | OFFLINE | UNPLUGGED] = js.native
}
object DeviceStatusInfo {
  
  @scala.inline
  def apply(): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusInfo]
  }
  
  @scala.inline
  implicit class DeviceStatusInfoOps[Self <: DeviceStatusInfo] (val x: Self) extends AnyVal {
    
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
    def setDeviceId(value: Id): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setPoolId(value: Id): Self = this.set("poolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolId: Self = this.set("poolId", js.undefined)
    
    @scala.inline
    def setStatus(value: AVAILABLE | IN_USE | REBOOTING | BROKEN | OFFLINE | UNPLUGGED): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
