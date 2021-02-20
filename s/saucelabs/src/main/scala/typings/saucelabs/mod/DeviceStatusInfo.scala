package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.saucelabs.saucelabsStrings.AVAILABLE
import typings.saucelabs.saucelabsStrings.BROKEN
import typings.saucelabs.saucelabsStrings.IN_USE
import typings.saucelabs.saucelabsStrings.OFFLINE
import typings.saucelabs.saucelabsStrings.REBOOTING
import typings.saucelabs.saucelabsStrings.UNPLUGGED
import org.scalablytyped.runtime.StObject
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
  implicit class DeviceStatusInfoMutableBuilder[Self <: DeviceStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: Id): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setPoolId(value: Id): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdUndefined: Self = StObject.set(x, "poolId", js.undefined)
    
    @scala.inline
    def setStatus(value: AVAILABLE | IN_USE | REBOOTING | BROKEN | OFFLINE | UNPLUGGED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
