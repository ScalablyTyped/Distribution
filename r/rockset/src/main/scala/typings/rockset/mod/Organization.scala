package typings.rockset.mod

import typings.rockset.rocksetStrings.ACTIVE
import typings.rockset.rocksetStrings.BASIC
import typings.rockset.rocksetStrings.DELETED
import typings.rockset.rocksetStrings.ENTERPRISE
import typings.rockset.rocksetStrings.FREE
import typings.rockset.rocksetStrings.PRO
import typings.rockset.rocksetStrings.TRIAL
import typings.rockset.rocksetStrings.TRIAL_EXPIRED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Organization extends js.Object {
  
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
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompany_name(value: String): Self = this.set("company_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany_name: Self = this.set("company_name", js.undefined)
    
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setQcu(value: Double): Self = this.set("qcu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQcu: Self = this.set("qcu", js.undefined)
    
    @scala.inline
    def setState(value: ACTIVE | TRIAL | TRIAL_EXPIRED | DELETED): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTier(value: FREE | BASIC | PRO | ENTERPRISE): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
  }
}
