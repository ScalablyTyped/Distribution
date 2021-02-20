package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideNonSelectableCategories extends StObject {
  
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
  implicit class HideNonSelectableCategoriesMutableBuilder[Self <: HideNonSelectableCategories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideNonSelectableCategories(value: Boolean): Self = StObject.set(x, "hideNonSelectableCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideNonSelectableCategoriesUndefined: Self = StObject.set(x, "hideNonSelectableCategories", js.undefined)
    
    @scala.inline
    def setHidePricing(value: Boolean): Self = StObject.set(x, "hidePricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidePricingUndefined: Self = StObject.set(x, "hidePricing", js.undefined)
  }
}
