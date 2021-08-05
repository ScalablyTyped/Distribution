package typings.rockset.mod

import typings.rockset.rocksetStrings.ACTIVE
import typings.rockset.rocksetStrings.BASIC
import typings.rockset.rocksetStrings.DELETED
import typings.rockset.rocksetStrings.ENTERPRISE
import typings.rockset.rocksetStrings.FREE
import typings.rockset.rocksetStrings.PRO
import typings.rockset.rocksetStrings.TRIAL
import typings.rockset.rocksetStrings.TRIAL_EXPIRED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  // name of the company
  var company_name: js.UndefOr[String] = js.undefined
  
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.undefined
  
  // name of the organization
  var display_name: js.UndefOr[String] = js.undefined
  
  // unique identifier for the organization
  var id: js.UndefOr[String] = js.undefined
  
  // number of QCUs
  var qcu: js.UndefOr[Double] = js.undefined
  
  // org state
  var state: js.UndefOr[ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED] = js.undefined
  
  // pricing tier
  var tier: js.UndefOr[FREE | BASIC | PRO | ENTERPRISE] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setCompany_name(value: String): Self = StObject.set(x, "company_name", value.asInstanceOf[js.Any])
    
    inline def setCompany_nameUndefined: Self = StObject.set(x, "company_name", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setQcu(value: Double): Self = StObject.set(x, "qcu", value.asInstanceOf[js.Any])
    
    inline def setQcuUndefined: Self = StObject.set(x, "qcu", js.undefined)
    
    inline def setState(value: ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTier(value: FREE | BASIC | PRO | ENTERPRISE): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
