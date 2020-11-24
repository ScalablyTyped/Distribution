package typings.seatsio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideNonSelectableCategories extends js.Object {
  
  var hideNonSelectableCategories: js.UndefOr[Boolean] = js.native
  
  var hidePricing: js.UndefOr[Boolean] = js.native
}
object HideNonSelectableCategories {
  
  @scala.inline
  def apply(): HideNonSelectableCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideNonSelectableCategories]
  }
  
  @scala.inline
  implicit class HideNonSelectableCategoriesOps[Self <: HideNonSelectableCategories] (val x: Self) extends AnyVal {
    
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
    def setHideNonSelectableCategories(value: Boolean): Self = this.set("hideNonSelectableCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideNonSelectableCategories: Self = this.set("hideNonSelectableCategories", js.undefined)
    
    @scala.inline
    def setHidePricing(value: Boolean): Self = this.set("hidePricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePricing: Self = this.set("hidePricing", js.undefined)
  }
}
