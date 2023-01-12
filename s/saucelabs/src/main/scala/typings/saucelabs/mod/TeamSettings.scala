package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamSettings
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var live_only: js.UndefOr[Boolean] = js.undefined
  
  var real_devices: js.UndefOr[Double] = js.undefined
  
  var virtual_machines: js.UndefOr[Double] = js.undefined
}
object TeamSettings {
  
  inline def apply(): TeamSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamSettings] (val x: Self) extends AnyVal {
    
    inline def setLive_only(value: Boolean): Self = StObject.set(x, "live_only", value.asInstanceOf[js.Any])
    
    inline def setLive_onlyUndefined: Self = StObject.set(x, "live_only", js.undefined)
    
    inline def setReal_devices(value: Double): Self = StObject.set(x, "real_devices", value.asInstanceOf[js.Any])
    
    inline def setReal_devicesUndefined: Self = StObject.set(x, "real_devices", js.undefined)
    
    inline def setVirtual_machines(value: Double): Self = StObject.set(x, "virtual_machines", value.asInstanceOf[js.Any])
    
    inline def setVirtual_machinesUndefined: Self = StObject.set(x, "virtual_machines", js.undefined)
  }
}
