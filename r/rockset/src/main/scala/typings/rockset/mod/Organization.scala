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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Organization extends StObject {
  
  // name of the company
  var company_name: js.UndefOr[String] = js.native
  
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.native
  
  // name of the organization
  var display_name: js.UndefOr[String] = js.native
  
  // unique identifier for the organization
  var id: js.UndefOr[String] = js.native
  
  // number of QCUs
  var qcu: js.UndefOr[Double] = js.native
  
  // org state
  var state: js.UndefOr[ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED] = js.native
  
  // pricing tier
  var tier: js.UndefOr[FREE | BASIC | PRO | ENTERPRISE] = js.native
}
object Organization {
  
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  @scala.inline
  implicit class OrganizationMutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany_name(value: String): Self = StObject.set(x, "company_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany_nameUndefined: Self = StObject.set(x, "company_name", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setQcu(value: Double): Self = StObject.set(x, "qcu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQcuUndefined: Self = StObject.set(x, "qcu", js.undefined)
    
    @scala.inline
    def setState(value: ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTier(value: FREE | BASIC | PRO | ENTERPRISE): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
