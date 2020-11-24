package typings.reactJoyride.mod

import typings.react.mod.CSSProperties
import typings.reactJoyride.anon.ArrowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends js.Object {
  
  var beacon: js.UndefOr[CSSProperties] = js.native
  
  var beaconInner: js.UndefOr[CSSProperties] = js.native
  
  var beaconOuter: js.UndefOr[CSSProperties] = js.native
  
  var buttonBack: js.UndefOr[CSSProperties] = js.native
  
  var buttonClose: js.UndefOr[CSSProperties] = js.native
  
  var buttonNext: js.UndefOr[CSSProperties] = js.native
  
  var buttonSkip: js.UndefOr[CSSProperties] = js.native
  
  var options: js.UndefOr[ArrowColor] = js.native
  
  var overlay: js.UndefOr[CSSProperties] = js.native
  
  var overlayLegacy: js.UndefOr[CSSProperties] = js.native
  
  var overlayLegacyCenter: js.UndefOr[CSSProperties] = js.native
  
  var spotlight: js.UndefOr[CSSProperties] = js.native
  
  var spotlightLegacy: js.UndefOr[CSSProperties] = js.native
  
  var tooltip: js.UndefOr[CSSProperties] = js.native
  
  var tooltipContainer: js.UndefOr[CSSProperties] = js.native
  
  var tooltipContent: js.UndefOr[CSSProperties] = js.native
  
  var tooltipFooter: js.UndefOr[CSSProperties] = js.native
  
  var tooltipFooterSpacer: js.UndefOr[CSSProperties] = js.native
  
  var tooltipTitle: js.UndefOr[CSSProperties] = js.native
}
object Styles {
  
  @scala.inline
  def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    
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
    def setBeacon(value: CSSProperties): Self = this.set("beacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeacon: Self = this.set("beacon", js.undefined)
    
    @scala.inline
    def setBeaconInner(value: CSSProperties): Self = this.set("beaconInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconInner: Self = this.set("beaconInner", js.undefined)
    
    @scala.inline
    def setBeaconOuter(value: CSSProperties): Self = this.set("beaconOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeaconOuter: Self = this.set("beaconOuter", js.undefined)
    
    @scala.inline
    def setButtonBack(value: CSSProperties): Self = this.set("buttonBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonBack: Self = this.set("buttonBack", js.undefined)
    
    @scala.inline
    def setButtonClose(value: CSSProperties): Self = this.set("buttonClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonClose: Self = this.set("buttonClose", js.undefined)
    
    @scala.inline
    def setButtonNext(value: CSSProperties): Self = this.set("buttonNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonNext: Self = this.set("buttonNext", js.undefined)
    
    @scala.inline
    def setButtonSkip(value: CSSProperties): Self = this.set("buttonSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonSkip: Self = this.set("buttonSkip", js.undefined)
    
    @scala.inline
    def setOptions(value: ArrowColor): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setOverlay(value: CSSProperties): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setOverlayLegacy(value: CSSProperties): Self = this.set("overlayLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayLegacy: Self = this.set("overlayLegacy", js.undefined)
    
    @scala.inline
    def setOverlayLegacyCenter(value: CSSProperties): Self = this.set("overlayLegacyCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayLegacyCenter: Self = this.set("overlayLegacyCenter", js.undefined)
    
    @scala.inline
    def setSpotlight(value: CSSProperties): Self = this.set("spotlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotlight: Self = this.set("spotlight", js.undefined)
    
    @scala.inline
    def setSpotlightLegacy(value: CSSProperties): Self = this.set("spotlightLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotlightLegacy: Self = this.set("spotlightLegacy", js.undefined)
    
    @scala.inline
    def setTooltip(value: CSSProperties): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipContainer(value: CSSProperties): Self = this.set("tooltipContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipContainer: Self = this.set("tooltipContainer", js.undefined)
    
    @scala.inline
    def setTooltipContent(value: CSSProperties): Self = this.set("tooltipContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipContent: Self = this.set("tooltipContent", js.undefined)
    
    @scala.inline
    def setTooltipFooter(value: CSSProperties): Self = this.set("tooltipFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipFooter: Self = this.set("tooltipFooter", js.undefined)
    
    @scala.inline
    def setTooltipFooterSpacer(value: CSSProperties): Self = this.set("tooltipFooterSpacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipFooterSpacer: Self = this.set("tooltipFooterSpacer", js.undefined)
    
    @scala.inline
    def setTooltipTitle(value: CSSProperties): Self = this.set("tooltipTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTitle: Self = this.set("tooltipTitle", js.undefined)
  }
}
