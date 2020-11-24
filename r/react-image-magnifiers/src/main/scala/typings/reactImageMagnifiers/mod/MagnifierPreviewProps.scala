package typings.reactImageMagnifiers.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MagnifierPreviewProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var cursorStyle: js.UndefOr[String] = js.native
  
  var imageAlt: js.UndefOr[String] = js.native
  
  var imageSrc: String = js.native
  
  var largeImageSrc: js.UndefOr[String] = js.native
  
  var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overlayBackgroundColor: js.UndefOr[Double] = js.native
  
  var overlayBoxColor: js.UndefOr[Double] = js.native
  
  var overlayBoxImage: js.UndefOr[Double] = js.native
  
  var overlayBoxImageSize: js.UndefOr[Double] = js.native
  
  var overlayBoxOpacity: js.UndefOr[Double] = js.native
  
  var overlayOpacity: js.UndefOr[Double] = js.native
  
  var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, ReactNode]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var transitionSpeed: js.UndefOr[Double] = js.native
}
object MagnifierPreviewProps {
  
  @scala.inline
  def apply(imageSrc: String): MagnifierPreviewProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierPreviewProps]
  }
  
  @scala.inline
  implicit class MagnifierPreviewPropsOps[Self <: MagnifierPreviewProps] (val x: Self) extends AnyVal {
    
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
    def setImageSrc(value: String): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCursorStyle(value: String): Self = this.set("cursorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorStyle: Self = this.set("cursorStyle", js.undefined)
    
    @scala.inline
    def setImageAlt(value: String): Self = this.set("imageAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageAlt: Self = this.set("imageAlt", js.undefined)
    
    @scala.inline
    def setLargeImageSrc(value: String): Self = this.set("largeImageSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLargeImageSrc: Self = this.set("largeImageSrc", js.undefined)
    
    @scala.inline
    def setOnImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnImageLoad: Self = this.set("onImageLoad", js.undefined)
    
    @scala.inline
    def setOnLargeImageLoad(value: /* ev */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onLargeImageLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLargeImageLoad: Self = this.set("onLargeImageLoad", js.undefined)
    
    @scala.inline
    def setOnZoomEnd(value: () => Unit): Self = this.set("onZoomEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnZoomEnd: Self = this.set("onZoomEnd", js.undefined)
    
    @scala.inline
    def setOnZoomStart(value: () => Unit): Self = this.set("onZoomStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnZoomStart: Self = this.set("onZoomStart", js.undefined)
    
    @scala.inline
    def setOverlayBackgroundColor(value: Double): Self = this.set("overlayBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBackgroundColor: Self = this.set("overlayBackgroundColor", js.undefined)
    
    @scala.inline
    def setOverlayBoxColor(value: Double): Self = this.set("overlayBoxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBoxColor: Self = this.set("overlayBoxColor", js.undefined)
    
    @scala.inline
    def setOverlayBoxImage(value: Double): Self = this.set("overlayBoxImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayBoxImage: Self = this.set("overlayBoxImage", js.undefined)
    
    @scala.inline
    def setOverlayBoxImageSize(value: Double): Self = this.set("overlayBoxImageSize", value.asInstanceOf[js.Any])
    
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
    def setRenderOverlay(value: /* state */ Boolean => ReactNode): Self = this.set("renderOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderOverlay: Self = this.set("renderOverlay", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTransitionSpeed(value: Double): Self = this.set("transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpeed: Self = this.set("transitionSpeed", js.undefined)
  }
}
