package typings.seatsio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmSelectionOnMobile extends StObject {
  
  var confirmSelectionOnMobile: js.UndefOr[String] = js.undefined
  
  var showActionHint: js.UndefOr[Boolean] = js.undefined
  
  var showAvailability: js.UndefOr[Boolean] = js.undefined
  
  var showCategory: js.UndefOr[Boolean] = js.undefined
  
  var showLabel: js.UndefOr[Boolean] = js.undefined
  
  var showPricing: js.UndefOr[Boolean] = js.undefined
  
  var showUnavailableNotice: js.UndefOr[Boolean] = js.undefined
  
  var stylizedLabel: js.UndefOr[Boolean] = js.undefined
}
object ConfirmSelectionOnMobile {
  
  inline def apply(): ConfirmSelectionOnMobile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSelectionOnMobile]
  }
  
  extension [Self <: ConfirmSelectionOnMobile](x: Self) {
    
    inline def setConfirmSelectionOnMobile(value: String): Self = StObject.set(x, "confirmSelectionOnMobile", value.asInstanceOf[js.Any])
    
    inline def setConfirmSelectionOnMobileUndefined: Self = StObject.set(x, "confirmSelectionOnMobile", js.undefined)
    
    inline def setShowActionHint(value: Boolean): Self = StObject.set(x, "showActionHint", value.asInstanceOf[js.Any])
    
    inline def setShowActionHintUndefined: Self = StObject.set(x, "showActionHint", js.undefined)
    
    inline def setShowAvailability(value: Boolean): Self = StObject.set(x, "showAvailability", value.asInstanceOf[js.Any])
    
    inline def setShowAvailabilityUndefined: Self = StObject.set(x, "showAvailability", js.undefined)
    
    inline def setShowCategory(value: Boolean): Self = StObject.set(x, "showCategory", value.asInstanceOf[js.Any])
    
    inline def setShowCategoryUndefined: Self = StObject.set(x, "showCategory", js.undefined)
    
    inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
    
    inline def setShowPricing(value: Boolean): Self = StObject.set(x, "showPricing", value.asInstanceOf[js.Any])
    
    inline def setShowPricingUndefined: Self = StObject.set(x, "showPricing", js.undefined)
    
    inline def setShowUnavailableNotice(value: Boolean): Self = StObject.set(x, "showUnavailableNotice", value.asInstanceOf[js.Any])
    
    inline def setShowUnavailableNoticeUndefined: Self = StObject.set(x, "showUnavailableNotice", js.undefined)
    
    inline def setStylizedLabel(value: Boolean): Self = StObject.set(x, "stylizedLabel", value.asInstanceOf[js.Any])
    
    inline def setStylizedLabelUndefined: Self = StObject.set(x, "stylizedLabel", js.undefined)
  }
}
