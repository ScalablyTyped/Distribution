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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceStatusInfo
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var deviceId: js.UndefOr[Id] = js.undefined
  
  var poolId: js.UndefOr[Id] = js.undefined
  
  var status: js.UndefOr[AVAILABLE | IN_USE | REBOOTING | BROKEN | OFFLINE | UNPLUGGED] = js.undefined
}
object DeviceStatusInfo {
  
  inline def apply(): DeviceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceStatusInfo]
  }
  
  extension [Self <: DeviceStatusInfo](x: Self) {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setPoolId(value: Id): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "poolId", js.undefined)
    
    inline def setStatus(value: AVAILABLE | IN_USE | REBOOTING | BROKEN | OFFLINE | UNPLUGGED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
