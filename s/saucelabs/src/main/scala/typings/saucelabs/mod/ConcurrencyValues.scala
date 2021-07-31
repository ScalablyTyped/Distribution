package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcurrencyValues
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var id: js.UndefOr[String] = js.undefined
  
  var mac_vms: js.UndefOr[Double] = js.undefined
  
  var rds: js.UndefOr[Double] = js.undefined
  
  var vms: js.UndefOr[Double] = js.undefined
}
object ConcurrencyValues {
  
  @scala.inline
  def apply(): ConcurrencyValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConcurrencyValues]
  }
  
  @scala.inline
  implicit class ConcurrencyValuesMutableBuilder[Self <: ConcurrencyValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMac_vms(value: Double): Self = StObject.set(x, "mac_vms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac_vmsUndefined: Self = StObject.set(x, "mac_vms", js.undefined)
    
    @scala.inline
    def setRds(value: Double): Self = StObject.set(x, "rds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsUndefined: Self = StObject.set(x, "rds", js.undefined)
    
    @scala.inline
    def setVms(value: Double): Self = StObject.set(x, "vms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmsUndefined: Self = StObject.set(x, "vms", js.undefined)
  }
}
