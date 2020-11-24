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
trait CommonProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var cursorStyle: js.UndefOr[String] = js.native
  
  var imageAlt: js.UndefOr[String] = js.native
  
  var imageSrc: String = js.native
  
  var largeImageSrc: js.UndefOr[String] = js.native
  
  var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, ReactNode]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object CommonProps {
  
  @scala.inline
  def apply(imageSrc: String): CommonProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
  
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
    
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
    def setRenderOverlay(value: /* state */ Boolean => ReactNode): Self = this.set("renderOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderOverlay: Self = this.set("renderOverlay", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
