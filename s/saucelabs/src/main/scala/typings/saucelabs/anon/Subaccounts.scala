package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subaccounts extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var subaccounts: js.UndefOr[Boolean] = js.undefined
}
object Subaccounts {
  
  inline def apply(): Subaccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subaccounts]
  }
  
  extension [Self <: Subaccounts](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setSubaccounts(value: Boolean): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
    
    inline def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
  }
}
