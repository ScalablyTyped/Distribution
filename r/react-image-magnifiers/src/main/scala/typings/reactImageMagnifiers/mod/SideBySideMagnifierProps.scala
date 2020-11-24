package typings.reactImageMagnifiers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SideBySideMagnifierProps extends CommonProps {
  
  var alwaysInPlace: js.UndefOr[Boolean] = js.native
  
  var fillAlignTop: js.UndefOr[Boolean] = js.native
  
  var fillAvailableSpace: js.UndefOr[Boolean] = js.native
  
  var fillGapBottom: js.UndefOr[Double] = js.native
  
  var fillGapLeft: js.UndefOr[Double] = js.native
  
  var fillGapRight: js.UndefOr[Double] = js.native
  
  var fillGapTop: js.UndefOr[Double] = js.native
  
  var inPlaceMinBreakpoint: js.UndefOr[Double] = js.native
  
  var overlayBackgroundColor: js.UndefOr[String] = js.native
  
  var overlayBoxColor: js.UndefOr[String] = js.native
  
  var overlayBoxImage: js.UndefOr[String] = js.native
  
  var overlayBoxImageSize: js.UndefOr[String] = js.native
  
  var overlayBoxOpacity: js.UndefOr[Double] = js.native
  
  var overlayOpacity: js.UndefOr[Double] = js.native
  
  var switchSides: js.UndefOr[Boolean] = js.native
  
  var transitionSpeed: js.UndefOr[Double] = js.native
  
  var transitionSpeedInPlace: js.UndefOr[Double] = js.native
  
  var zoomContainerBorder: js.UndefOr[String] = js.native
  
  var zoomContainerBoxShadow: js.UndefOr[String] = js.native
}
object SideBySideMagnifierProps {
  
  @scala.inline
  def apply(imageSrc: String): SideBySideMagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideBySideMagnifierProps]
  }
  
  @scala.inline
  implicit class SideBySideMagnifierPropsOps[Self <: SideBySideMagnifierProps] (val x: Self) extends AnyVal {
    
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
    def setAlwaysInPlace(value: Boolean): Self = this.set("alwaysInPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysInPlace: Self = this.set("alwaysInPlace", js.undefined)
    
    @scala.inline
    def setFillAlignTop(value: Boolean): Self = this.set("fillAlignTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillAlignTop: Self = this.set("fillAlignTop", js.undefined)
    
    @scala.inline
    def setFillAvailableSpace(value: Boolean): Self = this.set("fillAvailableSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillAvailableSpace: Self = this.set("fillAvailableSpace", js.undefined)
    
    @scala.inline
    def setFillGapBottom(value: Double): Self = this.set("fillGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGapBottom: Self = this.set("fillGapBottom", js.undefined)
    
    @scala.inline
    def setFillGapLeft(value: Double): Self = this.set("fillGapLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGapLeft: Self = this.set("fillGapLeft", js.undefined)
    
    @scala.inline
    def setFillGapRight(value: Double): Self = this.set("fillGapRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGapRight: Self = this.set("fillGapRight", js.undefined)
    
    @scala.inline
    def setFillGapTop(value: Double): Self = this.set("fillGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillGapTop: Self = this.set("fillGapTop", js.undefined)
    
    @scala.inline
    def setInPlaceMinBreakpoint(value: Double): Self = this.set("inPlaceMinBreakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPlaceMinBreakpoint: Self = this.set("inPlaceMinBreakpoint", js.undefined)
    
    @scala.inline
    def setOverlayBackgroundColor(value: String): Self = this.set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBackgroundColor: Self = this.set("overlayBackgroundColor", js.undefined)
    
    @scala.inline
    def setOverlayBoxColor(value: String): Self = this.set("overlayBoxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBoxColor: Self = this.set("overlayBoxColor", js.undefined)
    
    @scala.inline
    def setOverlayBoxImage(value: String): Self = this.set("overlayBoxImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBoxImage: Self = this.set("overlayBoxImage", js.undefined)
    
    @scala.inline
    def setOverlayBoxImageSize(value: String): Self = this.set("overlayBoxImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBoxImageSize: Self = this.set("overlayBoxImageSize", js.undefined)
    
    @scala.inline
    def setOverlayBoxOpacity(value: Double): Self = this.set("overlayBoxOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBoxOpacity: Self = this.set("overlayBoxOpacity", js.undefined)
    
    @scala.inline
    def setOverlayOpacity(value: Double): Self = this.set("overlayOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayOpacity: Self = this.set("overlayOpacity", js.undefined)
    
    @scala.inline
    def setSwitchSides(value: Boolean): Self = this.set("switchSides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchSides: Self = this.set("switchSides", js.undefined)
    
    @scala.inline
    def setTransitionSpeed(value: Double): Self = this.set("transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpeed: Self = this.set("transitionSpeed", js.undefined)
    
    @scala.inline
    def setTransitionSpeedInPlace(value: Double): Self = this.set("transitionSpeedInPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpeedInPlace: Self = this.set("transitionSpeedInPlace", js.undefined)
    
    @scala.inline
    def setZoomContainerBorder(value: String): Self = this.set("zoomContainerBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomContainerBorder: Self = this.set("zoomContainerBorder", js.undefined)
    
    @scala.inline
    def setZoomContainerBoxShadow(value: String): Self = this.set("zoomContainerBoxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomContainerBoxShadow: Self = this.set("zoomContainerBoxShadow", js.undefined)
  }
}
