package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subaccounts extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var subaccounts: js.UndefOr[Boolean] = js.undefined
}
object Subaccounts {
  
  @scala.inline
  def apply(): Subaccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subaccounts]
  }
  
  @scala.inline
  implicit class SubaccountsMutableBuilder[Self <: Subaccounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setSubaccounts(value: Boolean): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
  }
}
