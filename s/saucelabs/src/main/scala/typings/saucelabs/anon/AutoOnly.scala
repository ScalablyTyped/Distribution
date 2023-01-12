package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoOnly extends StObject {
  
  var autoOnly: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var full: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var manualOnly: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var owner: js.UndefOr[String] = js.undefined
  
  var ownerType: js.UndefOr[String] = js.undefined
  
  var subaccounts: js.UndefOr[Boolean] = js.undefined
  
  var to: js.UndefOr[Double] = js.undefined
}
object AutoOnly {
  
  inline def apply(): AutoOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoOnly] (val x: Self) extends AnyVal {
    
    inline def setAutoOnly(value: Boolean): Self = StObject.set(x, "autoOnly", value.asInstanceOf[js.Any])
    
    inline def setAutoOnlyUndefined: Self = StObject.set(x, "autoOnly", js.undefined)
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setManualOnly(value: Boolean): Self = StObject.set(x, "manualOnly", value.asInstanceOf[js.Any])
    
    inline def setManualOnlyUndefined: Self = StObject.set(x, "manualOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerType(value: String): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
    
    inline def setOwnerTypeUndefined: Self = StObject.set(x, "ownerType", js.undefined)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSubaccounts(value: Boolean): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    inline def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
