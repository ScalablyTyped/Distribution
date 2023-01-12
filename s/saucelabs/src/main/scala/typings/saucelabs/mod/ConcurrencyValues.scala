package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcurrencyValues
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var id: js.UndefOr[String] = js.undefined
  
  var mac_vms: js.UndefOr[Double] = js.undefined
  
  var rds: js.UndefOr[Double] = js.undefined
  
  var vms: js.UndefOr[Double] = js.undefined
}
object ConcurrencyValues {
  
  inline def apply(): ConcurrencyValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrencyValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConcurrencyValues] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMac_vms(value: Double): Self = StObject.set(x, "mac_vms", value.asInstanceOf[js.Any])
    
    inline def setMac_vmsUndefined: Self = StObject.set(x, "mac_vms", js.undefined)
    
    inline def setRds(value: Double): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
    
    inline def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
    
    inline def setVms(value: Double): Self = StObject.set(x, "vms", value.asInstanceOf[js.Any])
    
    inline def setVmsUndefined: Self = StObject.set(x, "vms", js.undefined)
  }
}
