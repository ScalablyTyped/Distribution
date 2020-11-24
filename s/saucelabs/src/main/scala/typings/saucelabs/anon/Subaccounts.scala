package typings.saucelabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subaccounts extends js.Object {
  
  var limit: js.UndefOr[Double] = js.native
  
  var subaccounts: js.UndefOr[Boolean] = js.native
}
object Subaccounts {
  
  @scala.inline
  def apply(): Subaccounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subaccounts]
  }
  
  @scala.inline
  implicit class SubaccountsOps[Self <: Subaccounts] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setSubaccounts(value: Boolean): Self = this.set("subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccounts: Self = this.set("subaccounts", js.undefined)
  }
}
