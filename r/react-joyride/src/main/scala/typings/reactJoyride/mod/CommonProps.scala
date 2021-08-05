package typings.reactJoyride.mod

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonProps extends StObject {
  
  var beaconComponent: js.UndefOr[ElementType[BeaconRenderProps]] = js.undefined
  
  var disableCloseOnEsc: js.UndefOr[Boolean] = js.undefined
  
  var disableOverlay: js.UndefOr[Boolean] = js.undefined
  
  var disableOverlayClose: js.UndefOr[Boolean] = js.undefined
  
  var disableScrollParentFix: js.UndefOr[Boolean] = js.undefined
  
  var disableScrolling: js.UndefOr[Boolean] = js.undefined
  
  var floaterProps: js.UndefOr[FloaterProps] = js.undefined
  
  var hideBackButton: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[Locale] = js.undefined
  
  var showProgress: js.UndefOr[Boolean] = js.undefined
  
  var showSkipButton: js.UndefOr[Boolean] = js.undefined
  
  var spotlightClicks: js.UndefOr[Boolean] = js.undefined
  
  var spotlightPadding: js.UndefOr[Double] = js.undefined
  
  var styles: js.UndefOr[Styles] = js.undefined
  
  var tooltipComponent: js.UndefOr[ElementType[TooltipRenderProps]] = js.undefined
}
object CommonProps {
  
  inline def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  
  extension [Self <: CommonProps](x: Self) {
    
    inline def setBeaconComponent(value: ElementType[BeaconRenderProps]): Self = StObject.set(x, "beaconComponent", value.asInstanceOf[js.Any])
    
    inline def setBeaconComponentUndefined: Self = StObject.set(x, "beaconComponent", js.undefined)
    
    inline def setDisableCloseOnEsc(value: Boolean): Self = StObject.set(x, "disableCloseOnEsc", value.asInstanceOf[js.Any])
    
    inline def setDisableCloseOnEscUndefined: Self = StObject.set(x, "disableCloseOnEsc", js.undefined)
    
    inline def setDisableOverlay(value: Boolean): Self = StObject.set(x, "disableOverlay", value.asInstanceOf[js.Any])
    
    inline def setDisableOverlayClose(value: Boolean): Self = StObject.set(x, "disableOverlayClose", value.asInstanceOf[js.Any])
    
    inline def setDisableOverlayCloseUndefined: Self = StObject.set(x, "disableOverlayClose", js.undefined)
    
    inline def setDisableOverlayUndefined: Self = StObject.set(x, "disableOverlay", js.undefined)
    
    inline def setDisableScrollParentFix(value: Boolean): Self = StObject.set(x, "disableScrollParentFix", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollParentFixUndefined: Self = StObject.set(x, "disableScrollParentFix", js.undefined)
    
    inline def setDisableScrolling(value: Boolean): Self = StObject.set(x, "disableScrolling", value.asInstanceOf[js.Any])
    
    inline def setDisableScrollingUndefined: Self = StObject.set(x, "disableScrolling", js.undefined)
    
    inline def setFloaterProps(value: FloaterProps): Self = StObject.set(x, "floaterProps", value.asInstanceOf[js.Any])
    
    inline def setFloaterPropsUndefined: Self = StObject.set(x, "floaterProps", js.undefined)
    
    inline def setHideBackButton(value: Boolean): Self = StObject.set(x, "hideBackButton", value.asInstanceOf[js.Any])
    
    inline def setHideBackButtonUndefined: Self = StObject.set(x, "hideBackButton", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setShowProgress(value: Boolean): Self = StObject.set(x, "showProgress", value.asInstanceOf[js.Any])
    
    inline def setShowProgressUndefined: Self = StObject.set(x, "showProgress", js.undefined)
    
    inline def setShowSkipButton(value: Boolean): Self = StObject.set(x, "showSkipButton", value.asInstanceOf[js.Any])
    
    inline def setShowSkipButtonUndefined: Self = StObject.set(x, "showSkipButton", js.undefined)
    
    inline def setSpotlightClicks(value: Boolean): Self = StObject.set(x, "spotlightClicks", value.asInstanceOf[js.Any])
    
    inline def setSpotlightClicksUndefined: Self = StObject.set(x, "spotlightClicks", js.undefined)
    
    inline def setSpotlightPadding(value: Double): Self = StObject.set(x, "spotlightPadding", value.asInstanceOf[js.Any])
    
    inline def setSpotlightPaddingUndefined: Self = StObject.set(x, "spotlightPadding", js.undefined)
    
    inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTooltipComponent(value: ElementType[TooltipRenderProps]): Self = StObject.set(x, "tooltipComponent", value.asInstanceOf[js.Any])
    
    inline def setTooltipComponentUndefined: Self = StObject.set(x, "tooltipComponent", js.undefined)
  }
}
