package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideNonSelectableCategories extends StObject {
  
  var hideNonSelectableCategories: js.UndefOr[Boolean] = js.undefined
  
  var hidePricing: js.UndefOr[Boolean] = js.undefined
}
object HideNonSelectableCategories {
  
  inline def apply(): HideNonSelectableCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideNonSelectableCategories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HideNonSelectableCategories] (val x: Self) extends AnyVal {
    
    inline def setHideNonSelectableCategories(value: Boolean): Self = StObject.set(x, "hideNonSelectableCategories", value.asInstanceOf[js.Any])
    
    inline def setHideNonSelectableCategoriesUndefined: Self = StObject.set(x, "hideNonSelectableCategories", js.undefined)
    
    inline def setHidePricing(value: Boolean): Self = StObject.set(x, "hidePricing", value.asInstanceOf[js.Any])
    
    inline def setHidePricingUndefined: Self = StObject.set(x, "hidePricing", js.undefined)
  }
}
