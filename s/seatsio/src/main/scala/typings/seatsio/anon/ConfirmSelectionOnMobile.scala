package typings.seatsio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmSelectionOnMobile extends js.Object {
  
  var confirmSelectionOnMobile: js.UndefOr[String] = js.native
  
  var showActionHint: js.UndefOr[Boolean] = js.native
  
  var showAvailability: js.UndefOr[Boolean] = js.native
  
  var showCategory: js.UndefOr[Boolean] = js.native
  
  var showLabel: js.UndefOr[Boolean] = js.native
  
  var showPricing: js.UndefOr[Boolean] = js.native
  
  var showUnavailableNotice: js.UndefOr[Boolean] = js.native
  
  var stylizedLabel: js.UndefOr[Boolean] = js.native
}
object ConfirmSelectionOnMobile {
  
  @scala.inline
  def apply(): ConfirmSelectionOnMobile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSelectionOnMobile]
  }
  
  @scala.inline
  implicit class ConfirmSelectionOnMobileOps[Self <: ConfirmSelectionOnMobile] (val x: Self) extends AnyVal {
    
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
    def setConfirmSelectionOnMobile(value: String): Self = this.set("confirmSelectionOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmSelectionOnMobile: Self = this.set("confirmSelectionOnMobile", js.undefined)
    
    @scala.inline
    def setShowActionHint(value: Boolean): Self = this.set("showActionHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowActionHint: Self = this.set("showActionHint", js.undefined)
    
    @scala.inline
    def setShowAvailability(value: Boolean): Self = this.set("showAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAvailability: Self = this.set("showAvailability", js.undefined)
    
    @scala.inline
    def setShowCategory(value: Boolean): Self = this.set("showCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCategory: Self = this.set("showCategory", js.undefined)
    
    @scala.inline
    def setShowLabel(value: Boolean): Self = this.set("showLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLabel: Self = this.set("showLabel", js.undefined)
    
    @scala.inline
    def setShowPricing(value: Boolean): Self = this.set("showPricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPricing: Self = this.set("showPricing", js.undefined)
    
    @scala.inline
    def setShowUnavailableNotice(value: Boolean): Self = this.set("showUnavailableNotice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUnavailableNotice: Self = this.set("showUnavailableNotice", js.undefined)
    
    @scala.inline
    def setStylizedLabel(value: Boolean): Self = this.set("stylizedLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylizedLabel: Self = this.set("stylizedLabel", js.undefined)
  }
}
