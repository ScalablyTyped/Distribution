package typings.saucelabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoOnly extends js.Object {
  
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
  implicit class AutoOnlyOps[Self <: AutoOnly] (val x: Self) extends AnyVal {
    
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
    def setAutoOnly(value: Boolean): Self = this.set("autoOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOnly: Self = this.set("autoOnly", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setManualOnly(value: Boolean): Self = this.set("manualOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualOnly: Self = this.set("manualOnly", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerType(value: String): Self = this.set("ownerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerType: Self = this.set("ownerType", js.undefined)
    
    @scala.inline
    def setSubaccounts(value: Boolean): Self = this.set("subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccounts: Self = this.set("subaccounts", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
