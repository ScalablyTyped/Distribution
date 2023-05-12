package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchasingCompany extends StObject {
  
  var company: Company
  
  var contact: js.UndefOr[CompanyContact] = js.undefined
  
  var location: CompanyLocation
}
object PurchasingCompany {
  
  inline def apply(company: Company, location: CompanyLocation): PurchasingCompany = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchasingCompany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PurchasingCompany] (val x: Self) extends AnyVal {
    
    inline def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setContact(value: CompanyContact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setLocation(value: CompanyLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
