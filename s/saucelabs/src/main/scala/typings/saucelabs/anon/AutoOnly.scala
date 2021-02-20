package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoOnly extends StObject {
  
  var autoOnly: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var full: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var manualOnly: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var owner: js.UndefOr[String] = js.native
  
  var ownerType: js.UndefOr[String] = js.native
  
  var subaccounts: js.UndefOr[Boolean] = js.native
  
  var to: js.UndefOr[Double] = js.native
}
object AutoOnly {
  
  @scala.inline
  def apply(): AutoOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoOnly]
  }
  
  @scala.inline
  implicit class AutoOnlyMutableBuilder[Self <: AutoOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOnly(value: Boolean): Self = StObject.set(x, "autoOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOnlyUndefined: Self = StObject.set(x, "autoOnly", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setManualOnly(value: Boolean): Self = StObject.set(x, "manualOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualOnlyUndefined: Self = StObject.set(x, "manualOnly", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerType(value: String): Self = StObject.set(x, "ownerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerTypeUndefined: Self = StObject.set(x, "ownerType", js.undefined)
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSubaccounts(value: Boolean): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
